package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Basec {
	//commenly used in overall project
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	@BeforeTest
	public void setup() throws Throwable {
		
		if (driver==null) {
			 fr=new FileReader(System.getProperty("user.dir")+"\\src\\\\test\\\\resources\\\\config.properties");
			fr1=new FileReader(System.getProperty("user.dir")+"\\src\\\\test\\\\resources\\\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		driver.get(prop.getProperty("testurl"));
		
		
	}
	
	
	

}
