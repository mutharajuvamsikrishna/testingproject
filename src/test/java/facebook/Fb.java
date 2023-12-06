package facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("sucessfully");
		// Thread.sleep(20000);
		driver.findElement(By.name("email")).sendKeys("vamsi@gmail.com");
		// driver.findElement(By.name("login")).click();

//		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); //
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Vamsi@2001");
		// driver.findElement(By.name("login")).click();
		// driver.findElement(By.name("login")).getClass();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		System.out.println("Clicked Ok");
		/*
		 * driver.findElement(By.xpath("//select[@id='day']")).click();
		 * 
		 * List<WebElement> dayno =
		 * driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		 * 
		 * for (WebElement day : dayno) { if (day.getText().equalsIgnoreCase("17")) {
		 * 
		 * day.click(); break;
		 * 
		 * }
		 * 
		 * }
		 */
		WebElement day = driver.findElement(By.name("birthday_day"));

		Select sec3 = new Select(day);
		sec3.selectByIndex(13);

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.name("birthday_month"));

		Select sec = new Select(month);
		sec.selectByValue("12");

		Thread.sleep(2000);
		WebElement yr = driver.findElement(By.name("birthday_year"));

		Select sec1 = new Select(yr);
		sec1.selectByValue("2016");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_8esa'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();

		System.out.println("Radio is Ok");
	}

}