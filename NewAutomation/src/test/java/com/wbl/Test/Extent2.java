package com.wbl.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent2 {

  
  ExtentHtmlReporter htmlReporter;
 
  ExtentReports extent;
  @BeforeSuite
  public void setUp()
  
  {
	  
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		
		 extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

  
  
  }
  
  


  @Test
  
  public void testing()
  {


	  ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);

      ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

      // log(Status, details)
      test.log(Status.INFO, "This step shows usage of log(status, details)");

      // info(details)
      test.info("This step shows usage of info(details)");
      
      // log with snapshot
        
      try {
      
      test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
      
      // test with snapshot
      test.addScreenCaptureFromPath("screenshot.png");
      
  
      }catch(Exception e)
      {
    	  e.getStackTrace();
    	  
      }
  
  
  
  }


  
  
  
  
  @AfterSuite
public void tearDown()
{

	 extent.flush();
	 	 
}



}
