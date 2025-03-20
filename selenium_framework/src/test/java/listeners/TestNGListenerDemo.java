package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	WebDriver driver;
	
	@Test
	public void test1() {
		System.out.println(" i am inside Test 1");
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println(" i am inside Test 2");
//		Assert.assertTrue(false);
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test3() {
		System.out.println(" i am inside Test 3");
	}
	

}
