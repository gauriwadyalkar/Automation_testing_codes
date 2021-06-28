package Pages;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginpage {

	public static WebDriver driver;

	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void loginTest() throws IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();
		System.out.println("The title of this page is ===> " + pageTitle);

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		Method.screenshotPath();
		NewMethod.screen();

		System.out.println("the login page screenshot is taken");
		// enter the locator of login button and click
		driver.findElement(By.id("btnLogin")).click();

	}

	@Test
	public void search() throws IOException {
		// wait for the page to load
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// search an employee by providing the name,role and status
		driver.findElement(By.linkText("Admin")).click();

		driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).clear();
		driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).sendKeys("Chris Evans");

		Select selectRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		selectRole.selectByVisibleText("Admin");
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).clear();
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Test 1");

		Select selectStatus = new Select(driver.findElement(By.id("searchSystemUser_status")));
		selectStatus.selectByVisibleText("Enabled");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Method.screenshotPath();
		NewMethod.screen();

		System.out.println("the userStatus screenshot is taken");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public static class Method extends loginpage {

		public static String screenshotPath() throws IOException {
			SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
			String timeStamp = sdf.format(new Date());
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\screenShot\\ss" + timeStamp + ".png");
			FileUtils.copyFile(src, dest);
			String path = dest.getAbsolutePath();
			return path;
		}

	}

	public static class NewMethod extends loginpage {

		public static void screen() {
			// downcast the driver to access TakesScreenshot method
			TakesScreenshot ts = (TakesScreenshot) driver;

			// capture screenshot as output type FILE
			File file = ts.getScreenshotAs(OutputType.FILE);

			try {
				// save the screenshot taken in destination path
				FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}