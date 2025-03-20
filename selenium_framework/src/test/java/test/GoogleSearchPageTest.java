package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 
		 GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		 
		 driver.get("http://google.com");
		 searchPageObj.setTextInSearchBox("abcd");
		 searchPageObj.clickSearchButton();
		 
	}

}
