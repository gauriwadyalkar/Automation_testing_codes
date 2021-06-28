package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.Base;
import Pages.Login_hrm;

public class Logintestcases extends Base {
	@Test
	public void abc() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		
		Login_hrm otp = new Login_hrm(driver);
		otp.loginbutton();
	}

}
