package com.wbl.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.Base.BasePage;

public class HomePage extends BasePage{
	@FindBy(how=How.XPATH,using="//*[@id=\"promo-slider\"]/ul[1]/li[1]/img")
     static WebElement imageSlide;
		
	@FindBy(how=How.XPATH,using="//*[@id=\"promo-slider\"]/ul[1]/li/img")
	List<WebElement> slideAll;
		
	@FindBy(how=How.XPATH,using="/html/body/header/div[1]/div/ul/li/a/i")
	List<WebElement> socialLink;
	
		
	public HomePage(WebDriver driver)
  {
	  super(driver);
	  PageFactory.initElements(driver, this);      
  
  }


  public boolean slideImage()
  {
		  
	  boolean el=imageSlide.isDisplayed();
       return el;
  }


public int sliderCount()
{
	
     int p=slideAll.size();
     System.out.println("the number of slides are\n"  +p);
       return p;

}

public int socialLinks()

{
	 
      int n=socialLink.size();
      System.out.println("the number of social links are"+ n);
       return n;

  }



}

