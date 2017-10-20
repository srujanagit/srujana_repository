package com.espn.EspnTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.repo.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook {

	public static WebDriver driver;
	public static Properties pro;
	@BeforeClass
	public void browserInv() throws IOException {

		 pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Desktop\\ConsultancyClass\\EspnTest\\global.properties");
		pro.load(fis);
		String browse= pro.getProperty("browser");
		
		if(browse.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browse.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		else if(browse.equals("IE")){
			System.setProperty("webdriver.ie.driver","C://IEDriverServer.exe");
			driver =new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void login(){
		driver.get(pro.getProperty("fburl"));
		HomePage hp= new HomePage(driver);
		hp.getEmail().sendKeys("srujanau6@gmail.com");
		hp.getPwd().sendKeys("suji6Fab");
		hp.ClickSubmit().click();
	}
	@Test
	public void loginWithDataSets(){
		
	}
	
/*	@DataProvider(name="loginDetails")
	public static Object[][] getData(){
		 Object[][] obj= new  Object[2][2];
		 obj[0][1]={};
		return null;
		
	}*/
}
