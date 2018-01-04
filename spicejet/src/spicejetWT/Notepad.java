package spicejetWT;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;

public class Notepad {

	public static void main(String[] args) throws Exception {

		Runtime.getRuntime().exec("notepad.exe");
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		StringSelection s1=new StringSelection("Notepad program");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		StringSelection s2=new StringSelection("D:\\new\\mmm.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		
		
		
		
    	
        
	}

}