package com.wbl.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.Base.BasePage;

public class LoginPage extends BasePage{
   
	@FindBy(how=How.ID,using="loginButton")
	 WebElement loginLink;
	
	@FindBy(how=How.ID,using="username")
	 WebElement loginUser;
	
	@FindBy(how=How.ID,using="password")
	  WebElement loginPassword;
	  
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]")
	  WebElement loginButton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"logout\"]")
	   WebElement logoutButton;
	
	  
	  
	  public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);  

	}


	public String loginLink()
	{
		//driver.findElement(By.id(loginLink)).click();
	     loginLink.click();
	    System.out.println(driver.getCurrentUrl());
	    return driver.getCurrentUrl();
	}


   public boolean performLogin(String username,String password)
   {
	   
     loginUser.sendKeys(username);
     loginPassword.sendKeys(password);
     loginUser.clear();
     loginPassword.clear();
     loginButton.click();
     return logoutButton.isDisplayed();
   
   }






}
