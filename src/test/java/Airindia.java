import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Airindia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.airindia.com");
		driver.findElement(By.xpath("(//span[@class='mat-radio-outer-circle'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='From']")).sendKeys("HYD");
		driver.findElement(By.xpath("//span[text()='HYD']")).click();
		
		driver.findElement(By.xpath("//input[@id='To']")).sendKeys("VTZ");
		driver.findElement(By.xpath("//div[text()=' Visakhapatnam, India, IN ']")).click();
		/*List<WebElement> from = driver.findElements(By.xpath("//span[@class='airport-code-detail']"));
		
		for (WebElement f : from) {
		
			while (f.getText().equalsIgnoreCase("hyd")) {
				
				f.click();
				break;
				}		
		}*/
		
		
		
		
		driver.findElement(By.xpath("//div[@class='date-field col-6 col-lg-5']")).click();
		driver.findElement(By.xpath("//div[@class='ngb-dp-arrow right']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'December 2023')]/ancestor::div[@class='ngb-dp-month ng-star-inserted']/descendant::span[text()=' 10 ']")).click();
		driver.findElement(By.xpath("//div[@id='dropdownForm1']")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Passenger']/descendant::button[@class='col-2'])[1]")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Passenger']/descendant::button[@class='col-2'])[3]")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Passenger']/descendant::button[@class='col-2'])[5]")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Passenger']/descendant::button[@class='col-2'])[1]")).click();
		driver.findElement(By.xpath("//mat-select[@id='class-type']")).click();
		driver.findElement(By.xpath("//span[text()='Premium Economy']")).click();
		driver.findElement(By.xpath("//button[@class='show-flight-btn col-lg-5 col-12 booking-flight-btn text-uppercase ng-star-inserted']")).click();
	//	driver.findElement(By.xpath("//div[@class='geetest_radar_tip']")).click();

		
		
		
		
		
		
		

	}

}
