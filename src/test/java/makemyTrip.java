import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class makemyTrip {
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
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5C%5C&ef_id=:G:s");
		driver.manage().window().maximize();
		
		//<span data-cy="closeModal" class="commonModal__close"></span>  --> data-cy means cypress
		//custom attributes --> data-qa,test-id,data-cy
		
		//Wait for popup to come and click x icon
		//span[@data-cy='closeModal']
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		
		Actions a =new Actions(driver);
		WebElement fromCity=driver.findElement(By.id("fromCity"));
		a.moveToElement(fromCity).click().sendKeys("Chennai").build().perform();
		//WebElement input=driver.findElement(By.xpath("//input[@placeholder='From']"));
		//a.moveToElement(input).sendKeys("del").build().perform();
		Thread.sleep(3000);
		a.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform(); //only perform can do build().perform()
	}
}
