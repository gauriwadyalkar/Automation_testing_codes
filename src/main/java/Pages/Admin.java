package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	
	public WebDriver driver;
	
	public Admin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Admin")
	WebElement adminclick;
	@FindBy(linkText = "Users")
	WebElement userclick;
	
	public void click()
	{
		adminclick.click();
		userclick.click();
	}

}
