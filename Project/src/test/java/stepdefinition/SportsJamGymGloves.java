package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamGymGlovesPage;

public class SportsJamGymGloves {
	
	ExtentTest extentTest= Hooks.reports.createTest("Gym Accessories");
    SportsJamGymGlovesPage sportsJamGymGlovesPage = new SportsJamGymGlovesPage(extentTest);
	
    @When("I hover on Fitness c.")
    public void i_hover_on_fitness_c() {
        sportsJamGymGlovesPage.hoverOnFitness();
    }
    @When("I click on Gym Gloves c.")
    public void i_click_on_gym_gloves_c() {
        sportsJamGymGlovesPage.clickOnGymGloves();
    }
    @When("I verify the title Gym Gloves c.")
    public void i_verify_the_title_gym_gloves_c() {
        sportsJamGymGlovesPage.verifyGymGloves();
    }
    @When("I click on Evarlast c.")
    public void i_click_on_evarlast_c() {
        sportsJamGymGlovesPage.clickOnEverlast();
    }
    @When("I Verify the filter Everlast c.")
    public void i_verify_the_filter_everlast_c() {
        sportsJamGymGlovesPage.verifyEverlast();
    }
    @When("I click on first Product c.")
    public void i_click_on_first_product_c() {
        sportsJamGymGlovesPage.clickOnProduct();
    }
    @When("I click on Add to cart.")
    public void i_click_on_add_to_cart() {
        sportsJamGymGlovesPage.clickOnAddToCart();
    }
    @When("I verify the text Product added to cart c.")
    public void i_verify_the_text_product_added_to_cart_c() {
        sportsJamGymGlovesPage.verifyProductAddedToCart();
    }
    @When("I hover on cart c.")
    public void i_hover_on_cart_c() {
        sportsJamGymGlovesPage.hoverOnCart();
    }
    @When("I verify the name of product c.")
    public void i_verify_the_name_of_product_c() {
        sportsJamGymGlovesPage.verifyName();
    }
    @When("I click on view cart c.")
    public void i_click_on_view_cart_c() {
        sportsJamGymGlovesPage.clickOnViewCart();
    }
    @When("I verify Shopping cart c.")
    public void i_verify_shopping_cart_c() {
        sportsJamGymGlovesPage.verifyShoppingCart();
    }
    @When("I click on Proceed to checkout c.")
    public void i_click_on_proceed_to_checkout_c() {
        sportsJamGymGlovesPage.clickOnProceedToCheckout();
    }
    @Then("I verify text Order Summary c.")
    public void i_verify_text_order_summary_c() {
        sportsJamGymGlovesPage.verifyOrderSummary();
    }

	
}
