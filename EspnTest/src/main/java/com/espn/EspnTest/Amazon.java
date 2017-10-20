package com.espn.EspnTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.repo.AmazonRepo;
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

public class Amazon {

	public static WebDriver driver;
	public static Properties pro;
	static int c=0,n;
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
		driver.get(pro.getProperty("amzurl"));
		AmazonRepo ar= new AmazonRepo(driver);
		
		ar.SearchItem().sendKeys("oil");
		ar.SubmitItem().click();
		String result=ar.ItemsNum().getText();
		String[] totResults= result.split(" ");
		System.out.println(totResults[2]);
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView()", ar.nextPage());
		
		while( ar.nextPage().isDisplayed()){
	
		 n= ar.pageresult();
			c=c+n; 
			/*JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].scrollIntoView()", ar.nextPage());*/
			ar.nextPage().click();
			continue ;

		}
		System.out.println(c);
		
		
		/*System.out.println(ar.pageresult());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(772, 4106)"); 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", ar.nextPage()); 
		ar.nextPage().click();
		
		System.out.println(ar.pageresult());*/
		
	}
}
