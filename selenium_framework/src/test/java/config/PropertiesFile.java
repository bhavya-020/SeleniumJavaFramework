package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		getProperties();
		setProperties();
	}

	
	public static void getProperties() {

		try {
			Properties prop = new Properties();
			String location = System.getProperty("user.dir");

			InputStream input;
			input = new FileInputStream(location + "/src/test/java/config/config.properties");

			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	
	public static void setProperties() {		
		try {
			Properties prop = new Properties();
			String location = System.getProperty("user.dir");

			OutputStream output;
			output= new FileOutputStream (location + "/src/test/java/config/config.properties");
			
			prop.setProperty("browser", "edge");
			prop.store(output, null);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	
	
}
