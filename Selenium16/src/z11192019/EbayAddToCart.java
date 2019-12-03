package z11192019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayAddToCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);

		WebElement searchInput = driver.findElement(By.name("_nkw"));
		searchInput.sendKeys("shoes");
		searchInput.sendKeys(Keys.ENTER);

		List<WebElement> result = driver.findElements(By.cssSelector("ul.srp-results li.s-item"));

		WebElement card = result.get(0);
		card.click();
		Thread.sleep(2000);
		
		
		List<WebElement> selectElements = 
			driver.findElements(By.cssSelector("form[name='viactiondetails'] select"));
		
		WebElement selectElement = selectElements.get(0);
		Select select = new Select(selectElement);
		select.selectByIndex(1);
		
		WebElement selectElement2 = selectElements.get(1);
		Select select2 = new Select(selectElement2);
		select2.selectByIndex(1);
		
		driver.findElement(By.id("isCartBtn_btn")).click();
		
	}
}
