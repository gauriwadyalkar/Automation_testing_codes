package selenium.com;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		
	      
	    driver.get("https://www.lambdatest.com/");
	     
	     driver.findElement(By.id("usermail")).sendKeys("gauriwadyalkar@gmail.com");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	     driver.findElement(By.id("btnLogin")).click();
	     System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getPageSource());
	     System.out.println(driver.getTitle());
	     driver.close();
//driver.get("https://jqueryui.com/droppable/");
		
	//	Actions a= new Actions(driver);
		
	//	driver.switchTo().frame(0);  
		
	//	WebElement drag = driver.findElement(By.id("draggable"));
	//	WebElement drop = driver.findElement(By.id("droppable"));
		
	//	a.dragAndDrop(drag, drop).perform();
		
	//	driver.switchTo().defaultContent();
		
		//WebElement we = driver.findElement(By.linkText("Sortable"));
		//a.contextClick(we).perform();
		//driver.close();

//	}

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
	//	System.setProperty("webdriver.chrome.driver","D:\\Rashmi\\Office\\Collage\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
	//
		//specify the LambdaTest URL
		//driver,get("https://www.lambdatest.com/");
		
	
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
			
	//specify the locator of the Resources menu
			//WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a"));
		
	            // Actions act = new Actions(driver);
	//mouse hover the Resources element
			//act.moveToElement(element).build().perform();
			
	//specify the locator for the element Blog and click
			//driver.findElement(By.linkText("Blog")).click();

		
			//driver.close();
	     
		//specify the LambdaTest URL
				//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
			//	driver.manage().window().maximize();
				//driver.get("https://opensource-demo.orangehrmlive.com/");
				//
		//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//			driver.findElement(By.id("btnLogin"));
					//		
					//		driver.findElement(By.linkText("PIM")).click();
					//driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
					//driver.findElement(By.linkText("Odis")).click();
					
					//driver.findElement(By.id("btnSave")).click();
					
					
					
					
				//	WebElement opti = driver.findElement(By.id("personal_cmbNation"));
				//	Select nations = new Select(opti);
					
				//	System.out.println("default option is " + nations.getFirstSelectedOption().getText());
					
				//	List<WebElement> countries = nations.getOptions();
					
				//	System.out.println("Number of countires " +countries.size());
					
					

//					nations.selectByVisibleText("Indian");
					
//					nations.selectByValue("82");
					
				//	nations.selectByIndex(82);
				//	
				//	System.out.println("Choosen value is : " + nations.getFirstSelectedOption().getText());
				//	
					//driver.close();
		
	//=========================multipleselection===============================================================================
		
		//driver.manage().window().maximize();
		//driver.get("file:///D:/.thml/multiselect.html");
		//
	//	WebElement lb = driver.findElement(By.name("cars"));
		
	//	Select cars= new Select(lb);
		
		//if(cars.isMultiple())
		//{
		//	cars.selectByIndex(0);
		//	cars.selectByIndex(2);
		//	cars.selectByVisibleText("Audi");
		//}
		
	//	List<WebElement> selCars = cars.getAllSelectedOptions();
 	//	
		//System.out.println("Selected cars ");
		
		//for(WebElement we : selCars)
		//{
		//	System.out.println(we.getText());
		//}
		
		
		//driver.manage().window().maximize();
		//driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		//
		//WebElement lb = driver.findElement(By.xpath("//select[@id='first']"));
		
		//Select proc= new Select(opt1);
	//	S
		
	//	if(cars.isMultiple())
	//	{
		//	cars.selectByIndex(0);
		//	cars.selectByIndex(2);
		//	cars.selectByVisibleText("Audi");
	//	}
		
	//	List<WebElement> selCars = cars.getAllSelectedOptions();
 		
	//	System.out.println("Selected cars ");
		
	//	for(WebElement we : selCars)
	//	{
	//		System.out.println(we.getText());
	//	}
			
			
	//	driver.close();
		
	//	}
			
			
	//	driver.close();
		
	//	}
		
		
		
		
	//===============opening gmail from google========================================================	
		

	//	driver.manage().window().maximize();
	//	driver.get("https://www.google.com/");
	//	WebElement we = driver.findElement(By.linkText("Gmail"));
		
	//	Actions a = new Actions(driver);
		
	//	a.contextClick(we).perform();
		//a.contextClick(we).perform();
		
	//	a.sendKeys(Keys.ARROW_DOWN).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ARROW_DOWN).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ARROW_UP).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ENTER).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ARROW_DOWN).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ARROW_DOWN).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ARROW_UP).perform();
	//	Thread.sleep(2000);
	//	a.sendKeys(Keys.ENTER).perform();
	//	Thread.sleep(2000);
	//	driver.close();   
		
		
	// ===================second window handling===========================================================================	
		
		
	//	driver.manage().window().maximize();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//	driver.findElement(By.id("btnLogin")).click();
// System.out.println("WindowHandle : " +driver.getWindowHandle());
		
	//	driver.findElement(By.xpath(".//*[@id='branding']/a[1]/img")).click();
		
	//	Set<String> winhld = driver.getWindowHandles();
	//	Iterator<String> itr = winhld.iterator();
	
	//	System.out.println("Window handles of main window : " +itr.next());
		
	//	System.out.println("Window hansdle of new main window : " +itr.next());
		
	//	itr = winhld.iterator();
		
	//	String mainWindow = itr.next();
	//	String newWindow = itr.next();
		
		
// System.out.println("Window hansdle of new main window : " +itr.next());
		
	//	itr = winhld.iterator();
		
	//	String mainWindow1 = itr.next();
	//	String newWindow1 = itr.next();
		
	//	driver.switchTo().window(newWindow1);
		
	//	System.out.println("Title is : " + driver.getTitle());
		
	//	driver.switchTo().window(mainWindow1);
		
	//	driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		
	//	driver.findElement(By.id("welcome")).click();
		
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
	//=========================code opening click ok click conform=====================================
		
	//	driver.manage().window().maximize();
	//	String expMsg = "I am Javascript Alert", actMsg=null;
	//	driver.get("https://demoqa.com/alerts");
	//	driver.findElement(By.id("alertButton")).click();
		  
	//	Alert a = driver.switchTo().alert();
		
	//	if(actMsg.equals(expMsg))
	//	{
	//		System.out.println("Character message\n");
	//	}
			
	//===================================IMPLICIT==================================================	
		
	//	driver.manage().window().maximize();
	//	driver.get("https://demoqa.com/alerts");
	//	driver.findElement(By.xpath("//butt0n[@id='timeAlertButton']")).click();
	//	driver.manage().timeouts().implicitlyWait(30,   TimeUnit.SECONDS);
	//	Thread.sleep(50000);
	//	driver.switchTo().alert().accept();
	
		
		//======================IMPLICITWITHORANGREHRM=======================================
		
    //    driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//	driver.findElement(By.id("btnLogin")).click();
	//	
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		
	//	driver.findElement(By.partialLinkText("Welcome")).click();
		
	//	driver.findElement(By.linkText("Logout")).click();
		
	//	driver.close();
		
	//===========================================explict way=====================================	
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//	String eTitle = "Demo Guru99 Page";
	//	String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
	//	driver.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
	//	driver.manage().window().maximize() ;
		//get the actual value of the title
	//	aTitle = driver.getTitle();
		//compare the actual title with the expected title
	//	if (aTitle.equals(eTitle))
	//	{
	//	System.out.println( "Test Passed") ;
	//	}
	//	else {
	//	System.out.println( "Test Failed" );
	//	}
	//	//close browser
	//	driver.close();
//	}
	//===========================================explicti in orangehrm==============================================================================
			
	//		driver.manage().window().maximize();
	
//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	driver.findElement(By.id("btnLogin")).click();
	
//	driver.findElement(By.partialLinkText("Welcome")).click();
//	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	//ExplicitWait until()
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
	
//	driver.close();
	
//	=================================================fluent=======================================================================================
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//driver.findElement(By.partialLinkText("Welcome")).click();
		
//		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		
		//fw.withTimeout(20,TimeUnit.SECONDS).ignoreAll(NoSuchElementException.class)
		//.pollingEvery(1,TimeUnit.NANOSECONDS)
	//	.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
//		FluentWait(driver).withTimeout(60, SECONDS).pollingEvery(10, SECONDS).ignoring(NoSuchElementException.class);
		   
		//   WebElement dynamicelement = wait.until(new Function<webdriver,webElement>() {
		   
//		TimeUnit SECONDS = null;
		//   public WebElement apply(WebDriver driver) {
		//      return driver.findElement(By.id("dynamicelement"));
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(30, SECONDS)
//			       .pollingEvery(5, SECONDS)
//			       .ignoring(NoSuchElementException.class);

//			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.id("foo"));
//			     }
//			   });
//		   }
//	
		
		
		
		
	//	}
//}

	//private static FluentWait<WebDriver> FluentWait(WebDriver driver) {
		// TODO Auto-generated method stub
	//	return null;
	
//====================================================nevigation=======================================================================
//	driver.get("https://www.guru99.com/");
//	Thread.sleep(5000);
	
//	driver.navigate().refresh();
//	Thread.sleep(5000);
	
//	driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_synchronization.htm");

//	Thread.sleep(5000);
//	driver.navigate().back();
	
	
//	Thread.sleep(5000);
//	driver.navigate().forward();
//}
//}
//==============================================nevigate to guru99=================================================================================================

//driver.get("http://www.demo.guru99.com/test/social-icon.html");
		
		//Thread.sleep(50000);
//		List<WebElement> toolTip = driver.findElements(By.xpath(".//*[@id='top-bar']/div/div/div/div/a"));
		
//		for(WebElement we : toolTip)
//		{
//			System.out.println("Actual tool tip  " +we.getAttribute("title"));
//		}
//	}
//}

//======================================================for username====================================================================================
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//	driver.findElement(By.id("btnLogin")).click();
		
	//	List<WebElement> spans = driver.findElements(By.tagName("span"));
		
	//	System.out.println("Span message is " +spans.size());
		
	//	for(WebElement w : spans)
	//	{
	//		System.out.println(w.getText());
	//	}
	//	driver.close();
	//}
//}

//==================================forpassward=============================================================

//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//			driver.findElement(By.id("btnLogin")).click();
			
//			List<WebElement> spans = driver.findElements(By.tagName("span"));
			
//			System.out.println("Span message is " +spans.size());
			
//			for(WebElement w : spans)
//			{
//				System.out.println(w.getText());
//			}
//			driver.close();
//	}
//}
//============================forspan message=======================================================================

//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
//		driver.findElement(By.id("btnLogin")).click();
		
//		List<WebElement> spans = driver.findElements(By.tagName("span"));
		
//		System.out.println("Span message is " +spans.size());
		
//		for(WebElement w : spans)
//		{
//			System.out.println(w.getText());
//		}
//		driver.close();
}
}
//==========================================================================================================================================

