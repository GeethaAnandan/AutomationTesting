package com.TestSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTicketPage {
	
	WebDriver driver;
	public OpenTicketPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=".//*[@id='Primary_Navbar-Open_Ticket']/a")
	WebElement openTicketLink;
	
	@FindBy(css=".col-md-6.margin-bottom>p>strong>a")
	WebElement sale;
	
	@FindBy(id="inputCaptchaImage")
	WebElement captcha;
	
	public void clickOpenTicketLink()
	{
		openTicketLink.click();
		sale.click();
	}
	public String getCatcha()
	{
		String value = captcha.getText();
		return value;
	}
}
