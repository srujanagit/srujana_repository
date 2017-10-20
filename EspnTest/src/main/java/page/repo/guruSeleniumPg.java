package page.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class guruSeleniumPg {

	WebDriver driver;
	
	 public guruSeleniumPg(WebDriver driver) {
		this.driver = driver;
	}
	
	
	 By sevendays=By.xpath("//*[@id='philadelphia-element-title-content']/strong");
	 By sapcar=By.xpath("//*[@id='g-footer']/div/div[1]/div/div/div[1]/div/div/div[4]/div[1]/div/div/a[1]");

public WebElement guruPageSev(){
	return driver.findElement(sevendays);
}
public WebElement guruPageSap(){
	return driver.findElement(sapcar);
}
}