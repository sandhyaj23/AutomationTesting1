package com.atc.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
		public static WebDriver driver;
		
		  @Test(priority=0)
		  public void loginTest() {
			  
			  Login login=new Login(driver);
			  login.logintoHome("sandhya.j.div@gmail.com", "Qwerty123"); 
		  }
		  
		  
		  @Test(priority=1,dependsOnMethods = {"loginTest"})
		  public void addProductandCheckOut() throws Exception
		  {
			  AddressPage add = new AddressPage(driver);
			  add.addressPage("ATC","F2 Tagore Flats","Test Address","Chennai","99501","Alaska","United States","9910000002","9999123346","Test Address", "Test87");
			  CheckoutPage check=new CheckoutPage(driver);
			  check.addToCartAndProceed();
			  PaymentPage payment = new PaymentPage(driver);
			  payment.orderConfirmation();
			  ProfilePage profile = new ProfilePage(driver);
			  profile.orderHistory();
			  OrderHistory order=new OrderHistory(driver);
			  order.takeScreenCaptureOrderHistory();
			  SignOut signoutpage = new SignOut(driver);
			  signoutpage.signOutPage();
		 
				  
		  }
		  
		

		  
		  @BeforeClass
		  public void beforeClass() {
			  
			 		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("http://automationpractice.com/index.php");
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					driver.manage().window().maximize();
											
				}
		  
		  @AfterClass
		  public void afterClass() {
			  
			  driver.quit();
		  }

}
