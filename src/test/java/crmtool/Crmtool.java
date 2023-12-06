package crmtool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Crmtool {
	WebDriver driver;
	int defaultwait = 14;

	public Crmtool(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(defaultwait));
	}

	public void openCrmtoolPage(String url) {
		driver.get(url);
	}

	public void clickApplicantsButton() {
		WebElement button = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		button.click();
	}

	public void applicantsLogin() {
		WebElement inputEmail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		inputEmail.sendKeys("slrvamsikrishna@gmail.com");
		WebElement inputpassword = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		inputpassword.sendKeys("Vamsi@2001");
	}

	public void clickLoginButton() {
		WebElement xpath = driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]"));
		xpath.click();
	}

	public void clickApplicationForm() throws Throwable {
		WebElement app = driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]"));
		Thread.sleep(2000);
		app.click();
	}

	public void clickDropdown1() {
		WebElement drop = driver.findElement(By.name("bdmname"));
		Select select = new Select(drop);

		for (int i = 0; i <= 2; i++) {
			if (i == 1) {
				select.selectByIndex(i);
			}
		}
	}

	public void clickCalender1() {
		WebElement calender1 = driver.findElement(By.name("firstres"));
		calender1.sendKeys("12-08-1999");

	}

	public void clickDropdown2() {
		WebElement drop = driver.findElement(By.name("lfstatus"));
		Select select = new Select(drop);

		for (int i = 0; i <= 6; i++) {

			select.selectByIndex(6);

		}
	}

	public void clockClick() {
		WebElement clock = driver.findElement(By.name("time"));
		clock.sendKeys("15:38");
	}
}
