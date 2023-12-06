
package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTestScript {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();

		AmazonTest homePage = new AmazonTest(driver);
		driver.manage().window().maximize();
		homePage.openAmazonHomePage("https://www.amazon.in/");
		homePage.searchForProduct("samsung m34 5g");
		homePage.clickSearchResult(5);
		// Add further actions and assertions as needed
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		homePage.addtoCart();
	}
}
