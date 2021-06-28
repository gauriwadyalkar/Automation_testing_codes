package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Admin;
import Pages.Base;

public class Admintestcase extends Base {
	@Test
	
	public void abc() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		
		Admin atp = new Admin(driver);
		atp.click();
	}

}
