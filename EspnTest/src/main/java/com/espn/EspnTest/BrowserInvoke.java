package com.espn.EspnTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInvoke {

	public static WebDriver driver;
	public static Properties pro;
	public WebDriver callMethod() throws IOException {

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
		return driver;
	}
 

}
