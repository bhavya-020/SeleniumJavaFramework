import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
}
