package Automation.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import AbstractComponenets.abstractComponents;
//import AbstractComponenets.object;

public class ProductCatalogue extends abstractComponents {
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver)
	{
		super(driver);
		//Initialization
		this.driver=driver; //passing driver scope to local variable of this class using this
		PageFactory.initElements(driver, this);
	}
	
	//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	
	//PageFactory
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement disappear;
	
	By productsBy=By.cssSelector(".mb-3");
	By addCart=By.cssSelector(".card-body button:last-of-type");
	By toastMessage=By.cssSelector("#toast-container");
	
	public List<WebElement> getProdList()
	{
		waitforElementToAppear(productsBy);
		return products;
	}
	
	public WebElement getProductName(String productName)
	{
		WebElement prod=products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addToCart(String productName)
	{
		WebElement prod=getProductName(productName);
		prod.findElement(addCart).click();
		waitforElementToAppear(toastMessage);
		waitforElementDisappear(disappear);
		
	}

}
