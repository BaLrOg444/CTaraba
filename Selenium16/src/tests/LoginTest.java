package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test
	public void basicLogin() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		LoginPage lg = new LoginPage(driver);
		lg.singIn("admin@phptravels.com", "demoadmin", true);
//		lg.singIn("admin@phptravels.com", "demoain", true); // invalid login example
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isLogged());
	}
	
}
