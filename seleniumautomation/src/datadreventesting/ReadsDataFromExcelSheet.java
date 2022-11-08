package datadreventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadsDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="./recourse/excelsheet1.xlsx";
		String sheetname="TC02";
		FileInputStream file = new FileInputStream(path);
		
		Workbook workbook = WorkbookFactory.create(file);
		 double number = workbook.getSheet(sheetname).getRow(1).getCell(3).getNumericCellValue();
		boolean flag = workbook.getSheet(sheetname).getRow(1).getCell(4).getBooleanCellValue();
		System.out.println( number);
		System.out.println( flag);
	}

}
