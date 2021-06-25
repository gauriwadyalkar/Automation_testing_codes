package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class categories {
	

	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_jobCategory")
	WebElement categories;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement ADD;
	
	@FindBy(how = How.ID,using = "jobCategory_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement SaVe;
	
	public void click() throws InterruptedException {
		job.click();
		categories.click();
		 ADD.click();
		 
		 Name.sendKeys("peter");
		 
		 SaVe.click();
		 Thread.sleep(5000);
	}

}
