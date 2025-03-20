import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_googleSearch {
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
		
		WebElement searchbox = driver.findElement(By.name("search_query"));
		searchbox.sendKeys("song");
		driver.findElement(By.name("search_query")).sendKeys(Keys.RETURN);
		
//		driver.close();
//		driver.findElement(By.className("yt-simple-endpoint style-scope ytd-video-renderer")).click();
	}

}
