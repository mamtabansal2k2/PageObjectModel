package pages;

import org.openqa.selenium.WebDriver;

public class LaunchPage extends BasePage {
	
	public LaunchPage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigateToHomePage() {
		driver.get("https://www.amazon.com/");
		return new HomePage(driver);
	}

}
