package cloudBasedTestingPlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

public class SauceLabsDemo {
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		// 🔹 Sauce Labs Credentials (Replace with your actual credentials)
		String SAUCE_USERNAME = "oauth-bhavya6155-849f1";
		String SAUCE_ACCESS_KEY = "bfca0899-b7ba-41cb-bf4e-b7212930a39c";

		// 🔹 Sauce Labs URL (For cloud execution)
		URI sauceUri = new URI(
				"https://" + SAUCE_USERNAME + ":" + SAUCE_ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub");

		// 🔹 Set desired capabilities (Define Browser, OS, Version)
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "edge"); // Browser
		caps.setCapability("browserVersion", "latest"); // Browser Version
		caps.setCapability("platformName", "Windows 11"); // OS

		// 🔹 Create a remote WebDriver instance (Updated with URI)

        WebDriver driver = new RemoteWebDriver(sauceUri.toURL(), caps);
		
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();

		try {
			// ✅ Open Google
			driver.get("https://www.google.com");
			System.out.println("Opened Google on Sauce Labs");

			// ✅ Find search box & enter text
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium Sauce Labs");
			searchBox.submit();

			// ✅ Print Title
			System.out.println("Page title is: " + driver.getTitle());
		} finally {
			// ✅ Close browser
			driver.quit();
			System.out.println("Test Completed on Sauce Labs!");
		}
	}
}
