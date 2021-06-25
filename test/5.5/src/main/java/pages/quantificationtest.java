package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class quantificationtest extends browserfactory {
	
	
	@Test
	public static void Login() throws InterruptedException {
		
		
		skills sk = PageFactory.initElements(driver, skills.class);
		sk.click();
	}


}
