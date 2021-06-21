

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDropDownList {

	private static RemoteWebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      FirefoxDriver Webdriverbndriver = new FirefoxDriver();
      

	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	
	// createWebElement variable and check 
	
	WebElement wb = driver.findElement(By.id("chkLogin"));
	
	
	if(wb.isDisplayed() && wb.isEnabled() && wb.isSelected() == false)
	{
		wb.click();
	}
      }

}
