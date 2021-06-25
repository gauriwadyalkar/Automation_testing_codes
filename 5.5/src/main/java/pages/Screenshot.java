package pages;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Screenshot extends browserfactory {

	//private static final String str_todaysDateStamp= new SimpleDateFormat("dd-MMM-YYYY").format(new Date());
	public static String captureScreenshot(String screenshotName) throws Exception {
		  String str_todaysDateTimeStamp = new SimpleDateFormat("dd-MMM-YYYY HH-mm-ss").format(new Date());

		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  System.out.println("sourceFile" + sourceFile);

		  String ImageName = screenshotName+"_"+str_todaysDateTimeStamp + ".png";

		  String destinationFile = createNewDirectory(".\\ExtentReport\\Reports_")+ImageName;
				 // ".\\ExtentReport\\" + ImageName;
		  FileUtils.copyFile(sourceFile, new File(destinationFile));
		  System.out.println("destinationFile" + destinationFile);
		  return ImageName;
	}

	
	
	public static String createNewDirectory(String path) {
        final String str_todaysDateStamp = new SimpleDateFormat("dd-MMM-YYYY").format(new Date());
        try {

             File file = new File(path + str_todaysDateStamp);

             if (!file.exists()) {
                  file.mkdir();
                  // System.out.println("Internal folder created");
             }
             return file.getCanonicalPath() + "\\";

        } catch (Exception e) {
             System.out.println("failed to create New Directoty.");
             e.printStackTrace();
             return null;
        }
  } 
	

 }



	


