package travel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayShoes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=shoes&_sacat=0");
		Thread.sleep(3000);

		List<WebElement> cards = 
				driver.findElements(By.className("s-item__title"));
		
		for (int i = 0; i < cards.size(); i++) {
			WebElement card = cards.get(i);
			System.out.println(card.getText());
		}
	}

}
