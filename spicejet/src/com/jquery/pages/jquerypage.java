package com.jquery.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class jquerypage 
{
	
	WebDriver driver;
	
	public jquerypage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By jqueryui=By.linkText("jQuery UI");
	
	By dropableLink= By.linkText("Droppable");
	
	By drag=By.xpath("//*[@id='draggable']");
	
	By drop=By.xpath("//*[@id='droppable']");
	
	public void jqueryui1()
	{
		driver.findElement(jqueryui).click();
	}
	
	public void dropableLink2()
	{
		driver.findElement(dropableLink).click();
	}	
	
	public void dropableObject3()
	{
		WebElement e1= driver.findElement(drag);
		
		WebElement e2=driver.findElement(drop);
		
		Actions a= new Actions(driver);
		
		a.moveToElement(e1).build().perform();
		
		a.dragAndDrop(e1, e2).build().perform();
		
	}
	
	
}


