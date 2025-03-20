package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EntendReportsBasicDemo {
	public static void main(String[] args) {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        

		
	}
}
