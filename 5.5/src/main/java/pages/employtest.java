package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class employtest extends browserfactory {
	
	@Test
	public static void Login() throws InterruptedException {
		
		
		employment epy = PageFactory.initElements(driver, employment.class);
		epy.click();
	}


}
