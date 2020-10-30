package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Archana/OneDrive/Desktop/third.html");
		Thread.sleep(5000);
	//	WebElement htmladd=driver.findElement(By.tagName("h2"));
		//System.out.println(htmladd);
		//Thread.sleep(5000);
	//  	driver.findElement(By.id("id1")).click();
		//driver.findElement(By.name("palak paneer")).click();
		//driver.findElement(By.className("sweets")).click();
		//driver.findElement(By.linkText("GULAB JAMUN")).click();
		//driver.findElement(By.partialLinkText("BIR")).click();
		driver.findElement(By.cssSelector("a[name='palak paneer']")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/ol/li[1]/a[1]")).click();//absolute xpath
		//driver.findElement(By.xpath("//li[1]/a[1]")).click();//Relative xpath
		
		
		

	}

}
