package z11192019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayFreeShippingShoes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);

		WebElement searchInput = driver.findElement(By.name("_nkw"));
		searchInput.sendKeys("shoes");
		searchInput.sendKeys(Keys.ENTER);

		List<WebElement> result = 
				driver.findElements(By.cssSelector("ul.srp-results li.s-item"));

		for (int i = 0; i < result.size(); i++) {
			WebElement card = result.get(i);
			WebElement title = card.findElement(By.className("s-item__title"));
			WebElement price = card.findElement(By.className("s-item__price"));
//			card.findElement(By.cssSelector("span.s-item__shipping.s-item__logisticsCost"));
			WebElement shipping = card.findElement(By.className("s-item__shipping"));
			
			if (shipping.getText().contains("Free International Shipping")) {
				System.out.println(title.getText() + ": " + price.getText() + " " + shipping.getText());

			}
		}
	
		
	}

}
