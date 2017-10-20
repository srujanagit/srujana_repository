package com.espn.test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.espn.EspnTest.BrowserInvoke;

import page.repo.HomePage;
import page.repo.guru99Pg;
import page.repo.guruSeleniumPg;


@Test
public class FirstTestCase extends BrowserInvoke {

	public void browserInvoke() throws IOException{
		driver= callMethod();
	driver.get(pro.getProperty("urls"));
		/*HomePage hp =new HomePage(driver);
		
		WebElement we=hp.teamsClick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		we.click();*/
	guru99Pg guru= new guru99Pg(driver);
	WebElement we=guru.guruPage();
	we.click();
	
	WebElement weg=guru.guruPageSelenium();
	weg.click();
	guruSeleniumPg sp=new guruSeleniumPg(driver);
	WebElement wd=sp.guruPageSev();
	System.out.println(wd.getText());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Actions actions = new Actions(driver);
	actions.moveToElement(sp.guruPageSap()).click();
	
	
	}

}