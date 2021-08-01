package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	//WebDriver driver;
	@FindBy(css = Constants.LOGIN_LINK)
	WebElement loginLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public EnterUsernamePage gotoLoginPage() {
		
		//driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
		loginLink.click();
		return new EnterUsernamePage(driver);
	}
	
	
}
