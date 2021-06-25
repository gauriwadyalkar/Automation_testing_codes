package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {

	public WebDriver driver;

	public Admin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminclick;
	
	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagement;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement userclick;

	public void click() throws InterruptedException {
		adminclick.click();
		userManagement.click();
		Thread.sleep(200);
		userclick.click(); 
		
		
	}
	
	

}
