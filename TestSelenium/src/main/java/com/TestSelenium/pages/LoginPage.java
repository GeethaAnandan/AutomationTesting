package com.TestSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By username =By.id("inputEmail");
	By password = By.id("inputPassword");
	By login =By.id("login");
	
	public void enterUserName(String name)
	{
		driver.findElement(username).sendKeys(name);
	}

	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
}
