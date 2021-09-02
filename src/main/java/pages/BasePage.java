package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //This initElements method will create all WebElements
	}

	
}
