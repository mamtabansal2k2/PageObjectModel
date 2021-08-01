package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EnterPasswordPage;
import pages.EnterUsernamePage;
import pages.HomePage;
import pages.LaunchPage;
import pages.SearchPage;

public class LoginTest {
	WebDriver driver;
	@BeforeTest(alwaysRun=true)
	public void loginTest() {
		System.setProperty("webdriver.gecko.driver","C:\\Mamta\\Drivers\\geckodriver26version\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		LaunchPage lp = new LaunchPage(driver);
		HomePage hp = lp.navigateToHomePage();
		//hp.validateTitle("dsfsfsfs");
		EnterUsernamePage usernamePage = hp.gotoLoginPage();
		EnterPasswordPage passwordPage = usernamePage.submitUsername("mamtabansal2k2@gmail.com");
		passwordPage.submitPassword("seltst123");
		
	}
	@Test
	public void checkoutBook() {
		SearchPage searchBook = new SearchPage(driver);
		searchBook.searchBook();		
		
	}
	
	

}
