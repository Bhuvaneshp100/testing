 package demoactitime11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testcase1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="./recourse/exceldata.xlsx";
		String sheetname="TC01";
		FileInputStream file = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(file);
		String url = workbook.getSheet(sheetname).getRow(1).getCell(0).getStringCellValue();
		String username = workbook.getSheet(sheetname).getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet(sheetname).getRow(1).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.logins(username, password); 

	}

}
