package com.TestSelenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class CheckDriver {
	static WebDriver driver;
	
	public static WebDriver getDriver(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe"); // path to chrome exe that you have downloaded form given url (below)
			 driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty(" webdriver.ie.driver", "C:\\SeleniumDrivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		return driver;
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe"); // path to chrome exe that you have downloaded form given url (below)
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		System.setProperty(" webdriver.ie.driver", "C:\\SeleniumDrivers\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("http://www.google.co.in");
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
		WebDriver drive = new FirefoxDriver();
		drive.get("http://www.google.co.in");
	}
		
	
}
