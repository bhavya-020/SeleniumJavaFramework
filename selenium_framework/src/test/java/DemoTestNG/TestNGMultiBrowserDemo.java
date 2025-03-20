package DemoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver;
	
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("browserName is : " + browserName);
		
		if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");

			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\GeekoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
		
	}
	
	@Test
	public void test1() {
		
	}

}
