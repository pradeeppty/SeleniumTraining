package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WiproTest {
@Test (groups = "smoke")
public void wipro() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.wipro.com/");
	Reporter.log("WiproTest executed", true);
	driver.quit();
}
}
