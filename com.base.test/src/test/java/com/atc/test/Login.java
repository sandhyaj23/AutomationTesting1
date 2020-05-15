package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

		
		WebDriver driver;
		@FindBy(xpath="//a[contains(text(),'Sign in')]") 
		WebElement signIn;
		
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(id="passwd")
		WebElement password;
		
		@FindBy(id="SubmitLogin")
		WebElement SignInButton;
		
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUsername(String uName) {
		username.sendKeys(uName);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}	
	public void clickSignIn() {
		signIn.click();
	}	
	public void signIn() {
		SignInButton.click();
	}	
	
		public void logintoHome(String name, String passwd)
		{
			this.clickSignIn();
			this.setUsername(name);
			this.setPassword(passwd);
			this.signIn();
			
		
		}
	}
