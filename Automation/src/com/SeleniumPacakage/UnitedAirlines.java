package com.SeleniumPacakage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class UnitedAirlines {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.cleartrip.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement ddAddr = driver.findElement(By.id("FromTag"));
		 ddAddr.sendKeys("Del");
		 Thread.sleep(5000);
		 List<WebElement> allOps = driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
		 Thread.sleep(9000);
		 System.out.println(allOps.size());
		 //Thread.sleep(3000);
//this I used for cookie closing button at bottom but it did'nt work
		 //driver.findElement(By.xpath("//div[.='×']")).click();
		 Thread.sleep(5000);
//to iterate through elements in the list and getting text out of it
		 for(WebElement oneOpt:allOps)
			 {
				 System.out.println(oneOpt.getText());
			 }
//to go third element and clicking it using ENTER key
//		 	 ddAddr.sendKeys(Keys.DOWN);
//			 Thread.sleep(3000);
//			 ddAddr.sendKeys(Keys.DOWN);
//			 Thread.sleep(2000);
//			 ddAddr.sendKeys(Keys.ENTER);
		 
//To click on the last (10th) first it should visible to the selenium so we use JavascriptExecutor for 
//Scrolling down or up if needed 
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(2000);
		 allOps.get(allOps.size()-1).click();
//For taking screenshot we use getScreenshot() of TakesScreenshot(I) 
	 TakesScreenshot gs = (TakesScreenshot)driver;
//OutputType type must be File we store that in File as the input
	 File ss = gs.getScreenshotAs(OutputType.FILE);
//path+name+extension
//Create object of the File class
	 File dest=new File("G:\\64bitAutomationSW\\OCSM11\\screenshots\\Cleartripss.png");
//copy file from source(ss) to destination(dest)
	 Files.copy(ss, dest);
	 
		 
		 
		 
		 

	}

}
