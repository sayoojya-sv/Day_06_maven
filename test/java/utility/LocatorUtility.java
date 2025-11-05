//locatoryutility

package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LocatorUtility {
	protected Properties pro;
	
	public  LocatorUtility() throws IOException{
	FileReader fle=new FileReader("C:\\Users\\sayoojya\\OneDrive\\Desktop\\SDETCourse\\Selenium\\Day06_mavenstart\\src\\test\\resources\\locatorutility.properties");
	pro=new Properties();
	pro.load(fle);
	}

}
