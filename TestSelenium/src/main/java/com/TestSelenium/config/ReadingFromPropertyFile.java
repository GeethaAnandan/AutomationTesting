package com.TestSelenium.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromPropertyFile {
	static FileReader read=null;
	public static String getProperty(String key) 
	{
		String userdir= System.getProperty("user.dir")+"\\src\\main\\resources\\"+"Environment.properties";
		
		try {
			read = new FileReader(userdir);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return prop.getProperty(key);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path;
		try {
			
			String userdir= System.getProperty("user.dir")+"\\src\\main\\resources\\"+"Environment.properties";
			System.out.println(userdir);
			//path="D:\\workspace-sts-3.9.4.RELEASE\\seleniumAutomation\\src\\main\\resources\\Environment.properties";
			FileReader read = new FileReader(userdir);
			
			Properties prop = new Properties();
			prop.load(read);
			
			System.out.println("username is "+prop.getProperty("userName"));
			System.out.println("password is :"+prop.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
