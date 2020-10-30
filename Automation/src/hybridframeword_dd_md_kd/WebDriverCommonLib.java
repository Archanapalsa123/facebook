package hybridframeword_dd_md_kd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest {
	public String getPageTitle()
	{
		String pageTitle=driver.getTitle();
		return pageTitle ;
	}
	
	public void verifyPage(String actualTitle, String expectedTitle, String pageName) {
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println(pageName+ "is Displayed ==> VERIFICATION PASSED");
		}
		else
		{
			System.out.println(pageName+ "is not Displayed ==> VERIFICATION FAILED");
		}
		
	}
	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForPage(String expTitle) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expTitle));
	}
	
	public void selectOption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectOption( String value,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void frameSwitch(int index)
	{
		driver.switchTo().frame(index);
	}
	public void frameSwitch(String value)
	{
		driver.switchTo().frame(value);
	}
	public void frameSwitch(WebElement frameAddress)
	{
		driver.switchTo().frame(frameAddress);
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
	}
	}



