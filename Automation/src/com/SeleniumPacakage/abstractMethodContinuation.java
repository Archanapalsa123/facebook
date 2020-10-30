package com.SeleniumPacakage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abstractMethodContinuation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d=new Dimension(300,100);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);
		
		

	}

}
