package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class usertest extends browserfactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		user us = PageFactory.initElements(driver, user.class);
		us.click();
	}


}
