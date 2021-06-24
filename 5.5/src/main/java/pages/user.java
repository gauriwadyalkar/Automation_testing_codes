package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class user {
	
	@FindBy(how = How.ID, using = "menu_admin_UserManagement")
	WebElement usermanagement;
	
	@FindBy(how = How.ID, using = "menu_admin_viewSystemUsers")
	WebElement user;
	
	@FindBy(how = How.ID,using = "searchSystemUser_userName")
	WebElement username;
	
	@FindBy(how = How.ID,using = "searchSystemUser_userType")
	WebElement userrol;
	
	@FindBy(how = How.ID,using = "searchSystemUser_employeeName_empName")
	WebElement employename;
	
	@FindBy(how = How.ID,using = "searchSystemUser_status")
	WebElement status;
	
	@FindBy(how = How.ID,using = "searchBtn")
	WebElement search;

	
	public void click() throws InterruptedException {
		usermanagement.click();;
		 user.click();
		 username.sendKeys("Admin");
		 
		 Select userRoleDropDown = new Select(userrol);
		 userRoleDropDown.selectByIndex(1); 
		 
		 
		 employename.sendKeys("abcd");
		 
		 
		 Select statusDropDown = new Select(status);
		 statusDropDown.selectByIndex(1); 
		 status.sendKeys("enable");
		 
		 search.click();
		 Thread.sleep(5000);
		
	}

}
