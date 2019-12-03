package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchPage extends BasicPage {

	private By searchInput = By.name("_nkw");
	
	
	public EbaySearchPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearchInput() {
		return this.driver.findElement(searchInput);
	}
	
	public void search(String term) {
		WebElement sInput = this.getSearchInput();
		sInput.sendKeys(term);
		sInput.sendKeys(Keys.ENTER);
	}
	
	
}
