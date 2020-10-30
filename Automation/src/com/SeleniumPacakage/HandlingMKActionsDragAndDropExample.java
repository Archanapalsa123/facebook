package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMKActionsDragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 Thread.sleep(3000);
		 WebElement src = driver.findElement(By.xpath("img[@src='images/high_tatras2_min.jpg'and @height='72'"));
		 Thread.sleep(3000);
		 WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		 Actions ac=new Actions(driver);
		 Thread.sleep(6000);
		 ac.dragAndDrop(src, dest).perform();
	}

}
