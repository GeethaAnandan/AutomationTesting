package com.TestSelenium.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestSelenium.config.GetDriverAndUrl;
import com.TestSelenium.pages.OpenTicketPage;

public class OpenTicketWebElement {
WebDriver driver;
OpenTicketPage openTicketPage;
	
	@BeforeTest
	public void getDriver()
	{
		driver=GetDriverAndUrl.getDriverUrl();
		openTicketPage =new OpenTicketPage(driver);
		
	}
	@Test
	public void getPage()
	{
		System.out.println("jj");
		openTicketPage.clickOpenTicketLink();
		String catcha = openTicketPage.getCatcha();
		System.out.println("catch is  :"+catcha);
		
	}
	
}
