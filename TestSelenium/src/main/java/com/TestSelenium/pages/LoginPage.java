package com.TestSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*By username =By.id("inputEmail");
	By password = By.id("inputPassword");
	By login =By.id("login");
	*/
	@FindBy(id="inputEmail")
	WebElement username;
	
	@FindBy(id="inputPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	
	
	public void enterUserName(String name)
	{
		username.sendKeys(name);
	}

	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
