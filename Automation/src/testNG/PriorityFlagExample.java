package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlagExample {
	
	
	@Test(priority=1,enabled=true)
	public void vun()
	{
		Reporter.log("run method in priority example",true);
	}
	@Test(priority=2,enabled=true)
		public void sun() {
			Reporter.log("iam sun method in priority example",true);
		}
	@Test
	public void run()/*  default priority is 0 so it executes first     */
	{
		Reporter.log("iam run method in priority example",true);
	}
	@Test
	public void rsndommethod()
	{
		Reporter.log("will i execute",true);
	}
	}


