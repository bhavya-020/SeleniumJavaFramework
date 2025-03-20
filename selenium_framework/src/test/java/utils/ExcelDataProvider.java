package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
//	public static void main(String[] args) {
//		String excelPath = "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\excel\\DATA.xlsx";
//		testData(excelPath, "Sheet1");
//	}
	
	WebDriver driver;

	
	@BeforeTest
	public void starting() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username , String password) throws InterruptedException {
		System.out.println(username + " " + password);
		
		driver.get("https://dribbble.com/session/new");
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).sendKeys(Keys.RETURN);		
		
		Thread.sleep(2000);
	}
	
	
	@DataProvider(name ="test1data")
	public Object[][] getData(){
		String excelPath = "C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\excel\\DATA.xlsx";
		
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	
	public static Object[][] testData(String excelPath , String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath , sheetName);
		int rowCount = excel.getRowCount();
		int columnCount= excel.getColumnCount();
		
		Object data[][]= new Object[rowCount][columnCount];
		
		for(int i = 0;i<rowCount ;i++) {
			for(int j = 0;j<columnCount;j++) {
				
				String Celldata = excel.getCellStringData(i, j);
//				System.out.print(Celldata + " | ");
				data[i][j] = Celldata;
				
			}
			System.out.println();
		}
		return data;
	}

}
