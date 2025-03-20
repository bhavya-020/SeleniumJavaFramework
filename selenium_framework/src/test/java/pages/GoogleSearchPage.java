package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
	
	public static WebElement textbox_search(WebDriver driver){
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
		
	
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
//	
//	driver.get("https://www.youtube.com/");
//	
//	
//	WebElement searchbox = driver.findElement(By.name("search_query"));
//	searchbox.sendKeys("song");
//	driver.findElement(By.name("search_query")).sendKeys(Keys.RETURN);
//	
	
	}

}
