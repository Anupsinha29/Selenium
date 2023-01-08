package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchUrlFromPropertyFile {

	@Test
	public void fetchDataFromPropertyFile() throws IOException {
		
		FileInputStream fis = new FileInputStream("./target/PropertyFile.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("url");
		
	

	}

}
