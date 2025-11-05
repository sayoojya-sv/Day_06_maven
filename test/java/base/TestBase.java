//testbase

package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	protected WebDriver driver;
	Properties prop;
	public void readProp() throws IOException {
	FileReader fobj=new FileReader("C:\\Users\\sayoojya\\OneDrive\\Desktop\\SDETCourse\\Selenium\\Day06_mavenstart\\src\\test\\resources\\config.properties");
    prop=new Properties();
    prop.load(fobj);
    
	}
	
	public void setBrowser() throws IOException {
		readProp();
		if(prop.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("edge")) {
			driver=new EdgeDriver();
		}
		
	}
	@BeforeTest
	public void testconfig() throws IOException {
		readProp();
		setBrowser();
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
	}


}
