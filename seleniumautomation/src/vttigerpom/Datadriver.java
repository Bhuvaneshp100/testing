package vttigerpom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Datadriver {

	public static void main(String[] args) throws IOException {
		String path="./recourse/vtiger.properties";
		FileInputStream file = new FileInputStream(path);
		
		Properties properties = new  Properties();
		properties.load(file);
		
		String url = properties.getProperty("url");
		//System.out.println(url);
	}

}
