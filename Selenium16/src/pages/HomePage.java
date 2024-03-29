package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasicPage {

	private By logout = By.id("logout");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getLogoutBtn() {
		return this.driver.findElement(this.logout);
	}
	
	public boolean isLogged() {
		return getLogoutBtn().getText().contains("Logout");
	}
	
	public void logout() {
		getLogoutBtn().click();
	}

}
