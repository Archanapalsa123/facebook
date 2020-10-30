package com.SeleniumPacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automatingFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("archanagoud888@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Archana@123");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_b")).click(); 
		
		driver.findElement(By.name("q")).sendKeys("Vignesh Mudhiraj");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[aria-label='Add Vignesh Mudhiraj as a friend']")).click();

	}

}
