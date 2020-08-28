package com.wbl.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.wbl.Base.BaseTest;
import com.wbl.Pages.ResourcePage;
import com.wbl.Util.ExcelHelper;
@Listeners(com.wbl.Reporting.CustomReporter.class)
//@Listeners(com.wbl.Reporting.ListenerTestNG.class)
public class ResourceTest extends BaseTest{
    
	static Logger log=LogManager.getLogger(ResourceTest.class);
	
	ResourcePage rp;
      
        @BeforeMethod
        
public void beforeMethod()

{
    rp=new ResourcePage(driver);
    
}


        @Test
        public void resourceTest()
        {
        	 tester=report.createTest("ResourceTest");
        	
        	assertEquals(rp.resourseCheck(),"http://whiteboxqa.com/login.php?returnurl=/recordings.php");
        
        
             tester.pass("test has been passed");
        
        }



    @Test
    
      public void toolsTesting()
      {
    	
    	
    	 tester=report.createTest("Tools Testing");
    	
    	assertTrue(rp.toolsImage());
    	tester.pass("the test has been passed");
    	
    	
    	
    	//assertEquals(rp.toolsImage(),8);
      }


  @Test
    public void toolsCountTest()
    {
	 
    	tester=report.createTest("toolsCountTest");
    	
	  
	  
	  assertEquals(rp.toolsCount(),8);	
      tester.info("this test is created");
     // tester.fail("tools counting is failes");
    
    }


  @Test
  public void printTest()
  {
	  log.debug("we are in debugging...");
	  log.info("we are giving info here");
	  log.warn("this is in warning...");
     log.error("we got error mesg");
     log.trace("we are tracing something");
  
  
  }

}