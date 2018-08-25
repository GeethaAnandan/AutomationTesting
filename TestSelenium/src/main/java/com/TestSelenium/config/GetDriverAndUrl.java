package com.TestSelenium.config;

import org.openqa.selenium.WebDriver;

import com.TestSelenium.pages.LoginPage;

public class GetDriverAndUrl {
	static WebDriver driver;
	static LoginPage login;
	static ReadingFromPropertyFile property;

	public static WebDriver getDriverUrl() {
		driver =CheckDriver.getDriver(property.getProperty("ChromeBrowser"), property.getProperty("Url"));
		login=new LoginPage(driver);
		login.enterUserName(property.getProperty("UserName"));
		login.enterPassword(property.getProperty("Password"));
		login.clickLogin();
		driver.manage().window().maximize();
		return driver;
	}
}
