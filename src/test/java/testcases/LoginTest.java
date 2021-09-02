package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;



import dataprovider.TestDataProvider;
import pages.Constants;
import pages.EnterPasswordPage;
import pages.EnterUsernamePage;
import pages.HomePage;
import pages.LaunchPage;
import pages.SearchPage;
import reports.ExtentManager;

public class LoginTest extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class,dataProvider = "getData")
	public void loginTest(String browser,String userName,String password,String bookName) {
		
		log("Starting Login Test");
	    driver = initialize(browser);
		LaunchPage lp = new LaunchPage(driver);
		HomePage hp = lp.navigateToHomePage();
		//validateTitle("dsfsfsfs");
		EnterUsernamePage usernamePage = hp.gotoLoginPage();
		EnterPasswordPage passwordPage = usernamePage.submitUsername(userName);
		passwordPage.submitPassword(password);
	
		if(!(isElementPresent(Constants.SEARCH_BOX))) {
			Assert.fail();
			reportFailure("Login Failed");
		}
		SearchPage searchBook = new SearchPage(driver);
		searchBook.searchBook(bookName);	
		log("Ending login test");
	
	}
}
