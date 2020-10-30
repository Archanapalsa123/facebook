package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2CopyPasteThroughSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");	
	WebElement untb = driver.findElement(By.name("username"));
	untb.sendKeys("admin");
	Thread.sleep(3000);
	untb.sendKeys(Keys.CONTROL,"a");
	untb.sendKeys(Keys.CONTROL,"c");
	Thread.sleep(3000);
	WebElement pwtb = driver.findElement(By.name("pwd"));
	pwtb.sendKeys(Keys.CONTROL,"v");
	

	}
	

}
