package com.SeleniumPacakage;

import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/?ref_=nav_em_hd_re_signin&returnFromLogin=1&");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium books");
	
	 driver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']")).click();
	
	 driver.findElement(By.xpath("//li[@class='a-last']")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Testing')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[.='Under ₹100']")).click();
	 Thread.sleep(3000);
 driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71gLBBfQXCL._AC_UY218_.jpg']")).click();
 Set<String> allwhs = driver.getWindowHandles();
	 for(String onewh:allwhs)
	 {
		 String title = driver.getTitle();
		 if(title.contains("Selenium Automation"))
		 {
			 driver.switchTo().window(onewh);
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@id='checkout-button']")).click();
		 }
	 }	
	 

	}

}
