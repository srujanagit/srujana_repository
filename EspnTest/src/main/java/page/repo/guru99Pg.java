package page.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class guru99Pg {

	WebDriver driver;
	
	 public guru99Pg(WebDriver driver) {
		this.driver = driver;
	}
	

	By testing=By.xpath("//*[@id='maximenuck243']/div[2]/ul/li[3]/a/span");
	
	 By selen=By.xpath("//*[@id='maximenuck243']/div[5]/div[1]/div/div[2]/ul/li[1]");


public WebElement guruPage(){
	return driver.findElement(testing);
}

public WebElement guruPageSelenium(){
	return driver.findElement(selen);
}
}