package testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import hybridframeword_dd_md_kd.BaseTest;

public class ElementsPomClassFlipkart {
	@FindBy(xpath="//button[.='✕']") private WebElement cancelbtn;
	@FindBy(name="q") private WebElement searchtab;
	@FindBy(xpath="//button[@class='vh79eN']") private WebElement submittab;
	@FindBy(xpath="//div[@class='_3wU53n']") private static  List<WebElement> products;
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']") private static List<WebElement> prices;
	public WebElement getSearchtab() {
		return searchtab;
	}
	public WebElement getClosePopup()
	{
		return cancelbtn;
		
	}
	public void closePopup()
	{
		cancelbtn.click();
	}
	public WebElement getSubmittab()
	{
		return submittab;
		
	}
	public void enterValue(String value)
	{
		searchtab.sendKeys(value);
		submittab.click();
	}
	 public List<WebElement> getProducts()
	 {
		return products;
		 
	 }
	 public static void loopingProducts()
	 {	int dr = products.size();
	 
		System.out.println(dr);
		for(int i=0;i<=products.size()-1;i++)
		{
			WebElement eachprod = products.get(i);
	
		String text = eachprod.getText();
		System.out.println(text);
	
		}

	 }
	 public List<WebElement> getPrices()
	 {
		return prices;
		 
	 }
	 public static void loopingPrices()
	 {	int dr1 = prices.size();
	 
		System.out.println(dr1);
		for(int i=0;i<=prices.size()-1;i++)
		{
			WebElement eachprice = prices.get(i);
	
		String text1 = eachprice.getText();
		System.out.println(text1);
		
		}
	 
	 }
	 public ElementsPomClassFlipkart()
{
	PageFactory.initElements(BaseTest.driver,this);
}
}