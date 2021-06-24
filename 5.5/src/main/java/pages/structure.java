package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class structure {
	
	@FindBy(how = How.ID,using = "menu_admin_Organization")
	WebElement organization;
	
	@FindBy(how = How.ID,using = "menu_admin_viewCompanyStructure")
	WebElement struct;
	
	
	@FindBy(how = How.ID,using = "btnEdit")
	WebElement edit;
	
	@FindBy(how = How.ID,using = "treeLink_edit_3")
	WebElement one;
	
	@FindBy(how = How.ID,using = "txtUnit_Id")
	WebElement id;
	
	@FindBy(how = How.ID,using = "txtName")
	WebElement name;
	

	@FindBy(how = How.ID,using = "txtDescription")
	WebElement discription ;
	
	@FindBy(how = How.ID,using = "btnSave")
	WebElement save;
	

	@FindBy(how = How.ID,using = "btnEdit")
	WebElement done ;
	
	
	public void click() throws InterruptedException {
		organization.click();
		struct.click();
		edit.click();
		one.click();
		
		 
		 id.sendKeys("mi");
		 Thread.sleep(5000);
		 name.sendKeys("henaa");
		discription.sendKeys("hi there");
		
		  save.click();
		 Thread.sleep(10000);
		 
		 done.click();
		 Thread.sleep(10000);
	}


}



