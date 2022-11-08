package datadreventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DatadrivenMultipledata {

	public static void main(String[] args) throws IOException {
		String path="./recourse/cofigu1.properties";
		FileInputStream file = new FileInputStream(path);
		Properties properties = new  Properties();
		properties.load(file);
		
		Set<Object> keyset = properties.keySet();
		
		for(Object keys:keyset) {
			System.out.println(keys);
			System.out.println(properties.get(keys));
		}

	}

}
