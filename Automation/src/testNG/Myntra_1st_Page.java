package testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hybridframeword_dd_md_kd.BaseTest;
import hybridframeword_dd_md_kd.WebDriverCommonLib;

public class Myntra_1st_Page extends BaseTest {
	@FindBy(xpath="//span[.='Profile']") private WebElement profiletab;

	public WebElement getProfiletab() {
		return profiletab;
}

	public void MouseHvrProfileTab() {
	
		WebDriverCommonLib wdlb=new WebDriverCommonLib(); 
		wdlb.mouseHover(profiletab);
}

}
