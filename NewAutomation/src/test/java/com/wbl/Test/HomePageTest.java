package com.wbl.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.wbl.Base.BaseTest;
import com.wbl.Pages.HomePage;

@Listeners(com.wbl.Reporting.ListenerTestNG.class)
public class HomePageTest extends BaseTest{

	HomePage hp;
	
	@BeforeClass
public void beforeClass()
{
	hp=new HomePage(driver);
	
}                                

@AfterClass
public void afterClass()
{
	driver.quit();
}

	
	
	
	
	
	@Test
public void slideTest()
{
		tester=report.createTest("SlideTest created");
		assertTrue(hp.slideImage());
   tester.pass("extent test passed");


}

@Test
public void slideCountTest()
{
	tester=report.createTest("SlideCountTest");
	
	assertEquals(hp.sliderCount(),6);
   
	 tester.pass("slidecounttest passed");
	 
}

@Test
public void socialLinkCount()
{
 
	tester=report.createTest("SocialLinkTest ");
	
	
	assertEquals(hp.socialLinks(),4);

	 tester.info("slidecountte started");
    tester.pass("passed");
}


/*@Test
public void loginLink()
{
	assertEquals(hp.loginClick(),"http://whiteboxqa.com/login.php");
}
   */









}



