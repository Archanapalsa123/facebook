package com.SeleniumPacakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class HandlingMouseAndKeyboardActions {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	WebElement wms = driver.findElement(By.xpath("//span[.='Women']"));
	Thread.sleep(3000);
	Actions ac=new Actions(driver);
	ac.moveToElement(wms).perform();
	Thread.sleep(5000);
	WebElement hh = driver.findElement(By.xpath("//a[.='Dresses' and @title='Dresses']"));
	System.out.println(hh.isEnabled());
	Thread.sleep(3000);
	hh.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='_3togXc']")).click();
	Thread.sleep(7000);
	Set<String> wh = driver.getWindowHandles();
	for(String one:wh)
	{	String title=driver.switchTo().window(one).getTitle();
		if(title.contains("Dresses Online"))
		{
		continue;
	}
	else
	{
		driver.switchTo().window(one);
	}
}
	driver.findElement(By.xpath("//a[.='M']")).click();
	Thread.sleep(5000);
	WebElement dr = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
	Thread.sleep(3000);
	dr.click();
	Thread.sleep(6000);
	String title = driver.getTitle();
	if(title.contains("Shopping"))
	{
		System.out.println("adding to cart is succesful");
	}
	TakesScreenshot ss = (TakesScreenshot)driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File dest=new File("G:\\64bitAutomationSW\\OCSM11\\screenshots\\flippy.png");
	Files.copy(src, dest);
//Double clicking through actions actions class
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://desktop-o3tflbk:81/login.do");
//		Thread.sleep(2000);
//		WebElement untb = driver.findElement(By.name("username"));
//		untb.sendKeys("username");
//		Actions ac=new Actions(driver);
//		Thread.sleep(3000);
//		ac.doubleClick(untb).perform();
////clearing the text with WebElement clear() method.
//		untb.clear();
		
		
//so i thought robot class also will do the same thing like if we press control+A it will select and if Control+X it will clear but its not like that
//instead it will enter whatever you are passing after VK like in this example ---usernameax		
//		Thread.sleep(3000);
//		Robot ab=new Robot();
//		ab.keyPress(KeyEvent.VK_A);
//		Thread.sleep(2000);
//		ab.keyPress(KeyEvent.VK_X);
//		ab.keyRelease(KeyEvent.VK_A);
//		ab.keyRelease(KeyEvent.VK_X);
//		untb.clear();
//performing right click and handling right clicked options
//		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
//		 WebDriver driver=new FirefoxDriver();
//		 driver.get("file:///C:/Users/Archana/OneDrive/Desktop/newthrid.html");
////performing right click randomly after opening the webpage
//		 Actions cc=new Actions(driver);	 
//		 cc.contextClick().perform();
//		 Robot rb=new Robot();
//		 rb.keyPress(KeyEvent.VK_Q);
//		 rb.keyRelease(KeyEvent.VK_Q);
//////performing right click on the particular element on the webpage
//		 Thread.sleep(5000);
//		 WebElement keema = driver.findElement(By.id("id1"));
//		 Actions cc1=new Actions(driver);	 
//		 cc1.contextClick(keema).perform();
//		 Robot rb1=new Robot();
//		 rb1.keyPress(KeyEvent.VK_Q);
//		 rb1.keyRelease(KeyEvent.VK_Q);
//		 
	
}
}
		 