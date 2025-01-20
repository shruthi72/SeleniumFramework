import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class spiceJet {

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
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
		
		//move to element - click - sendkeys
		
		Actions a =new Actions(driver);
		a.moveToElement(source).click().sendKeys("BLR").build().perform();
	}
		
	
	
}
