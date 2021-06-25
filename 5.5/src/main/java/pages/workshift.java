package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class workshift {
	

	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_workShift")
	WebElement workshift;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement ADD;
	
	@FindBy(how = How.ID,using = "workShift_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "workShift_workHours_from")
	WebElement time1;
	

	@FindBy(how = How.ID,using = "workShift_workHours_to")
	WebElement time2 ;
	
	@FindBy(how = How.ID,using = "btnAssignEmployee")
	WebElement addd;
	
	@FindBy(how = How.ID,using = "workShift_assignedEmp")
	WebElement assg;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement save;
	
	public void click() throws InterruptedException {
		job.click();
		workshift.click();
		 ADD.click();
		 
		 Name.sendKeys("amini");
		 time1.sendKeys("06:00");
		 time2.sendKeys("14:00");
		 assg.sendKeys("xyz");
		 
		 save.click();
		 Thread.sleep(5000);
	}


}
