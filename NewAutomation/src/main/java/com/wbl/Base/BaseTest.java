package com.wbl.Base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wbl.Util.BrowserUtil;
import com.wbl.Util.Congiguration;

//import com.wbl.Util.BroserUtil;



public class BaseTest {
 public WebDriver driver;
  public ExtentReports report;
  public ExtentTest tester;
  
  public static final Congiguration config;
 
 static
 {
	 config=new Congiguration();
 }
 
 
 @BeforeSuite
  

  //driver=BrowserUtil.getbrowser();   
		  
  //return driver;
   
  
	 public void beforeSuite()
	 
	 {
		
		 driver=BrowserUtil.getbrowser(); 
		 
		// driver.get(config.URL);
		 
		 // this.driver=new pageDriver(config);
	 
	 //this.driver=new ChromeDriver();
 
 driver.get("http://whiteboxqa.com/");
 
 
ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/loginTest.html"));
	
   report=new ExtentReports();
  

//extent = new ExtentReports();
report.attachReporter(extent);

	 
	 
	 
	 }
    

	@AfterSuite
public void afterclass()   
{
driver.quit();

}

@AfterMethod
public void afterMethod()
{
	
report.flush();


}
}