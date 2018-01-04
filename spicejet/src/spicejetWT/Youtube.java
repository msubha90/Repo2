package spicejetWT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com");
					
		driver.findElement(By.id("masthead-search-term")).sendKeys("rangabati", Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Rangabati - Ram Sampath")).click();
		
		Thread.sleep(5000);
		
		Screen s=new Screen();
		
		Location l=new Location(500,500);
		
		s.wheel(l, Button.LEFT	, 0);
		
		s.click("F:\\mindQ\\sikuli images\\pause.PNG");
		
		Thread.sleep(10000);
		
		s.wheel(l, Button.LEFT	, 0);
		
		s.click("F:\\mindQ\\sikuli images\\play.PNG");
		
		Thread.sleep(10000);
		
		s.wheel(l, Button.LEFT	, 0);
		
		s.mouseMove("F:\\mindQ\\sikuli images\\volume.PNG");
		
		Match e=s.find("F:\\mindQ\\sikuli images\\vol_up.PNG");
		
		Location el1=new Location (e.getX()-10, e.getY());
		
		s.dragDrop(e, el1);
		
		Thread.sleep(5000);
		
		s.wheel(l, Button.LEFT	, 0);
		
		s.mouseMove("F:\\mindQ\\sikuli images\\volume.PNG");
		
		Location el2=new Location (e.getX()+10, e.getY());
		
		s.dragDrop(e, el2);
		
		Thread.sleep(5000);
		
		s.click("F:\\mindQ\\sikuli images\\maxmize.PNG");
		
		Thread.sleep(10000);
		
		s.click("F:\\mindQ\\sikuli images\\restore.PNG");
		
		Thread.sleep(10000);
		
		s.click("F:\\mindQ\\sikuli images\\close.PNG");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
