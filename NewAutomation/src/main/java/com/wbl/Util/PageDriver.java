package com.wbl.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageDriver {

  WebDriver driver;
	
  Congiguration config;
  
	public PageDriver(WebDriver driver)
	{
		this.driver=driver;
		
	}
   

  public PageDriver( Congiguration config)

  {


 this.config=config;

start();



}

  
  public void start()
  {
	  String browser=Congiguration.BROWSER;
  
      switch(browser)
      {
      case "chrome":
    	  driver=startFirefox();
      case "firefox":
    	  driver=startChrome();
      case "ie" : 
          driver=startIE();
      default:
    	    driver=startChrome();
    	    break;
      }
  
  
    driver.get(Congiguration.URL);
    driver.manage().window().maximize();
  }
  
      


  public WebDriver startFirefox()
  {
	  return new FirefoxDriver();
	  
      
  }
  
  public WebDriver startChrome()
  {
	  return new ChromeDriver();
	   
      
  }
  
  public WebDriver startIE()
  {
	  return new ChromeDriver();
	  
      
  }
  
      
      
     
  
  
  }

