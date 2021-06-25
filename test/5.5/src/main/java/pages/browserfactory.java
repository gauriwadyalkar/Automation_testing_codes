package pages;
	
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;
	import Report.ExtentTestNGReportBuilder;

	public class browserfactory extends ExtentTestNGReportBuilder {
		public static WebDriver driver;
		//public ExtentReports extentReports;
		// public ExtentTest test;
		public static String screenshotPath;

		@BeforeTest

		@Parameters("browser")
		public void setup(String browser) throws Exception {

			if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			else if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty(
						"webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\chromedriver_win32\\chromedriver.exe");

				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("Edge")) {

				System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");

				driver = new EdgeDriver();
			} else {

				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("OrangeHRM"));
			Thread.sleep(3000);
			
		}

		@AfterMethod
		public synchronized void afterMethod(ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				try {
					 screenshotPath = Screenshot.captureScreenshot(result.getName());
					 System.out.println(screenshotPath);
					((ExtentTest) test.get()).fail("Test  Failed is : " + result.getName(),

							MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				((ExtentTest) test.get()).fail(result.getThrowable());
			} else if (result.getStatus() == ITestResult.SKIP) {
				try {
						screenshotPath = Screenshot.captureScreenshot(result.getName());
						 System.out.println(screenshotPath);
					((ExtentTest) test.get()).skip("Test  Skip is : " + result.getName(),
							MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				((ExtentTest) test.get()).skip(result.getThrowable());

			} else {
				try {
					 screenshotPath = Screenshot.captureScreenshot(result.getName());
					 System.out.println(screenshotPath);
					((ExtentTest) test.get()).pass("Test  Passed is : " + result.getName(),
							MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				((ExtentTest) test.get()).pass("Test passed");

			}
			extent.flush();
		}

	}



