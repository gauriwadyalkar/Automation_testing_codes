package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class locationtest extends browserfactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		location loc = PageFactory.initElements(driver, location.class);
		loc.click();
	}


}
