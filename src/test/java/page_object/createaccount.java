package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {
	public static WebElement element=null;
	//public static WebDriver driver;
	

	
	
	public static WebElement  Createaccountbutton(WebDriver driver) {
		
	  element = driver.findElement(By.linkText("Create new account"));
		return element;
	}

	
	public static WebElement firstnametextbox(WebDriver driver) {
		//WebDriver driver=new FirefoxDriver();
		
		element=driver.findElement(By.name("firstname"));
		return element;
	}

	
	public static WebElement lastnametextbox( WebDriver driver) {
		
		element=driver.findElement(By.name("lastname"));
		return element;
	}
	
	public static WebElement mobilenumber_text(WebDriver driver) {
		
		element=driver.findElement(By.name("reg_email__"));

		return element;
	}
	
	
	public static WebElement passwordtextbox(WebDriver driver) {
		
		element=driver.findElement(By.name("reg_passwd__"));
		
		return element;
		
	}
	
	public static Select day(WebDriver driver) {
		
		 element = driver.findElement(By.id("#day"));
	Select element1 = new Select(element);
	element1.selectByIndex(5);
	return element1;
	
	}
	
	public static WebElement sex_radiobutton(WebDriver driver) {
		
		element=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		return element;
	}
	
	public static WebElement submitbutton(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//button[@name='websubmit']"));
		return element;
		
	} 
		
	
	
	
	
}
