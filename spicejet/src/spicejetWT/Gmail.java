package spicejetWT;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\mindQ\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/b/0/AddMailService");
		
		driver.findElement(By.id("identifierId")).sendKeys("subhajit.coolboy");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("omm12345", Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=':141']")).sendKeys("suvendu.7033@gmail.com", Keys.TAB, "Resume");
		
		driver.findElement(By.xpath("//*[@id=':158']")).click();
		
		Thread.sleep(5000);
		
		Robot r=new Robot();
				
		StringSelection s1=new StringSelection("C:\\Users\\MONTY\\Desktop\\New Folder\\Quotes.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=':13a']")).click();
		
		Thread.sleep(5000);
		
		
	}

}
