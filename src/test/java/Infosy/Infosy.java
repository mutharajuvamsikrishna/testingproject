package Infosy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Infosy {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.infosys.com/");
		driver.findElement(By.xpath("(//a[@class='btn btn-shutter-more text-uppercase'])[3]")).click();
		WebElement career = driver.findElement(By.xpath("(//a[@aria-label='Go to Careers Page'])[2]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", career);
		career.click();
		driver.findElement(By.xpath("//a[text()='Apply now']")).click();
		//driver.findElement(By.xpath("//a[text()='Apply Now ']")).click();
		
		
		
		
		
		
		
		
	}

}
