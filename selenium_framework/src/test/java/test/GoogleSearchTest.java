package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		
//		WebElement searchbox = driver.findElement(By.name("q"));
//		searchbox.sendKeys("song");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("song");
		
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
