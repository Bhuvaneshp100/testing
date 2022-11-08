package datadreventesting;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadmultipleDataFROmMULtipledata {

	public static void main(String[] args) throws CsvValidationException, IOException {
		String path="./recourse/csvData.csv";
		Reader filereader = new FileReader(path);
		CSVReader csvreader = new CSVReader(filereader);
		String[] arr = csvreader.readNext();
		while(arr!=null) {
		for(String arrs:arr) {
			System.out.println(arrs);
		}
		arr=csvreader.readNext();
		}
		csvreader.close();
	}

}
