package com.atc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	WebElement womentab;
	@FindBy(xpath = "//a[@title='Blouse' and @class = 'product-name']")
	WebElement product;
	@FindBy(xpath = "//p[@id='add_to_cart']/button")
	WebElement addtocart;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement checkout1;
	@FindBy(xpath = "//a[@title='Proceed to checkout' and contains(@class,'standard-checkout')]")
	WebElement checkout2;
	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement checkout3;
	@FindBy(id = "cgv")
	WebElement terms;
	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement checkout4;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTab() {
		womentab.click();
	}

	public void selectProduct() {
		product.click();
	}

	public void addToCartButton() {
		addtocart.click();
	}

	public void checkOutButton() {
		checkout1.click();
	}

	public void standardCheckOut() {
		checkout2.click();
	}

	public void processCheckOut() {
		checkout3.click();
	}

	public void finalCheckOut() {
		terms.click();
		checkout4.click();
	}

	public void addToCartAndProceed() {
		this.clickTab();
		this.selectProduct();
		this.addToCartButton();
		this.checkOutButton();
		this.standardCheckOut();
		this.processCheckOut();
		this.finalCheckOut();
	}
}
