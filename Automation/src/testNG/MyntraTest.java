package testNG;

import org.testng.annotations.Test;

import hybridframeword_dd_md_kd.BaseTest;

public class MyntraTest extends BaseTest {
	@Test
	public void LoginPage() {
		Myntra_1st_Page mfp=new Myntra_1st_Page();
		mfp.MouseHvrProfileTab();
	}

}
