package revisee;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DEmo124 {

	public static void main(String[] args) throws Throwable, IOException {
		String filepath = "./recourse/demo1.xlsx";
		String sheetname = "sheet1";
		
		FileInputStream file = new FileInputStream(filepath);
		
		Workbook workbook = WorkbookFactory.create(file);
		
		String url = workbook.getSheet(sheetname).getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

	}

}
