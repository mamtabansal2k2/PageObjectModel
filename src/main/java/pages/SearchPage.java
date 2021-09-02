package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	
	@FindBy(css = Constants.SEARCH_BOX)
	WebElement searchBox;
	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	public void searchBook(String bookTitle) {
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("English Grammar for begineers");
		searchBox.sendKeys(bookTitle);
		searchBox.sendKeys(Keys.ENTER);
	}

}
