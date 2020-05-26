package com.wbl.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

 // public static WebDriver driver=null;
   

public static WebDriver getbrowser()
   {
       
       WebDriver driver=null;
	   
	   
	   try
     {
    	 

        switch(Congiguration.BROWSER)
        
        {
        case "chrome":
        	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir" +"/Resources/chromedriver.exe"));
        	
            driver = new ChromeDriver();
            
        case "firefox":
        	
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"/Resources/geckodriver.exe");

             driver=new FirefoxDriver();
              
        case "ie":
        	  System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "/Resources/IEDriverServer.exe");
        
              driver=new ChromeDriver();
            default:
            	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Resources/chromedriver.exe");
                  driver = new ChromeDriver();
        }
        		

     }catch(Exception e)
     
     
     {
    	 System.out.println("we are not able to access the browser");

e.getStackTrace();

     }
   
  // driver.get(Congiguration.URL);
  // System.out.println(Congiguration.URL);
   return driver;
   
   
   
   
   
   
   
   }

}
