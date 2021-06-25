package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class organizationtest extends browserfactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		organization org = PageFactory.initElements(driver, organization.class);
		org.click();
	}


}
