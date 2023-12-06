package blockchain;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlockChain {

	WebDriver driver;
	int defaultwait = 14;
	String email = "//input[@name='email']";
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//button[@type='submit']");
	By otp = By.xpath("(//input[@class='verification_input_filed false false'])[1]");
	By cmpemal = By.xpath("//input[@name='companyEmail']");
//	                                            /business info page
	By addBussi = By.xpath("//button[@class='BusinessProfiles_addBusinessBtn__unI9S']");
	By name = By.xpath("//input[@name='companyName']");
	By busentity = By.xpath("//div[@class='FormField_selected_option__7Rw29 text-cgy4 cursor-pointer']");
	By dropdownlisrbuss = By.xpath("//div[contains(@class,'flex items-center justify-betw')]");
	By bussinessStartDate = By.xpath("//input[@name='businessStartDate']");

	public BlockChain(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(defaultwait));
	}

	public void openBlockChainPage(String url) {
		driver.get(url);
	}

	public void loginpage() {
		WebElement xpathemail = driver.findElement(By.xpath(email));
		WebElement xpathpassword = driver.findElement(password);
		xpathemail.sendKeys("superadmin@oniesoft.com");
		xpathpassword.sendKeys("OnieChain@123");
		WebElement xpathloginButton = driver.findElement(loginButton);
		xpathloginButton.click();
	}

	public void otp() {
		WebElement xpathotp = driver.findElement(otp);
		xpathotp.sendKeys("123456");
	}

	public void addBussiness() {
		WebElement addbuss = driver.findElement(addBussi);
		addbuss.click();
	}

	public void enterName(String cmpname) {
		WebElement webname = driver.findElement(name);
		webname.sendKeys(cmpname);
	}

	public void businessEntity(int dropdownindex) {

		WebElement drop = driver.findElement(busentity);
		drop.click();
		List<WebElement> list = driver.findElements(dropdownlisrbuss);
		list.get(dropdownindex).click();

	}

	public void StartbussDate(String date) {
		WebElement startdate = driver.findElement(bussinessStartDate);
		startdate.sendKeys(date);
	}

	public void cmpEmail(String email) {
		WebElement cmpemail = driver.findElement(cmpemal);
		cmpemail.sendKeys(email);
	}

}
