package com.SeleniumPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Archana/OneDrive/Desktop/homework3.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int noOfLinks=allLinks.size();
		System.out.println("Total no.of links " +noOfLinks);
		
		//printing text of the elements on the web page
		for(int i=0;i<=allLinks.size()-1;i++)
	{
		
		WebElement add=allLinks.get(i);
			 String text = add.getText();
			 System.out.println(text);
		}
		//here we are performing click() action on one the links on the web page
		Thread.sleep(3000);
		allLinks.get(allLinks.size()-3).click();
		//here we are checking that if we give wrong attribute will it return empty list or not
	List<WebElement> all = driver.findElements(By.tagName("z"));
		System.out.println(all.size());
		
		
		

	}

}
