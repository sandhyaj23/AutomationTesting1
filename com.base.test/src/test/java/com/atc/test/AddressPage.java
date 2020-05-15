package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Addresses']")
	WebElement AddrBtn;
	
	@FindBy(xpath="//a[@title='Add an address']")
	WebElement AddressAdd;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement FirstName;
	
		@FindBy(xpath="//input[@id='lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement Company;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement Address1;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement Address2;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(name="id_state")
	WebElement State;
	
	@FindBy(name="postcode")
	WebElement Zipcode;
	
	@FindBy(id="id_country")
	WebElement Country;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(id="phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement AdditonalInfo;
	
	@FindBy(id="alias")
	WebElement Alias;
	
	@FindBy(xpath="//button[@id='submitAddress']")
	WebElement SaveBtn;
	
	
	public AddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addressbtnclick()
	{
		AddrBtn.click();
	}
	
	public void addnewaddress() {
		AddressAdd.click();
	}
	public void addressLine1(String addressLine1)
	{
		Address1.sendKeys(addressLine1);
	}
	
	public void addressLine2(String addressLine2)
	{
		Address2.sendKeys(addressLine2);
	}
	
	public void fName(String firstName)
	{
		FirstName.sendKeys(firstName);
		
	}
	
	public void lname(String lastname)
	{
		LastName.sendKeys(lastname);
	}
	
	public void city(String city)
	{
		City.sendKeys(city);
	}
	
	public void company(String Cmpny)
	{
		Company.sendKeys(Cmpny);
	}
	
	
	public void state(String state)
	{
		Select sel=new Select(State);
		if(!sel.getFirstSelectedOption().getText().equals(""))
		{
			sel.selectByVisibleText(state);
		}
	}
	
	public void zipCode(String zipCodeVal)
	{
		Zipcode.sendKeys(zipCodeVal);
	}
	
	public void country(String country)
	{
		Select sel=new Select(Country);
		if(!sel.getFirstSelectedOption().getText().equals(""))
		{
			sel.selectByVisibleText(country);
		}
	}
	
	public void home_phone(String hmephone) {
		
		Phone.sendKeys(hmephone);
		
	}
	
	public void mobile_phone(String mobile)
	{
		MobilePhone.sendKeys(mobile);
	}
	
	public void additional(String addninfo)
	{
		AdditonalInfo.sendKeys(addninfo);
	}
	
	public void aliasaddr(String aliasname)
	{
		if(!Alias.getAttribute("value").equals(""))
		{
		Alias.clear();
		Alias.sendKeys(aliasname);
		}
	}
	
	public void clickSave()
	{
		SaveBtn.click();
	}
	
	
	public void addressPage(String cmp, String add1, String add2, String cityname, String zipCod, String statename, String cnty, String phne, String mPhone, String addinfo1, String alias_name)
	{
		this.addressbtnclick();
		this.addnewaddress();
		//this.fName(fstname);
		//this.lname(lstname);
		this.city(cityname);
		this.company(cmp);
		this.addressLine1(add1);
		this.addressLine2(add2);
		this.zipCode(zipCod);
		this.state(statename);
		this.home_phone(phne);
		this.mobile_phone(mPhone);
		this.country(cnty);
		this.additional(addinfo1);
		this.aliasaddr(alias_name);
		this.clickSave();
	}
}
