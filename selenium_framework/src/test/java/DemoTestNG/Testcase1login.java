package DemoTestNG;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class Testcase1login {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	  
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
    
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testCase1login() throws Exception {
    driver.get("https://www.google.com/search?q=orangehrm+login&rlz=1C1CHBF_enIN997IN997&oq=orangehrm+login&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIHCAEQABiABDIICAIQABgWGB4yDQgDEAAYhgMYgAQYigUyDQgEEAAYhgMYgAQYigUyDQgFEAAYhgMYgAQYigUyDQgGEAAYhgMYgAQYigUyBggHEEUYPNIBBzc0M2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div[3]/ul/li/span")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
//    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
