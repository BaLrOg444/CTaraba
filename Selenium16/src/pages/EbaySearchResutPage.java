package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchResutPage extends BasicPage {

	private By results = By.cssSelector("ul.srp-results li.s-item");
	
	public EbaySearchResutPage(WebDriver driver) {
		super(driver);
	}
	
	public List<WebElement> getResults() {
		return this.driver.findElements(results);
	}
	
	public int getResultCount() {
		return this.getResults().size();
	}
	
	
	
	
	
	
	
	
	
	
	
}
