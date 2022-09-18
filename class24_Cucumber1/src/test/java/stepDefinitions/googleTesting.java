package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleTesting {

	@Given("I am on goolge homepage")
	public void i_am_on_goolge_homepage() {
		System.out.println("Hello Google Homepage");
	}

	@Then("I click on about")
	public void i_click_on_about() {
		System.out.println("I am about button");
	}

	@Then("I click view all our products")
	public void i_click_view_all_our_products() {
		System.out.println("All other products are here!e");
	}

	@And("click google store")
	public void click_google_store() {
		System.out.println("Now you are inside Google store");
	}

	@Then("click shop offers")
	public void click_shop_offers() {
		System.out.println("You are viewing google offers");
	}

	@When("click phones")
	public void click_phones() {
		System.out.println("You are interested in PHONES!");
	}

}
