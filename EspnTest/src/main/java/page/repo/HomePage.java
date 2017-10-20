package page.repo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By test = By.xpath("//*[@id='g-footer']/div/div[1]/div/div/div[1]/div/div/div[4]/div[3]/div/div/div/a/i");
	By login = By.xpath("//input[@name='email']");
	By pwd = By.xpath("//input[@name='pass']");
	By click = By.xpath("//input[@type='submit']");

	public WebElement teamsClick() {
		return driver.findElement(test);

	}

	public WebElement getEmail() {
		return driver.findElement(login);

	}

	public WebElement getPwd() {
		return driver.findElement(pwd);

	}
	public WebElement ClickSubmit() {
		return driver.findElement(click);

	}

}