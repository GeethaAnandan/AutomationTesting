package com.TestSelenium.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestSelenium.config.CheckDriver;
import com.TestSelenium.config.ReadingFromPropertyFile;
import com.TestSelenium.pages.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	LoginPage login;
	ReadingFromPropertyFile property;
	@BeforeTest
	public void getDriver()
	{
		driver =CheckDriver.getDriver(property.getProperty("ChromeBrowser"), property.getProperty("Url"));
		login=new LoginPage(driver);
		//PageFactory.initElements(driver, LoginPage.class);
		//driver.manage().window().maximize();
	}
	@Test
	public void loginTest()
	{
		
		login.enterUserName(property.getProperty("UserName"));
		login.enterPassword(property.getProperty("Password"));
		login.clickLogin();
		driver.close();
	}

}
