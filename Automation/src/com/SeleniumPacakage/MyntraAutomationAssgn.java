package com.SeleniumPacakage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAutomationAssgn {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement tab = driver.findElement(By.xpath("//span[.='Profile']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(tab).perform();
	driver.findElement(By.xpath("//a[.='login / Signup']")).click();
	Thread.sleep(3000);
	Set<String> wh = driver.getWindowHandles();
	for(String one:wh)
	{
		driver.switchTo().window(one).getTitle();
		
	}
	}

}
