package z11192019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEbay {

	public String baseUrl = "https://www.ebay.com";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyHomePageTitle() {
		driver.get(baseUrl);
		String expectedTitle = "reElectronics, Cars, Fashion, Collectibles, "
				+ "Coupons and More | eBay";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void quit() {
		driver.close();
	}
}
