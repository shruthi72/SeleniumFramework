import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class actionsPart2 {

	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--guest");
		driver=new ChromeDriver(options);
	}
	
	
	@Test
	public void test_actions() throws InterruptedException
	{
		driver.get("https://awesomeqa.com/practice.html");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.name("firstname"));
		//Keyboard event - KeyDown+Shift->Send Keys(type)-->key up
		
		Actions a =new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(name,"testing automation").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}
