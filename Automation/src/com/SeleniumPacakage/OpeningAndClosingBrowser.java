package com.SeleniumPacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningAndClosingBrowser {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
	}	

}
