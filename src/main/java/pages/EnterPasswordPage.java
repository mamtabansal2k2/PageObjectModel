package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPasswordPage extends BasePage {

	@FindBy(css = Constants.LOGIN_PASSWORD)
	WebElement loginPassword;
	
	@FindBy(css = Constants.SIGN_IN_SUBMIT)
	WebElement signinButton;
		
	public EnterPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public void submitPassword(String password) {
		//driver.findElement(By.cssSelector("#ap_password")).sendKeys(password);
		loginPassword.sendKeys(password);
		//driver.findElement(By.cssSelector("#signInSubmit")).click();
		signinButton.click();
	}
	
	

}
