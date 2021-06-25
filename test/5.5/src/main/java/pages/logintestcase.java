package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintestcase extends browserfactory {
	
	@Test
	public static void Login() {
		
		Login lp = PageFactory.initElements(driver, Login.class);
		lp.loginbutton("Admin", "admin123");
	}
}
