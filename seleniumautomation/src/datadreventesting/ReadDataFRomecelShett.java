package datadreventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFRomecelShett {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path="./recourse/excelsheet2.xlsx";
		String sheetname="TC03";
		FileInputStream file = new FileInputStream(path);
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(1).getPhysicalNumberOfCells();
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<cell;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue().toString());
			}
			System.out.println();
		}
		
		

	}

}
