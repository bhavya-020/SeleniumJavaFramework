import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DesiredCapabilities_Demo {

	static WebDriver driver;

	public static void main(String[] args) {

		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--headless");

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

}
