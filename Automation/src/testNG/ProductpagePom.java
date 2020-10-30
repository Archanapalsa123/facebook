package testNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hybridframeword_dd_md_kd.BaseTest;

public class ProductpagePom {
	@FindBy(xpath="//div[.='Vivo Y20 (Obsidian Black, 64 GB)']") private WebElement firstmobile;

	public WebElement getFirstmobile() {
		return firstmobile;
	}
	public void performClick()
	{
		firstmobile.sendKeys(Keys.ENTER);
	}
	public ProductpagePom()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

}
