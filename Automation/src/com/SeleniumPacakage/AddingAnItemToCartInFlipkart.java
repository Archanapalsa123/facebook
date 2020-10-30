package com.SeleniumPacakage;

	import java.awt.AWTException;
	import java.io.File;
	import java.io.IOException;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import com.google.common.io.Files;
	public class AddingAnItemToCartInFlipkart {


		public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		WebElement wms = driver.findElement(By.xpath("//span[.='Women']"));
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(wms).perform();
		Thread.sleep(5000);
		WebElement hh = driver.findElement(By.xpath("//a[.='Dresses' and @title='Dresses']"));
		System.out.println(hh.isEnabled());
		Thread.sleep(3000);
		hh.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_3togXc']")).click();
		Thread.sleep(7000);
		Set<String> wh = driver.getWindowHandles();
		for(String one:wh)
		{	String title=driver.switchTo().window(one).getTitle();
			if(title.contains("Dresses Online"))
			{
			continue;
		}
		else
		{
			driver.switchTo().window(one);
		}
	}
		//selecting the size 
		driver.findElement(By.xpath("//a[.='M']")).click();
		Thread.sleep(5000);
		//clicking on the add to cart button
		WebElement dr = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		Thread.sleep(3000);
		dr.click();
		Thread.sleep(6000);
		String title = driver.getTitle();
		if(title.contains("Shopping"))
		{
			System.out.println("adding to cart is succesful");
		}
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\64bitAutomationSW\\OCSM11\\screenshots\\flippy1.png");
		Files.copy(src, dest);


}
	}