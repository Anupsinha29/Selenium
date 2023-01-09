package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	@Test
	
	public  void readDataFromExcel() throws EncryptedDocumentException, IOException {
	
		FileInputStream fis = new FileInputStream("./target/Practice.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(data);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(data);
		

	}

}
