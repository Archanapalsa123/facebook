package com.SeleniumPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("file:///C:/Users/Archana/OneDrive/Desktop/multiselect.html");
			 WebElement ddAdd = driver.findElement(By.id("subject1"));
			 Select sel=new Select(ddAdd);
			 if(sel.isMultiple())
			 {
				 System.out.println("Yes It is a Multi-select dropdown");
			 }
			 else
			 {
				 System.out.println("No It is not a Multi-select dropdown");
			 }
			 //sel.selectByVisibleText("JAVA");
			 //sel.selectByValue("max");
			// sel.selectByIndex(5);
			// Thread.sleep(3000);
			// sel.deselectByIndex(5);
			 //sel.deselectByVisibleText("JAVA");
			 //sel.deselectByValue("max");
			// sel.deselectAll();
			 List<WebElement> allOps = sel.getOptions();
			 System.out.println(allOps.size());
			// for(int i=0;i<=allOps.size()-1;i++)
			// {
			//	 System.out.println(allOps.get(i).getText());
				 
				 
			// }
			// for(int i=1;i<=4;i++) {
				// sel.selectByIndex(i);
				 
			 //}
			 //List<WebElement> selOps = sel.getAllSelectedOptions();
			// for(WebElement se1:selOps)
			// {
				// System.out.println(se1.getText());
			// }
		//	WebElement firstselOp = sel.getFirstSelectedOption();
			//System.out.println(firstselOp.getText());
		
			 
				
	}

}
