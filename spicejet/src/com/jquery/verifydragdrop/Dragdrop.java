package com.jquery.verifydragdrop;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.jquery.pages.jquerypage;

public class Dragdrop
{
	@Test
	public void dragdropM()
	{
		Logger log=Logger.getLogger("Dragdrop");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		log.info("Chrome launched");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		log.info("window maximized");
		
		driver.get("http://jqueryui.com/");
		
		log.info("site launched");
		
		jquerypage jp=new jquerypage(driver);
		
		jp.jqueryui1();
		
		log.info("navigating to Jquery UI Droppable link");
		
		jp.dropableLink2();
		
		log.info("Dropable link");
		
		jp.dropableObject3();
		
		log.info("Drag and drop operation");
		
		driver.quit();
	}
	
	
	
	
	
}
