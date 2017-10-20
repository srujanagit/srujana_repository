package page.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleRepo {

	public WebDriver driver;

	public GoogleRepo(WebDriver wd) {
		this.driver = wd;
	}

	By gosearch = By.xpath("//input[@id='lst-ib']");
	By links = By.tagName("a");
	By serchelem = By.xpath("//a[@data-href='https://draxe.com/top-10-foods-high-selenium/']");
	By pgcount = By.xpath("//div[@id='navcnt']");
	By nextpg = By.xpath("//span[text()='Next']");

	public WebElement SearchItem() {
		return driver.findElement(gosearch);
	}

	public WebElement searchNxt() {
		return driver.findElement(nextpg);
	}

	
	public void googleSearch() {

		int count = driver.findElements(pgcount).size();
		for (int n = 1; n <= count; n++) {
			System.out.println("im here 1");
			List<WebElement> list = driver.findElements(links);
			for (WebElement link : list) {
				if (link.getText().contains("High in Selenium")) {
					link.click();
					System.out.println("im here 2");
					break;

				}

				else{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView()", searchNxt());
			System.out.println("im here");
			searchNxt().click();
				}
			
			
		}

	}
}
	
	public void googlePg() {
	
while(driver.findElements(By.xpath("//*[@href='https://saucelabs.com/products/open-source-frameworks']")).size()==0){
			
			WebElement element=driver.findElement(By.xpath("//*[@style='display:block;margin-left:53px']"));
			JavascriptExecutor e1= (JavascriptExecutor) driver;
			e1.executeScript("arguments[0].scrollIntoView ", element);
			element.click();
			continue;
			
		}
		System.out.println("im here");
		WebElement element1=driver.findElement(By.xpath("//*[@href='https://saucelabs.com/products/open-source-frameworks']"));
		
		element1.click();
		
		/*WebElement we= driver.findElement(serchelem);
		while(driver.findElements(serchelem).size()==0){
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView()", searchNxt());
			searchNxt().click();	
		continue;
		}
		
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView()",we);
		we.click();
		;*/
	}

}
