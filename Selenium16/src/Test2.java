import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		//*[@id="search"]
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"search\"]"));
		wb.click();
		wb.sendKeys("Java");
		
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
	}

}
