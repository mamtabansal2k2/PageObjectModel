package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import reports.ExtentManager;

public class TestBase {
	
	public WebDriver driver;
	ExtentReports rep;
	ExtentTest test;
	
	public WebDriver initialize(String browserName) {
		
		/*Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"//src//test//resources//project.properties";
		FileInputStream fs = new FileInputStream(path); 
		prop.load(fs);
		String browserName = prop.getProperty("browser");*/
		if(browserName.equals("chrome")) {
			
			
		}else if(browserName.equals("mozilla")) {
			System.setProperty("webdriver.gecko.driver","C:\\Mamta\\Drivers\\geckodriver26version\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
		
	}
/*	@AfterTest
	public void quit() {
		driver.quit();
	}*/
	@BeforeMethod
	public void init(ITestResult result) {
			
		 rep = ExtentManager.getReports();
		 test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
	}
	
	@AfterMethod
	public void after() {
		rep.flush();
		
	}
	/************Utility functions***********************/
	public void log(String msg) {
		test.log(Status.INFO,msg);
	}
	public void reportFailure(String failureMsg) {
		//System.out.println(failureMsg);
		test.log(Status.FAIL,failureMsg);  //failure in extent reports
	}
	public boolean isElementPresent(String locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try { 
			
				wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(locator))));
			
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	public void validateTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
