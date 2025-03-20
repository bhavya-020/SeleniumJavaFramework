import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_IE_TestNG {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void starting() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void googleSearch() {
		

		driver.get("https://google.com");
		
//		 EdgeOptions options = new EdgeOptions();
//	        options.addArguments("--inprivate"); // Open Edge in Incognito (InPrivate) mode
//
//	        // Launch Edge with Incognito mode
//	        WebDriver driver = new EdgeDriver(options);
//	        driver.get("https://www.google.com");
		
//		driver.findElement(By.name("q")).sendKeys("");
		//-------------------------------
//		 Actions actions = new Actions(driver);
//
//	        // Press ALT + SHIFT
//	        actions.keyDown(Keys.CONTROL)
//	               .keyDown(Keys.SHIFT)
//	               .sendKeys("N")
//	               .keyUp(Keys.SHIFT)
//	               .keyUp(Keys.CONTROL)
//	               .perform();
		//===================
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		searchbox.submit();
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//OPTIONSL
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		driver.findElement(By.className("yt-simple-endpoint style-scope ytd-video-renderer")).click();
	}
	
	@AfterTest
	public void ending() {
//		driver.close();
//		driver.quit();
		System.out.println("COMpleted-------------------");
		
	}

}
