package practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Basec;

public class Login extends Basec {

@Test
		public static void login() {
	
		driver.findElement(By.id(loc.getProperty("email"))).sendKeys("rrrrrr");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("rrrrrr");
		driver.findElement(By.xpath(loc.getProperty("loginbutton"))).click();
		
		
		
		
		
		
		
		
		
		
	}}


