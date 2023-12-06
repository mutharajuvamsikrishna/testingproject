package fB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import page_object.AccountCreate;
import page_object.createaccount;
public class Fb {

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");
		
		AccountCreate accountCreate = new AccountCreate(driver);
		accountCreate
			.newApplication()
			.addFirstName("ramesh")
			.chooseDayByIndex(5)
		  .submit();
		/* 
		//driver.findElement(By.linkText("Create new account")).click();
		createaccount.Createaccountbutton(driver).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("ramesh");
		createaccount.firstnametextbox(driver).sendKeys("ramesh");
		
		
		//driver.findElement(By.name("lastname")).sendKeys("krish");
		createaccount.lastnametextbox(driver).sendKeys("krish");
		
		
		
		//driver.findElement(By.name("reg_email__")).sendKeys("999999999");
		
		createaccount.mobilenumber_text(driver).sendKeys("99999999");
		
		//driver.findElement(By.name("reg_passwd__")).sendKeys("kkkkk");
		
		createaccount.passwordtextbox(driver).sendKeys("kkkkk");
		
		//WebElement select = driver.findElement(By.id("#day"));
		
	//createaccount.day(driver).sendKeys(Keys.RETURN);
		
		
		createaccount.sex_radiobutton(driver).click();
		
		createaccount.submitbutton(driver).click();
		*/
	}

}
