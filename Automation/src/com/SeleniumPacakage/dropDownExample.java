package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://desktop-o3tflbk:81/login.do");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.cssSelector("[type='submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Reports")).click();
		 WebElement addOfDropDown = driver.findElement(By.name("firstGrouping"));
		 Select sel=new Select(addOfDropDown);//adress of dropdown
		 Thread.sleep(5000);
		 sel.selectByVisibleText("Customers");
		 sel.deselectByVisibleText("Customers");//we can't de-select anything from single select drop-down
		 //hence we get UnsupportedOperationException

	}

}
