package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class categoriestest extends browserfactory {
	
	@Test
	public static void Login() throws InterruptedException {
		
		
		categories cy = PageFactory.initElements(driver, categories.class);
		cy.click();
	}


}
