package spicejetWT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		
		WebElement e=driver.findElement(By.id("gs_htif0"));
		
		Actions a=new Actions(driver);
		
		a.click(e).sendKeys("kalam").build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(2000);
		
		a.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(2000);
		
		a.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(2000);
		
		a.sendKeys(Keys.DOWN).build().perform();
		
		Thread.sleep(2000);
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		
		js.executeScript("document.getElementByPartialLinkText('Kalyani Kala Mandir, Bannerghatta Road').scrollIntoView();");
		
		
		
		
		
		
		
		
		
	}

}
