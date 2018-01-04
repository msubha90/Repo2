package spicejetWT;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test01 
{

	public static void main(String[] args) throws Exception 
	{
		
		Logger log= Logger.getLogger("Tet01");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jquery.com/");
		
		log.info("site launched");
		
		driver.manage().window().maximize();
		
		log.info("browser maximized");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("Links are:" +links);
		
		log.info("Listing all weblinks");
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File ds=new File("F:\\mindQ\\jquery11.jpeg");
		
		FileUtils.copyFile(ss, ds);
		
		log.info("screenshot taken");
		
		WebElement e= driver.findElement(By.linkText("Browser Support"));
		
		int x= e.getLocation().getX();
		
		int y=e.getLocation().getY();
		
		System.out.println("Location is:"+x+" "+y);
		
		Actions a= new Actions(driver);
		
		a.moveByOffset(x, y).build().perform();
		
		log.info("Mouse move");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
