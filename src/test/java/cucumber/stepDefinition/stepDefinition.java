package cucumber.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page()
	{
		//code
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		//code
	}
	
	@When("^I add product (.+) from cart$")
	public void i_add_product_to_cart(String productName)
	{
		//code
	}
	
	@When("^Checkout (.+) and submit order$")
	public void checkout_submit_order(String prouductName)
	{
		//code
	}
	
    @Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_on_confirmationpage(String string)
    {
    	//code
    }
    
    @Then("{string1} message is displayed")
    public void errorValidation(String string1)
    {
    	//code
    }

}
