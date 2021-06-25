package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class organization {
	
	
	@FindBy(how = How.ID,using = "menu_admin_Organization")
	WebElement organization;
	
	@FindBy(how = How.ID,using = "menu_admin_viewOrganizationGeneralInformation")
	WebElement general;
	
	
	@FindBy(how = How.ID,using = "btnSaveGenInfo")
	WebElement edit;
	
	@FindBy(how = How.ID,using = "organization_name")
	WebElement Name;
	
	@FindBy(how = How.ID,using = "organization_phone")
	WebElement phone;
	
	@FindBy(how = How.ID,using = "organization_city")
	WebElement City;
	

	@FindBy(how = How.ID,using = "organization_country")
	WebElement country ;
	
	@FindBy(how = How.ID,using = "btnSaveGenInfo")
	WebElement save;
	
	public void click() throws InterruptedException {
		organization.click();
		general.click();
		 edit.click();
		 
		 Name.sendKeys("aishi");
		 Thread.sleep(5000);
		 phone.sendKeys("1234");
		 City.sendKeys("pune");
		 country.sendKeys("India");
		 
		 save.click();
		 Thread.sleep(10000);
	}



}
