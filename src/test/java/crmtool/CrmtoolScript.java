package crmtool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrmtoolScript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Crmtool tool = new Crmtool(driver);
		tool.openCrmtoolPage("http://localhost:5173/");
		tool.clickApplicantsButton();
		tool.applicantsLogin();
		tool.clickLoginButton();
		tool.clickApplicationForm();
		tool.clickDropdown1();
		tool.clickCalender1();
		tool.clickDropdown2();
		tool.clockClick();

	}

}
