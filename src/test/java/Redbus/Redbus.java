package Redbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hydrabad",Keys.TAB,"Vizag",Keys.TAB);
		//driver.findElement(By.id("dest")).sendKeys("Vizag");
		
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
		driver.findElement(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/descendant::div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']/span[text()='22']")).click();
		driver.findElement(By.id("search_button")).click();
		//driver.findElement(By.xpath("//input[@placeholder='BOARDING POINT']")).sendKeys("Miyapur");
		//driver.findElement(By.xpath("(//label[text()='6 am to 12 pm'])[2]")).click();
		
         WebElement footer = driver.findElement(By.xpath("//a[text()=' Train Ticket Booking ']"));
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView()", footer);
         
         // driver.findElement(By.xpath("(//div[@class='clearfix bus-item'])[1]/descendant::div[text()='HIDE SEATS']")).click();



	}

}
