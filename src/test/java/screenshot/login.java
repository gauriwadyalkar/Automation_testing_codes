package screenshot;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class login {
	
	WebDriver driver;
	
  @Test(dataProvider = "getdata1")
  public void f(String un, String pwd) {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
  }
@Test(dataProvider = "getdata2")
public.void t (String s )
           
  }
  
  
  public class Method extends login{
		
		public String screenshot() throws IOException 
		{
			SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
			String timeStamp = sdf.format(new Date());
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\screenShot\\ss"+timeStamp+".png");
			FileUtils.copyFile(src,dest);
			String path = dest.getAbsolutePath();
			return path;
		}
	
		
  @DataProvider
  
  
    
  
  
  
  
  
  
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
