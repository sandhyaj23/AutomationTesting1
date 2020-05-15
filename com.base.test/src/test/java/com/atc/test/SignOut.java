package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {

	WebDriver driver;
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement SignOut;


	public SignOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signoutBtn() {
		SignOut.click();
	}
	
	public void signOutPage() {
		
		this.signoutBtn();
	}
}