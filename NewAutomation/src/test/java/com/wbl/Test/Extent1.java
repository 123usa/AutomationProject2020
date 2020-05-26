package com.wbl.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent1 {

	
		    public static void main(String[] args) {
		        // start reporters
		        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		    
		        // create ExtentReports and attach reporter(s)
		        ExtentReports extent = new ExtentReports();
		        extent.attachReporter(htmlReporter);

		        // creates a toggle for the given test, adds all log events under it    
		        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		        // log(Status, details)
		        test.log(Status.INFO, "This step shows usage of log(status, details)");

		        // info(details)
		        test.info("This step shows usage of info(details)");
		        
		        // log with snapshot
		        try
		        {
		        
		        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		        
		        // test with snapshot
		        test.addScreenCaptureFromPath("screenshot.png");
		        }catch(Exception e)
		        {
		        // calling flush writes everything to the log file
		        e.printStackTrace();
		        } 	
		        	
		        	extent.flush();
		    }
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	