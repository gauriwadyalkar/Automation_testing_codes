package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class paygradetest extends browserfactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		paygrade py = PageFactory.initElements(driver, paygrade.class);
		py.click();
	}


}
