package blockchain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BlockChainScript {
	public static void main(String[] arg) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		BlockChain block = new BlockChain(driver);
		block.openBlockChainPage("http://98.70.48.123:8000/login");
		block.loginpage();
		block.otp();
		block.addBussiness();
		block.enterName("OnieSoft");
		block.businessEntity(2);
		block.StartbussDate("12/2023");
		block.cmpEmail("slvamsikrishna@gmail.com");

	}
}
