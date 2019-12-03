package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EbaySearchPage;
import pages.EbaySearchResutPage;

public class EbaySearchResultTest extends BasicTest {

	private String baseUrl = "https://www.ebay.com";

	@Test
	public void ebaySearchCounter() throws InterruptedException {
		this.driver.get(baseUrl);
		Thread.sleep(2000);
		
		EbaySearchPage esp = new EbaySearchPage(driver);
		esp.search("shoes");
		Thread.sleep(2000);
		
		EbaySearchResutPage esrp = new EbaySearchResutPage(driver);
		int count = esrp.getResultCount();
		
		Assert.assertEquals(count, 24);
	}
	
	
	
	
	
	
	
	
}
