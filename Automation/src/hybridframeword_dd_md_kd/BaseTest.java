package hybridframeword_dd_md_kd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public  class BaseTest implements InterfaceAutomationConstants {
		
		public static WebDriver driver;
		@BeforeClass
		public void openBrowser() throws Throwable
		{
			FileLibrary flib=new FileLibrary();
			String browserValue = flib.getPropKeyValue(PROP_PATH,"browser");
			if(browserValue.equalsIgnoreCase("Chrome"))
			{
				System.setProperty(CHROME_KEY,CHROME_VALUE);
				driver=new ChromeDriver();
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
			}
			String appUrl=flib.getPropKeyValue(PROP_PATH,"url2");
			driver.get(appUrl);
			
			
			driver.manage().window().maximize();
	
			
			
		}
//		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
			
			
		}

	}


