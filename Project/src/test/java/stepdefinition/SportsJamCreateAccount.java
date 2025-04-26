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
    @When("I send value in Firstname c.")
    public void i_send_value_in_firstname_c() {
        sportsJamCreateAccountPage.sendInFirstName();
    }
    @When("I send value in Lastname c.")
    public void i_send_value_in_lastname_c() {
        sportsJamCreateAccountPage.sendInLastName();
    }
    @When("I send value in email c.")
    public void i_send_value_in_email_c() {
        sportsJamCreateAccountPage.sendInEmail();
    }
    @When("I send value in password c.")
    public void i_send_value_in_password_c() {
        sportsJamCreateAccountPage.sendInPassword();
    }
    @When("I send value in confirm password c.")
    public void i_send_value_in_confirm_password_c() {
        sportsJamCreateAccountPage.sendInConfirmPassword();
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
    @When("I send value in Email in login page c.")
    public void i_send_value_in_email_in_login_page_c() {
        sportsJamCreateAccountPage.sendInLoginEmail();
    }
    @When("I send value in password in login page c.")
    public void i_send_value_in_password_in_login_page_c() {
        sportsJamCreateAccountPage.sendInLoginPassword();
    }
    @Then("I verify Error message c.")
    public void i_verify_error_message_c() {
        sportsJamCreateAccountPage.clickOnSignIn();
        sportsJamCreateAccountPage.verifyErrorMessage();
    }

	
}
