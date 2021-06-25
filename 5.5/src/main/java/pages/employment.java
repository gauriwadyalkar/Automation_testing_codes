package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class employment {
	
	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_employmentStatus")
	WebElement employment;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement ADD;
	
	@FindBy(how = How.ID,using = "empStatus_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement SaVe;
	
	public void click() throws InterruptedException {
		job.click();
		employment.click();
		 ADD.click();
		 
		 Name.sendKeys("emeye");
		 
		 SaVe.click();
		 Thread.sleep(5000);
	}

}
