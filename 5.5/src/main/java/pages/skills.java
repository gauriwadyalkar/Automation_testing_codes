package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class skills {
	
	@FindBy(how = How.ID,using = "menu_admin_Qualifications")
	WebElement quantification;
	
	@FindBy(how = How.ID,using = "menu_admin_viewSkills")
	WebElement skills;
	
	
	@FindBy(how = How.ID,using = "btnAdd")
	WebElement add;
	
	@FindBy(how = How.ID,using = "skill_name")
	WebElement name;

	@FindBy(how = How.ID,using = "skill_description")
	WebElement discription ;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement save;
	
	public void click() throws InterruptedException {
		quantification.click();
		skills.click();
		add.click();
		
		 name.sendKeys("mayaa");
		 Thread.sleep(5000);
		 discription.sendKeys("hena");
		
		  save.click();
		 Thread.sleep(10000);
		 
		
	}


}






