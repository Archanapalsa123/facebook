package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys("laptops");
		 //xpath for search button
		 driver.findElement(By.xpath("//button[@class='vh79eN' and @type='submit']")).click();
		 Thread.sleep(6000);
//		 
		 //xpath for core i3 check-box 
		 driver.findElement(By.xpath("//div[.='Core i3']/preceding-sibling::div[@class='_1p7h2j']")).click();
		 Thread.sleep(3000);
		 //xpath for Dell check-bax
		 driver.findElement(By.xpath("//div[.='Dell']/preceding-sibling::div[@class='_1p7h2j']")).click();
		 Thread.sleep(5000);
		 //xpath for Operating System division
		 driver.findElement(By.xpath("//div[.='Operating System']/ancestor::div[@class='_3xglSm _1iMC4O']")).click();
		 Thread.sleep(2000);
		 //xpath for winows 10 operating system
		 driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_1p7h2j']")).click();
		 WebElement ddAddr = driver.findElement(By.xpath("//div[@class='_1YoBfV']/select[@class='fPjUPw']"));
		 Select sel=new Select(ddAddr);
		 sel.selectByIndex(3);
		 
		 
		 
		
				 
	}

}
