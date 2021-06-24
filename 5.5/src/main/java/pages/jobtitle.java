package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class jobtitle {
	
	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_viewJobTitleList")
	WebElement jobtitle;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement add;
	
	@FindBy(how = How.ID,using = "jobTitle_jobTitle")
	WebElement title;
	
	@FindBy(how = How.ID,using = "jobTitle_jobDescription")
	WebElement description;
	
	@FindBy(how = How.ID,using = "jobTitle_note")
	WebElement note;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement save;
	
	public void click() throws InterruptedException {
		job.click();;
		jobtitle.click();
		add.click();
		 
		 title.sendKeys("annaa");
		 
		 description.sendKeys("enable");
		 note.sendKeys("no");
		 
		 save.click();
		 Thread.sleep(5000);
		
	}

	
	
	
	
	
	
	
	

}
