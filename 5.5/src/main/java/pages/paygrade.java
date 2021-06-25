package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class paygrade {
	
	@FindBy(how = How.ID,using = "menu_admin_Job")
	WebElement job;
	
	@FindBy(how = How.ID,using = "menu_admin_viewPayGrades")
	WebElement paygrade;
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement Add;
	
	@FindBy(how = How.ID,using = "payGrade_name")
	WebElement name;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement Save;
	
	public void click() throws InterruptedException {
		job.click();
		 paygrade.click();
		 Add.click();
		 
		 name.sendKeys("di");
		 
		 Save.click();
		 Thread.sleep(5000);

}
}
