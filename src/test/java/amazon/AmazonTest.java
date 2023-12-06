package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
	private WebDriver driver;

	public AmazonTest(WebDriver driver) {
		this.driver = driver;
	}

	public void openAmazonHomePage(String url) {
		driver.get(url);
	}

	public void searchForProduct(String keyword) {
		WebElement searchInput = driver.findElement(By.name("field-keywords"));
		searchInput.sendKeys(keyword);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public void clickSearchResult(int resultIndex) {
		String xpath = "(//img[@class=\"s-image\"])[" + resultIndex + "]";
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		element.click();

	}

	public void addtoCart() {
		String xpath = "//input[@name=\"submit.add-to-cart\"]";
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		element.click();
	}
}
