package com.SeleniumPacakage;

import hybridframeword_dd_md_kd.*;
import hybridframeword_dd_md_kd.FileLibrary;
//import hybridframeword_dd_md_kd.WebDriverCommonLib;

public class FramesExample extends BaseTest {
	public static void main(String[] args) throws Throwable
	{
	BaseTest bt=new BaseTest();
	bt.openBrowser();

	FileLibrary flib1=new FileLibrary();
	WebDriverCommonLib wlib1=new WebDriverCommonLib();
	System.out.println(wlib1.getPageTitle());
	wlib1.verifyPage(wlib1.getPageTitle(),flib1.getPropKeyValue(PROP_PATH,"title"),"Home Page");
	FileLibrary flib=new FileLibrary();
	FramesExamplePomClass pm=new FramesExamplePomClass();
	pm.usenameTb(flib.getPropKeyValue(PROP_PATH,"username"));
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.frameSwitch(0);
	Thread.sleep(3000);
	FramesExamplePomClass pm1=new FramesExamplePomClass();
	pm1.passwordTb(flib.getPropKeyValue(PROP_PATH,"password"));
	
	}
}
