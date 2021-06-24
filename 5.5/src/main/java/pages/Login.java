package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	@FindBy(how = How.ID, using = "txtUsername")
	WebElement usename;
	
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement pwd;
	
	@FindBy(how = How.ID,using = "btnLogin")
	WebElement login;
	
	public void loginbutton(String a,String b )
	{
		usename.sendKeys(a);
		 pwd.sendKeys(b);
		 login.click();
		
	}

}
