package z11192019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEbayPagination {
	public String baseUrl = "https://www.ebay.com";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyHomePageTitle() throws InterruptedException {
		driver.get("https://www.ebay.com/sch/i.html?_nkw=shoes");
		Thread.sleep(2000);
		
		// search term "shoes"
//		WebElement searchInput = driver.findElement(By.name("_nkw"));
//		searchInput.sendKeys("shoes");
//		searchInput.sendKeys(Keys.ENTER);

		List<WebElement> itemsPerPage = driver.findElements(By.cssSelector("#ipp-menu-list li"));
		itemsPerPage.get(0).click();
//		Thread.sleep(2000);
		
		List<WebElement> result = driver.findElements(By.cssSelector("ul.srp-results li.s-item"));
		
		Assert.assertEquals(result.size(), 24);
	}
	
	@AfterTest
	public void quit() {
		driver.close();
	}
}
