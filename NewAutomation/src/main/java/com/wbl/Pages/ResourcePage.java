package com.wbl.Pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wbl.Base.BasePage;

public class ResourcePage extends BasePage {

	 String resourceR="RESOURCES";
	 String recordingR="Recordings";
	 String toolI="//*[@id=\"navbar-collapse\"]/ul/li[6]/a";
	 String toolSlide="//*[@id=\"navbar-collapse\"]/ul/li[6]/ul/li[1]/a";
	 String toolBar="/html/body/div[1]/div/div/div/div/div/div/a[8]/img";
	 String toolCount="//*[@id=\"navbar-collapse\"]/ul/li[6]/a";
	 String toolAction="//*[@id=\"navbar-collapse\"]/ul/li[6]/ul/li[1]/a";
	 String toolLocate="/html/body/div[1]/div/div/div/div/div/div/a/img";
	  
	  public ResourcePage(WebDriver driver) {
		super(driver);


	}


   public String resourseCheck()


   {


	WebElement el = driver.findElement(By.linkText(resourceR));
		
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    Actions action = new Actions(driver);
    action.moveToElement(el).build().perform();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
    driver.findElement(By.linkText(recordingR)).click();
    
    System.out.println(driver.getTitle());

    System.out.println(driver.getCurrentUrl());


    return driver.getCurrentUrl();

   }

    public boolean toolsImage()
    {
    	  WebElement el = driver.findElement(By.xpath(toolI));
  		
  		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

      Actions action = new Actions(driver);
      action.moveToElement(el).build().perform();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

      
       driver.findElement(By.xpath(toolSlide)).click();
      
      
       WebElement er=driver.findElement(By.xpath(toolBar));
             
    	boolean a=er.isDisplayed();

         return a;
    }

    
    
    public int toolsCount()
    
    {
WebElement el = driver.findElement(By.xpath(toolCount));
  		
  	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

      Actions action = new Actions(driver);
      action.moveToElement(el).build().perform();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

      driver.findElement(By.xpath(toolAction)).click();
      
      List<WebElement> er=driver.findElements(By.xpath(toolLocate));
      
      int a=er.size();
      System.out.println("count"  + a);
    
       return a;
    
    }
    
    
    
    
    
    
    
    
}