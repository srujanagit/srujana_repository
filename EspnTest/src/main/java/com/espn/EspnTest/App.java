package com.espn.EspnTest;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele= driver.findElement(By.id("lst-ib"));
		ele.sendKeys("selenium");
		ele.submit();
		java.util.List<WebElement> l=driver.findElements(By.xpath("//h3[@class='r']"));
		System.out.println("total no links :"+l.size());
		
	/*	for(WebElement l1:l){
			System.out.println("im again here");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!l1.getText().equalsIgnoreCase("Open Source Frameworks | Sauce Labs")){
				System.out.println("im again here");
				WebElement element=driver.findElement(By.xpath("//*[@style='display:block;margin-left:53px']"));
				JavascriptExecutor e1= (JavascriptExecutor) driver;
				e1.executeScript("arguments[0].scrollIntoView ", element);
				System.out.println("im here");
				element.click();
				System.out.println("im here");	
				
			}
			
			
		}*/
		
		while(driver.findElements(By.xpath("//*[@href='https://saucelabs.com/products/open-source-frameworks']")).size()==0){
			
			WebElement element=driver.findElement(By.xpath("//*[@style='display:block;margin-left:53px']"));
			JavascriptExecutor e1= (JavascriptExecutor) driver;
			e1.executeScript("arguments[0].scrollIntoView ", element);
			
			element.click();
			continue;
			
		}
		System.out.println("im here");
		WebElement element1=driver.findElement(By.xpath("//*[@href='https://saucelabs.com/products/open-source-frameworks']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()",element1 );
		element1.click();
			
    }
}