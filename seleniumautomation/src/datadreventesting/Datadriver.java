package datadreventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datadriver {

	public static void main(String[] args) throws IOException {
		
		String path="./recourse/cofigu.properties";
		FileInputStream file = new FileInputStream(path);
		
		Properties properties = new  Properties();
		properties.load(file);
		
		String url = properties.getProperty("url");
		String name = properties.getProperty("name");
		String pasward = properties.getProperty("pasward");
		System.out.println(url);
		System.out.println(name);
		System.out.println(pasward);
	}

}
