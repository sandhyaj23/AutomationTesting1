package com.atc.test;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class OrderHistory {
	
	WebDriver driver;
	
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void takeScreenCaptureOrderHistory() throws Exception
	{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(f, new File(System.getProperty("user.dir")+"/screenshot/SS"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {

			throw new Exception("Unable to take screenshot"+e.getMessage());
		}
		
		
	}
	
	
}
