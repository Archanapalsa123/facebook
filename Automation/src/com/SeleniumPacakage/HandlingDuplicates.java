package com.SeleniumPacakage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Archana/OneDrive/Desktop/multiselect.html");
		 WebElement ddAdd = driver.findElement(By.id("subject1"));
		 Select sel=new Select(ddAdd);
		Set<String> se1=new TreeSet<String>();
		List<WebElement> allOps = sel.getOptions();
		//print all the options in alphabetical order without duplicates using Tree set
		for(int i=0;i<allOps.size();i++)
		{
		String text=allOps.get(i).getText();
	
			se1.add(text);
			}
		for(String text:se1)
		{
			System.out.println(text);
			
		}
//printing all the options in any random order without any duplicates
		//Set<String> se2=new HashSet<String>();
		//List<WebElement> allOps2 = sel.getOptions();
		//for(int i=0;i<allOps2.size();i++)
		//{
		//	String text=allOps2.get(i).getText();
		//	se2.add(text);
			
		//}
		//for(String text:se2)
		//{
		//	System.out.println(text);
		//}
//printing all options in given order without duplicates USING LinkedHashSet
		Set<String> se3=new LinkedHashSet<String>();
		List<WebElement> allOps3 = sel.getOptions();
		for(int i=0;i<allOps3.size();i++)
		{
			String text=allOps3.get(i).getText();
			se3.add(text);
			
		}
		for(String text:se3)
		{
			System.out.println(text);
		}

	}

}
