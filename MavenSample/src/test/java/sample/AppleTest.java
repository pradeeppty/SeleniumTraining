package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppleTest {
@Test (groups = "smoke")
public void Apple() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.apple.com/in/");
	Reporter.log("AppleTest executed", true);
	driver.quit();
}
}
