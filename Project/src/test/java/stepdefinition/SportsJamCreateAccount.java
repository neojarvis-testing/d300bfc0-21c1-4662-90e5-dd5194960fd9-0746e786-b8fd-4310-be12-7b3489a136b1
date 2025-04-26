package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamCreateAccountPage;

public class SportsJamCreateAccount {
	
	ExtentTest extentTest= Hooks.reports.createTest("Create an account");
    SportsJamCreateAccountPage sportsJamCreateAccountPage = new SportsJamCreateAccountPage(extentTest);

    @When("I hover on Account icon c.")
    public void i_hover_on_account_icon_c() {
        sportsJamCreateAccountPage.hoverOnLogin();
    }
    @When("I click on Login c.")
    public void i_click_on_login_c() {
        sportsJamCreateAccountPage.clickOnLogin();
    }
    @When("I click on Create an account c.")
    public void i_click_on_create_an_account_c() {
        sportsJamCreateAccountPage.clickOnCreateAccount();
    }
    @When("I send value to FirstName field as {string} c.")
    public void i_send_value_to_first_name_field_as_c(String string) {
        sportsJamCreateAccountPage.sendInFirstName(string);
    }
    @When("I send value to LastName fied as {string} c.")
    public void i_send_value_to_last_name_fied_as_c(String string) {
        sportsJamCreateAccountPage.sendInLastName(string);
    }
    @When("I send value to email field as {string} c.")
    public void i_send_value_to_email_field_as_c(String string) {
        sportsJamCreateAccountPage.sendInEmail(string);
    }
    @When("I send value to password field as {string} c.")
public void i_send_value_to_password_field_as_c(String string) {
        sportsJamCreateAccountPage.sendInPassword(string);
    }
    @When("I send value to confirm password field as {string} c.")
    public void i_send_value_to_confirm_password_field_as_c(String string) {
        sportsJamCreateAccountPage.sendInConfirmPassword(string);
    }
    @When("I click on create an account button c.")
    public void i_click_on_create_an_account_button_c() {
        sportsJamCreateAccountPage.clickOnCreate();
    }
    @When("I verify the text Thank you for registering c.")
    public void i_verify_the_text_thank_you_for_registering_c() {
        sportsJamCreateAccountPage.verifyThankYou();
    }
    @When("I click on Logout button.")
    public void i_click_on_logout_button() {
        sportsJamCreateAccountPage.clickOnLogout();
    }
    @When("I navigate back to previous page.")
    public void i_navigate_back_to_previous_page() {
        sportsJamCreateAccountPage.backNavigate();
    }
    @When("I send value to login email field as {string} in login page c.")
public void i_send_value_to_login_email_field_as_in_login_page_c(String string) {
        sportsJamCreateAccountPage.sendInLoginEmail(string);
    }
    @When("I send value to login password field as {string} in login page c.")
public void i_send_value_to_login_password_field_as_in_login_page_c(String string) {
        sportsJamCreateAccountPage.sendInLoginPassword(string);
    }
    @Then("I verify Error message c.")
    public void i_verify_error_message_c() {
        sportsJamCreateAccountPage.clickOnSignIn();
        sportsJamCreateAccountPage.verifyErrorMessage();
    }

	
}
