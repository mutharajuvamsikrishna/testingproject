package page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreate {
	WebDriver driver;
	WebDriverWait wait;
	int defaultWait = 5;
	By day = By.id("day");
	By submitbutton = By.xpath("//button[@name='websubmit']");
	By createAccount = By.linkText("Create new account");
	By firstNameBy = By.name("firstname");
	
	public AccountCreate(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(defaultWait));
	}
	
	public AccountCreate chooseDayByIndex(int index) {		
		WebElement element = waitToBeClick(day);
		new Select(element).selectByIndex(index);
		return this;
	}
	
	public AccountCreate submit() {
		waitToBeClick(submitbutton).click();
		return this;
	}
	
	public AccountCreate newApplication() {
		waitToBeClick(createAccount).click();
		return this;
	}
	
	public AccountCreate addFirstName(String firstName) {
		WebElement element = waitToBeClick(firstNameBy);
		element.sendKeys(firstName);
		return this;
	}
	
	public WebElement waitToBeClick(By by) {
		return wait.until(ExpectedConditions
				.elementToBeClickable(by));
	}
}
