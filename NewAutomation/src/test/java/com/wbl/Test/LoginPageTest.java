package com.wbl.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import com.wbl.Reporting.ListenerTestNG;
//import com.wbl.Reporting;
import com.wbl.Base.BaseTest;
import com.wbl.Pages.LoginPage;
import com.wbl.Util.ExcelHelper;
@Listeners(com.wbl.Reporting.ListenerTestNG.class)
public class LoginPageTest extends BaseTest {

static Logger log=LogManager.getLogger(BaseTest.class);




   LoginPage pl;
   @BeforeClass
   
  






public void beforeMethod() {

	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   
	  // driver.get("http://www.whiteboxqa.com/");
	   pl=new LoginPage(driver);

   
   
   }

  
   
   
   
   
   
   
   
   /*@AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }
   */
   
 
   
   
   
   @Test
  public void loginTest()
  {
	  tester=report.createTest("login testing extent");
	  
	   
	   
	   
	   assertEquals(pl.loginLink(),"http://whiteboxqa.com/login.php");
     tester.pass("the test has passed");
  
  }
  
  @DataProvider(name="getData")
  public Object[][] getData()
  {
  
 return ExcelHelper.gettData("newWork.xlsx","Sheet1");
 // return ExcelHelper.gettData("dataGet.xlsx","Sheet1");
  	  
	  
	   /*Object[][] data = new Object[2][2];
     
      data[0][0]="\nneeru";
      data[0][1]="neerupwd";
      data[1][0]="reetu";
      data[1][1]="reetupwd";
  
  
      return data;*/
  
  }

	  
  
  
  @Test(dataProvider="getData")
  
  public void testLogin(String uname,String pwd)
  {
	  tester=report.createTest("login testing");
	  tester.info("this is the information giving related to extent library");
	  tester.pass("this test is passed extent");
	  log.info("\nusername is" +uname );
	  log.info("\npassword is " +pwd);
	  
	  
	  
	  assertFalse(pl.performLogin(uname,pwd));
  }
  
  
  
  
  
  
  
  }
  
  
 
