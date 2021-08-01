package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validateTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}


}
