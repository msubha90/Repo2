package spicejetWT;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flight_Booking {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://book2.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		
		// Departure
		List<WebElement> wbfr=driver.findElements(By.xpath("//*[@id='citydropdown']//child::li"));
				
		for(WebElement src: wbfr)
		{
			if(src.getText().contains("BLR"))
			{
				src.click();
			}
		}
		
		//Arrival
		List<WebElement> wbto=driver.findElements(By.xpath("//*[@id='citydropdown']//child::li"));
		
		for(WebElement dest: wbto)
		{
			//System.out.println(dest.getText());
			if(dest.getText().contains("CCU"))
			{
				dest.click();
			}
		}
		
		
		//Depart date
		List<WebElement> ddates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//table//td"));
		
		int tdate=ddates.size();
		for(int i=0; i<tdate;i++)
		{
			String dt=ddates.get(i).getText();
			
			System.out.println(dt);
			
			if(dt.matches("28"))
			{
				ddates.get(i).click();
			}
		}
			
		
		//Arrival date
		List<WebElement> adates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//table//td"));
		
		int tdate1=adates.size();
		for(int i=0; i<tdate1;i++)
		{
			String dt1=adates.get(i).getText();
			
			System.out.println(dt1);
			
			if(dt1.matches("31"))
			{
				adates.get(i).click();
			}
		}
		
		
	}

}