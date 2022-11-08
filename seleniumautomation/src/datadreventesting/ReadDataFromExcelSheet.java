 package datadreventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="./recourse/exceldata.xlsx";
		String sheetname="TC01";
		//create an object for FileInputStream of java to pass the physical excel file path
		FileInputStream file = new FileInputStream(path);
		//create workbook object  by calling create method of WorkbookFactory
		Workbook workbook = WorkbookFactory.create(file);
		String url = workbook.getSheet(sheetname).getRow(1).getCell(0).getStringCellValue();
		String name = workbook.getSheet(sheetname).getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet(sheetname).getRow(1).getCell(2).getStringCellValue();
		String urlz = workbook.getSheet(sheetname).getRow(2).getCell(0).getStringCellValue();
		System.out.println( url);
		System.out.println( name);
		System.out.println( password);
		System.out.println( urlz);
 
	}

}
