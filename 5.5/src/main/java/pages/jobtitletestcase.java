package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class jobtitletestcase extends browserfactory {
	
	

	@Test
	public static void Login() throws InterruptedException {
		
		
		jobtitle jt = PageFactory.initElements(driver, jobtitle.class);
		jt.click();
	}

}
