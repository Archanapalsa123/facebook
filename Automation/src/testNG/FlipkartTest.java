package testNG;

import org.testng.annotations.Test;

import hybridframeword_dd_md_kd.BaseTest;
import hybridframeword_dd_md_kd.FileLibrary;
import hybridframeword_dd_md_kd.WebDriverCommonLib;

public class FlipkartTest extends BaseTest{

	
	@Test	 
	public void addingToCart() throws Throwable
	{
	ElementsPomClassFlipkart pm=new ElementsPomClassFlipkart();
	pm.closePopup();
	
		FileLibrary flib=new FileLibrary();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROP_PATH, "title"),"FlipkartPage");
		
		
		pm.enterValue(flib.getPropKeyValue(PROP_PATH, "value2"));
		Thread.sleep(6000);
//	ProductpagePom pp=new ProductpagePom();
//		pp.performClick();
		ElementsPomClassFlipkart.loopingProducts();
		ElementsPomClassFlipkart.loopingPrices();
		
		
	}
		

	}


