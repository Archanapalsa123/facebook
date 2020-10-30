package com.SeleniumPacakage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
//	 driver.get("https://www.google.com");
//Taking Screenshot of the entire webpage 	 
//	 TakesScreenshot ts = (TakesScreenshot)driver;
//	  File ss = ts.getScreenshotAs(OutputType.FILE);
//	  File dest=new File("G:\\64bitAutomationSW\\OCSM11\\screenshots\\GoogleSS.png");
//	  Files.copy(ss,dest);
	 
	 
//Taking screenshot of the particular element through webelement interface because it is aslo having the method 
	 driver.get("https://www.flipkart.com");
	 driver.findElement(By.xpath("//button[.='✕']")).click();
	 Thread.sleep(2000);
	 //taking the screenshot on the same element 
	 WebElement imluckyb = driver.findElement(By.className("_2VeolH"));
	 File ss = imluckyb.getScreenshotAs(OutputType.FILE);
	 File dest=new File("G:\\\\64bitAutomationSW\\\\OCSM11\\\\screenshots\\ImLuckyTab.png");
	 Files.copy(ss,dest);
	 Thread.sleep(5000);
	 //taking the same elements screenshot after some time
	 WebElement imluckyb1 = driver.findElement(By.className("_2VeolH"));
	 File ss1 = imluckyb.getScreenshotAs(OutputType.FILE);
	 File dest1=new File("G:\\\\64bitAutomationSW\\\\OCSM11\\\\screenshots\\Flipkart.png");
	 Files.copy(ss1,dest1);	

}
}

