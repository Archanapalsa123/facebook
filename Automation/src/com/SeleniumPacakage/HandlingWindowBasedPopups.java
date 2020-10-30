package com.SeleniumPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowBasedPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("archanagoud888@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Archana@123");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='_1qv9']/descendant::span[.='Arçhäñå']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(""));
	
	
	

	}

}
