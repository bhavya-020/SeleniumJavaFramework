package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoITDemo {
	
	
	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium_framework\\Driver\\edgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://tiiny.host/");
		
		driver.findElement(By.xpath("//*[@id=\"content-selector-tabpane-documents\"]/div/div/div[2]/button")).click();
		System.out.println("clicling");
		
		
		ProcessBuilder processBuilder = new ProcessBuilder("D:\\FileUploadScript.exe");
		System.out.println("doing");
		
		
		processBuilder.start();
		System.out.println("done");
//        Process process = processBuilder.start();
//		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		
	}

}
