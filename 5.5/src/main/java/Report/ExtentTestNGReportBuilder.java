package Report;
	
	import java.io.File;
	import java.io.IOException;
	import java.lang.reflect.Method;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	import pages.Screenshot;

	public class ExtentTestNGReportBuilder {
	 protected static ExtentReports extent;
	 private static ThreadLocal parentTest = new ThreadLocal();
	 protected static ThreadLocal test = new ThreadLocal();
	 protected static String screenshotPath;
	 static File dir;

	 static {

	  DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	  Date date = new Date();
	  dir = new File(System.getProperty("C:\\Users\\HP\\Downloads\\Report") + dateFormat.format(date));
	  System.out.println("dirc Name==============" + dir);
	  boolean successful = dir.mkdir();
	  if (successful) {
	   System.out.println("directory was created successfully");
	  } else {
	   System.out.println("failed trying to create the directory");
	  }
	 }

	 @BeforeSuite
	 public void beforeSuite() {
		 String str_todaysDateTimeStamp= new SimpleDateFormat("dd-MMM-YYYY HH-mm-ss").format(new Date());
	  // String extentReportFile = "//extentReport"+dir".html";
	  // System.out.println("extentReportFileextentReportFile" + extentReportFile);
		 String reportPath=Screenshot.createNewDirectory(".\\ExtentReport\\Reports_");
	  extent = ExtentManager.createInstance(reportPath+"Reprot_"+str_todaysDateTimeStamp+".html");
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter((reportPath+"Reprot_"+str_todaysDateTimeStamp+".html"));
	  extent.attachReporter(htmlReporter);
	 }

	 @BeforeClass
	 public synchronized void beforeClass() {
	  ExtentTest parent = extent.createTest(getClass().getName());
	  parentTest.set(parent);
	 }

	 @BeforeMethod
	 public synchronized void beforeMethod(Method method) {
	  ExtentTest child = ((ExtentTest) parentTest.get()).createNode(method.getName());
	  test.set(child);
	 }

	 @AfterMethod
	 public synchronized void afterMethod(ITestResult result) {
	  if (result.getStatus() == ITestResult.FAILURE) {
	   try {
	    screenshotPath = Screenshot.captureScreenshot(result.getName());
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

	  }

	  /*else {
	   try {
	    screenshotPath = Screenshot.captureScreenshot(result.getName());
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

	  }*/
	  extent.flush();
	 }

	}




