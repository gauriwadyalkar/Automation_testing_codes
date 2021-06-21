package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class employee {
	
	WebDriver driver;
	
  @Test(dataProvider = "getdata")
  public void add(String name, String last) throws InterruptedException{
  driver.manage().timeouts().implicitlyWait(300,  TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		CharSequence n = null;
		driver.findElement(By.id("firstName")).sendKeys(name);
		CharSequence s = null;
		driver.findElement(By.id("lastName")).sendKeys(last);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_2")).click();
		driver.findElement(By.id("btnSave")).click();
	  
  }
  }

  @DataProvider
  public Object[][] dp() {
	  
	     Object[][] data = new Object[4][2];
	    		 
	      data[0][0] = "";
	      data[0][1] = "";
	      
	      data[1][0] = "";
	      data[1][1] = "";
	      
	      return data;
	    }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
  }

  @AfterTest
  public void afterTest() {
	  blic void afterTest() {
		  driver.findElement(By.partialLinkText("Welcome")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  
		  driver.close();
  }

}
