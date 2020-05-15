package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bankwire;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement confirmBtn;
	@FindBy(xpath="//p[contains(@class,'cheque')]")
	WebElement OrderConfirmation;
	
 WebDriver driver;


		public PaymentPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);	
		}

		public void clickbankwire()
		{
			bankwire.click();
		}
		
		public void clickConfirmBtn()
		{
			confirmBtn.click();
		}
		public void verifyOrderConfirmation()
		{
			System.out.println(OrderConfirmation.getText());
		}
		
		
		
		public void orderConfirmation() {
			this.clickbankwire();
			this.clickConfirmBtn();
			this.verifyOrderConfirmation();
		
		}
		
}