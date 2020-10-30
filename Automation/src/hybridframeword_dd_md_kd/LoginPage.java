package hybridframeword_dd_md_kd;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage{
		
		@FindBy(name ="username") private WebElement untb;
		@FindBy(name="pwd") private  WebElement pwtb;
		@FindBy(xpath="//input[@type='submit']") private WebElement loginBtn;
		
		
		
		public WebElement getUntb() {
			return untb;
		}
		public WebElement getPwtb() {
			return pwtb;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		public void login(String un,String pwd)
		{
			untb.sendKeys(un);
			pwtb.sendKeys(pwd);
			loginBtn.click();
		}
		public LoginPage()
		{
			PageFactory.initElements(BaseTest.driver,this);
		}
		
		
		

	}


