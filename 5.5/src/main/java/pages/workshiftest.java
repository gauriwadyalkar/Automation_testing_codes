package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class workshiftest extends browserfactory {
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		workshift ws = PageFactory.initElements(driver, workshift.class);
		ws.click();
	}


}
