package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	
	@FindBy(xpath="//a[@class='account']")
	WebElement accountpage;
	@FindBy(xpath="//a[@title='Orders']")
	WebElement Orderhistory;
 WebDriver driver;


public ProfilePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}


public void clickProfile()
{
	
	accountpage.click();
}
public void clickOrderButton()
{
	Orderhistory.click();
	
}


public void orderHistory() {
	this.clickProfile();
	this.clickOrderButton();
}
	
}

