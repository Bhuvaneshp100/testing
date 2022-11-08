package datadreventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class DAtatadriverINCsvfile {

	public static void main(String[] args) throws CsvValidationException, IOException {
		String path="./recourse/csvData1.csv";
		Reader filereader = new FileReader(path);
		CSVReader csvreader = new CSVReader(filereader);
		String[] arr = csvreader.readNext();
		for(String arrs:arr) {
			System.out.println(arrs);
		}
		csvreader.close();
	}

}
