package Automation.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponenets.abstractComponents;

public class LandingPage extends abstractComponents{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//Initialization
		this.driver=driver; //passing driver scope to local variable of this class using this
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail=driver.findElement(By.id("userEmail"));
	
	//PageFactory --> line 18 we can replace by page factory
	@FindBy(id="userEmail")
	WebElement userEmail;
	//above page factory declaration don't know about driver object so use initElements as line 17
	
	@FindBy(id="userPassword")
	WebElement Pass;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		Pass.sendKeys(password);
		submit.click();
		
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	

}
