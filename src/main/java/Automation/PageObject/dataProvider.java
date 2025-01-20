package Automation.PageObject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	/*@Test(dataProvider="getData",groups={"Login"})
	public void login(String email, String pass)
	{
		String productName="ZARA COAT 3";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		
	}

	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"shruthi72000@gmail.com","Shruthi@72"} , {"sheety@gmail.com","Iamking@000"}};
		
		}
	}*/
	
	@Test(dataProvider="getData",groups={"Login"})
	public void login(HashMap<Object,Object> input)
	{
		String productName="ZARA COAT 3";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		input.get("email");
		input.get("password");
		
		driver.findElement(By.id("userEmail")).sendKeys();
		driver.findElement(By.id("userPassword")).sendKeys("pass");
		driver.findElement(By.id("login")).click();
		
	}

@DataProvider
public Object[][] getData()
{
	HashMap<Object,Object> map=new HashMap<Object,Object>();
	map.put("email", "shruthi72000@gmail.com");
	map.put("password", "Shruthi@72");
	
	HashMap<Object,Object> map1=new HashMap<Object,Object>();
	map1.put("email", "sheety@gmail.com");
	map1.put("password", "Iamking@000");

	return new Object[][] {{map} , {map1}};
	
	}
WebElement driver;
public String getScreenshot(String testcaseName) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File file=new File(System.getProperty("user.dir")+"//reports"+testcaseName+".png");
	FileUtils.copyFile(source,file);
	return System.getProperty("user.dir")+"//reports"+testcaseName+".png";
	
}
}
	

