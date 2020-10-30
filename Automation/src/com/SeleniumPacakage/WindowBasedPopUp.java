package com.SeleniumPacakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBasedPopUp {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		//here you should write AutoIt script inorder to handle the print popup 
		
		
	}

}
