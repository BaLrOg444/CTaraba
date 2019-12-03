package z11192019;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		//Otici na sajt https://www.ebay.com zatim na
		//Advanced Search, na novoj stranici iz dropdown-a liste "In this category:"
		//izvuci sve podatke i proveriti da li postoji kategorija Books
		//Ukoliko postoji izabrati je ukoliko ne postoji izabrati kategoriju Art
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);

		WebElement wbAdv = driver.findElement(By.id("gh-as-td"));
		wbAdv.click();
		Thread.sleep(3000);
		
		WebElement selectElement = driver.findElement(By.id("e1-1"));
		Select select = new Select(selectElement);
		List<WebElement> allOptions = select.getOptions();
		
		boolean booksFound = false;
		for (int i = 0; i < allOptions.size(); i++) 
		{
			System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).getText().contains("Books"))
			{
				booksFound = true;
			}
		}
		// art books travel
		if (booksFound) 
		{
			select.selectByVisibleText("Books");
		}
		else
		{
			select.selectByVisibleText("Art");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

