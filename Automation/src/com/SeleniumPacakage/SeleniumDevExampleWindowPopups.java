package com.SeleniumPacakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDevExampleWindowPopups {
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@class='nav-item' and @href='/downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='link'and @href='https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip']")).click();				
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Runtime.getRuntime().exec("G:\\64bitAutomationSW\\OCSM11\\AutoIt\\sel.exe");
	}

}
