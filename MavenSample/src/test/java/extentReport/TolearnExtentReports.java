package extentReport;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TolearnExtentReports {
@Test
public void demoTest() {
	WebDriver driver = new ChromeDriver();
	TakesScreenshot ts= (TakesScreenshot) driver;
	LocalDateTime localtime= LocalDateTime.now();
	String time = localtime.toString().replace(":","-");
	driver.get("https://demowebshop.tricentis.com/");
	String screenshot = ts.getScreenshotAs(OutputType.BASE64);
	ExtentSparkReporter spark = new ExtentSparkReporter("./src/extentReport.html");
	ExtentReports report = new ExtentReports();
	report.attachReporter(spark);
	ExtentTest test = report.createTest("demoTest");
	test.log(Status.PASS, "Screenshot Taken Successfully");
	
	report.flush();
	
	
}
}
