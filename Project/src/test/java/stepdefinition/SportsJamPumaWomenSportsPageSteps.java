package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamPumaWomenSportsPage;
import utils.Base;

public class SportsJamPumaWomenSportsPageSteps {
	
	ExtentTest test = Hooks.reports.createTest("test8");
	SportsJamPumaWomenSportsPage jamPumaWomenSportsPage = new SportsJamPumaWomenSportsPage(Base.driver, test); 

	@When("I verify the homepage URL")
	public void i_verify_the_homepage_url() {
	    jamPumaWomenSportsPage.verifyHomePageURL();
	    
	}
	@When("I click on the brand section.")
	public void i_click_on_the_brand_section() {
	    jamPumaWomenSportsPage.clickOnBrand();
	    
	}
	@Then("I verify the brand's page URL")
	public void i_verify_the_brand_s_page_url() {
	    jamPumaWomenSportsPage.verifyBrandsPageURL();
	    
	}
	@When("I click on the search bar")
	public void i_click_on_the_search_bar() {
	    jamPumaWomenSportsPage.clickOnSearchBar();
	    
	}
	@When("I send data to the search bar")
	public void i_send_data_to_the_search_bar() {
	    
	    jamPumaWomenSportsPage.sendDataToSearchBar();
	}
	@When("I click on the search icon")
	public void i_click_on_the_search_icon() {
	    
	    jamPumaWomenSportsPage.clickOnSearchIcon();
	}
	@Then("I verify that the search results include Puma")
	public void i_verify_that_the_search_results_include_puma() {
	    
	    jamPumaWomenSportsPage.verifyAccessoiresTextInFilter();
	}
	@Then("I click on the Puma brand")
	public void i_click_on_the_puma_brand() {
	    jamPumaWomenSportsPage.clickOnPuma();
	    
	}
	@Then("I verify the Puma page URL")
	public void i_verify_the_puma_page_url() {
	    jamPumaWomenSportsPage.verifyThePumaPage();
	    
	}
	@Then("I click on Accessories")
	public void i_click_on_accessories() {
	    jamPumaWomenSportsPage.clickOnAccesories();
	    
	}
	@Then("I verify Accessories text is shown in the filter")
	public void i_verify_accessories_text_is_shown_in_the_filter() {
	    jamPumaWomenSportsPage.verifyAccessoiresTextInFilter();
	    
	}
	@When("I hover over Puma Women Sport Quarters Assorted element")
	public void i_hover_over_puma_women_sport_quarters_assorted_element() {
	    
	    jamPumaWomenSportsPage.hoverOverPumaWomenSportQuartersAssorted();
	}
	@When("I click on the Quick View button")
	public void i_click_on_the_quick_view_button() {
	    
	    jamPumaWomenSportsPage.clickOnQuickView();
	}
	@When("I switch to the iframe for Quick View")
	public void i_switch_to_the_iframe_for_quick_view() {
	    jamPumaWomenSportsPage.switchToIframe();
	    
	}
	@When("I click on the Wish List button")
	public void i_click_on_the_wish_list_button() {
	    jamPumaWomenSportsPage.clickOnWishList();
	    
	}
	@Then("I verify the displayed login prompt message")
	public void i_verify_the_displayed_login_prompt_message() {
	    jamPumaWomenSportsPage.verifyLoginPromptMessage();
	    
	}
	@Then("I input data into the email field")
	public void i_input_data_into_the_email_field() {
	    
	    jamPumaWomenSportsPage.clickAndSendDataToEmail();
	}
	
	@Then("I input data into the password field")
	public void i_input_data_into_the_password_field() {
	    jamPumaWomenSportsPage.clickAndSendDataToPassword();
	}
	@Then("I click on the Sign In button")
	public void i_click_on_the_sign_in_button() {
	   jamPumaWomenSportsPage.clickOnSignIn();
	}
	@Then("I verify the error message is displayed")
	public void i_verify_the_error_message_is_displayed() {
	   jamPumaWomenSportsPage.verifyTheErrorMessage();
	}
}
