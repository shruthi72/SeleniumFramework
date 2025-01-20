package Automation.SeleniumFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestComponents {
	
	public WebDriver driver;
	
	public void initializeDriver() throws IOException
	{
	//properties class
	Properties prop=new Properties();
	//FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumFramework\\src\\test\\java\\Automation\\SeleniumFramework\\GlobalData.properties");
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Automation\\SeleniumFramework\\GlobalData.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
		
	if(browserName.equalsIgnoreCase("chrome"))
	{
	WebDriver driver=new ChromeDriver();
	
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		WebDriver driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("edge"))
	{
		WebDriver driver=new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	}

}
