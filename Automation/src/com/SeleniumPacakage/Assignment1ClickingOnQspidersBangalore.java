package com.SeleniumPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1ClickingOnQspidersBangalore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 WebElement searchtab = driver.findElement(By.xpath("//input[@name='q']"));
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 searchtab.sendKeys("qspiders b");
		 Thread.sleep(5000);
		 List<WebElement> allOps = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
		 Thread.sleep(5000);
		 System.out.println(allOps.size());
		 for(WebElement oneOpt:allOps)
		 {
			 System.out.println(oneOpt.getText());
		 }
		 Thread.sleep(3000);
		 searchtab.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 searchtab.sendKeys(Keys.DOWN);
		 Thread.sleep(3000);
		 searchtab.sendKeys(Keys.ENTER);
		 
		 
//	// WebElement reqele = driver.findElement(By.xpath("//div[@class='sbl2']/preceding-sibling::div[@class='sbl1']/descendant::span[contains(.,'Qspiders and Jspiders')]"));
//	WebElement reqele = driver.findElement(By.xpath("//span[contains(.,'engaluru')]"));
//		 Point loc = reqele.getLocation();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy"+loc);
//		Thread.sleep(3000);
//		reqele.click();
//		Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
		if(title.equals("qspiders and jspiders - Google Search"))
		{
			System.out.println("title is :" +title);
			System.out.println("dey enga paaruuuuu!!!!!");
		}
		else {
			System.out.println("Your bad luck ma... :(");
		}
}

}
