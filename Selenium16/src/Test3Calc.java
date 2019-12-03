import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3Calc {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.desmos.com/scientific");
		Thread.sleep(3000);
		WebElement wb9= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[1]/div[7]/span"));
		wb9.click();
		wb9.click();
		
		WebElement wb8=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[1]/div[6]/span"));
		wb8.click();
		
		WebElement wbplus=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[4]/div[8]/span"));
		wbplus.click();
		
		WebElement wb4=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[2]/div[5]/span"));
		wb4.click();
		WebElement wb0=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[4]/div[5]/span"));
		wb0.click();
		wb8.click();
		
		WebElement wbE=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/div[2]/div/div/div[4]/div[9]/span"));
		
		wbE.click();

	}

}
