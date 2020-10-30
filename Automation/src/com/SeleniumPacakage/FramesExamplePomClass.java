package com.SeleniumPacakage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hybridframeword_dd_md_kd.BaseTest;

public class FramesExamplePomClass {
	@FindBy(id="id1") private WebElement untb;
	@FindBy(id="pwtb") private WebElement pwdtb;
	public FramesExamplePomClass()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getUntb() {
		return untb;
	}
	public void usenameTb(String un)
	{
		untb.sendKeys(un);
	}
	public WebElement getPwdtb()
	{
		return pwdtb;
		
	}
	public void passwordTb(String pwd)
	{
		pwdtb.sendKeys(pwd);
	}

}
