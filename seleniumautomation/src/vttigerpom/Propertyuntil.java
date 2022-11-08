package vttigerpom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyuntil {

			public String getpropertydata(String filepath,String key) throws IOException {
				FileInputStream file=new FileInputStream(filepath);
				Properties property = new Properties();
				property.load(file);
				return property.getProperty(key);
				
			}

}
