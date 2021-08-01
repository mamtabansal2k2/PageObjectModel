package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUsernamePage extends BasePage {
	//WebDriver driver;
	
	@FindBy(css = Constants.LOGIN_ID)
	WebElement loginId;
	
	@FindBy(css = Constants.CONTINUE_BUTTON)
	WebElement continueButton;
	
	public EnterUsernamePage(WebDriver driver) {
		super(driver);
	}

	public EnterPasswordPage submitUsername(String userid) {
		//driver.findElement(By.cssSelector("#ap_email")).sendKeys(userid);
		loginId.sendKeys(userid);
		//driver.findElement(By.cssSelector("#continue.a-button-input")).click();
		continueButton.click();
		return new EnterPasswordPage(driver);
	}

}
