package revisee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Deom123 {

	public static void main(String[] args) throws IOException {
		String filepath = "./recourse/demo.properties";
		FileInputStream file = new  FileInputStream(filepath);
		
		Properties porperty = new Properties();
		porperty.load(file);
		String url = porperty.getProperty("url");
		System.out.println(url);
		String urls = porperty.getProperty("urls");
		System.out.println(urls);
	}

}
