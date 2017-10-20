package page.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonRepo {

	public WebDriver driver;
	public AmazonRepo(WebDriver wd){
		this.driver=wd;
	}
	
	By search =By.xpath("//input[@type='text']");
	By submit =By.xpath("//input[@value='Go']");
	By item =By.xpath("//h2[@id='s-result-count']");
	By pageresult =By.xpath("//div[@id='resultsCol']");
	By numitems =By.xpath("//li[contains(@class, 's-result-item ')]");
	By nextpg =By.xpath("//span[@id='pagnNextString']");
	
	
	public WebElement SearchItem(){
		return driver.findElement(search);
	}
	
	public WebElement SubmitItem(){
		return driver.findElement(submit);
	}
	public WebElement ItemsNum(){
		return driver.findElement(item);
	}
	
	public int pageresult(){
		
		return  driver.findElement(pageresult).findElements(numitems).size();
	}
	
	public WebElement nextPage(){
		return driver.findElement(nextpg);
	}
}
