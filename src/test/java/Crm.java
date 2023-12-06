import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crm {

	public static void Login() throws Throwable {
		
		FileInputStream fis=new FileInputStream("D:\\login.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String tuname = p.getProperty("tusername");
		String tpass = p.getProperty("tpass");
		//System.out.println(url+""+uname+""+pass);
				
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement executive = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
		executive.click();
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys(tuname, Keys.TAB,tpass,Keys.ENTER);
	}

}
