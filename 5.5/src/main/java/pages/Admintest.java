package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Admintest extends browserfactory {
	
	
	@Test
	public static void Login() throws InterruptedException {
		
		Admin ad = PageFactory.initElements(driver, Admin.class);
		ad.click();
	}

}
