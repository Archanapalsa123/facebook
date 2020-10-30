package hybridframeword_dd_md_kd;

public class ValidLoginTest extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Thread.sleep(5000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.getPageTitle(),"actiTIME - Login","login page");
		
		Thread.sleep(5000);
		FileLibrary flib=new FileLibrary();
		LoginPage lp=new LoginPage();
		
		lp.login(flib.getPropKeyValue(PROP_PATH,"username"),flib.getPropKeyValue(PROP_PATH,"password"));
		
		WebDriverCommonLib wlib1=new WebDriverCommonLib();
		wlib1.verifyPage(wlib1.getPageTitle(),"actiTIME - Open Tasks","Taskpage");
		
		Thread.sleep(5000);
		
		bt.closeBrowser();
		
	}
	
	

}
