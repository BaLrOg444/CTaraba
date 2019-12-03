package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasicPage{

	private By email = By.name("email");
	private By password = By.name("password");
	private By rememberMe = By.className("checkbox");
	private By loginBtn = By.cssSelector("button[type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	public void clickOnRememberMe() {
		this.driver.findElement(this.rememberMe).click();
	}
	
	public void clickOnLoginBtn() {
		this.driver.findElement(this.loginBtn).click();
	}
	
	public void singIn(String email, String password, boolean rememberMe) {
		this.setEmail(email);
		this.setPassword(password);
		
		if (rememberMe) {
			this.clickOnRememberMe();
		}
		
		this.clickOnLoginBtn();
	}
	
	
}
