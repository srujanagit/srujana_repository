package com.espn.EspnTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.repo.AmazonRepo;
import page.repo.GoogleRepo;
import page.repo.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {

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
	public void search(){
		driver.get(pro.getProperty("gogurl"));
		GoogleRepo gr= new GoogleRepo(driver);
		gr.SearchItem().sendKeys("selenium");
		gr.SearchItem().submit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gr.googlePg();
		
	}
}
