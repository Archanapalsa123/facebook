package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run()
	{
		//print only on console
		System.out.println("ONLY ON THE CONSOLE");
		Reporter.log("Iam printing only in reports!!!");
		Reporter.log("iam gonna print in both report and also on console",true);
		Reporter.log("Iam run method in Demo class",false);
		
	}
	

}
