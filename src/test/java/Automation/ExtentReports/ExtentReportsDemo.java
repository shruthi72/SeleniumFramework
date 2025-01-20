package Automation.ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		// ExtentReports -> drive reporting execution, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","ABC");
	}
	
	@Test(retryAnalyzer=Retry.class)
	public void initialDemo()
	{
		extent.createTest("Initial Demo"); // Start Listening execution
		//ExtentTest test=extent.createTest("Initial Demo");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		//test.fail("Failed");
		
		extent.flush(); // stops the listening mode
	}

}
