package com.SeleniumPacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abstactWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to go to the required or requested page by providing URL
		driver.get("https://google.com");
		Thread.sleep(5000);
		//this method is basically used to verify whether the correct URL is getting open or not
		//String verify=driver.getCurrentUrl();
		//System.out.println(verify);
		//Thread.sleep(5000);
		//it is used to get the page source of the web page that u are opening
		//System.out.println(driver.getPageSource());
    //it is basically used for the navigation from one page to another page alternative for entering the URL
		//driver.navigate().to("https://amazon.in");
		//to refresh the page 
		//driver.navigate().refresh();
		//to go back to the previous page 
		//driver.navigate().back();
		//and to land into the page again to which we have navigated earlier
		//driver.navigate().forward();
		//get get title of the page that is opened currently
		//driver.getTitle();
		//System.out.println(driver.getTitle());
	}

}

