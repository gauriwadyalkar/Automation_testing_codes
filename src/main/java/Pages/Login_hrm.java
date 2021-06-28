package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_hrm {
	
	public static WebDriver driver;
	
	public  Login_hrm (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	
	
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement passward;
	@FindBy(id="btnLogin")
	WebElement login;
	
	
	public void loginbutton()
	{
		username.sendKeys("Admin");
		passward.sendKeys("admin123");
		login.click();
	}

}
