package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SportsJamLoginPage;

public class SportsJamLoginStep {
    ExtentTest extentTest= Hooks.reports.createTest("LoginTestCase");
    SportsJamLoginPage sportsJamLoginPage=new SportsJamLoginPage(extentTest);
    /*
     * a. Method Name: clickOnLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on Login Link b.")
    public void i_click_on_login_link_b() {
       sportsJamLoginPage.clickOnLogin();
    }
    /*
     * a. Method Name: verifyLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify login page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I verify login page b.")
    public void i_verify_login_page_b() {
       sportsJamLoginPage.verifyLogin();
    }
     /*
     * a. Method Name: backFromLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I come back from login page b.")
    public void i_come_back_from_login_page_b() {
       sportsJamLoginPage.backFromLogin();
    }
    /*
     * a. Method Name: clickOnDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on delivery link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on delivery Link b.")
    public void i_click_on_delivery_link_b() {
       sportsJamLoginPage.clickOnDelivery();
    }
    /*
     * a. Method Name: verifyDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify delivery page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I verify delivery page b.")
    public void i_verify_delivery_page_b() {
       sportsJamLoginPage.verifyDelivery();
    }
     /*
     * a. Method Name: backFromDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from delivery page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I come back from delivery page b.")
    public void i_come_back_from_delivery_page_b() {
       sportsJamLoginPage.backFromDelivery();
    }
     /*
     * a. Method Name: clickOnPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on payment link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on Payment Link b.")
    public void i_click_on_payment_link_b() {
       sportsJamLoginPage.clickOnPayment();
    }
     /*
     * a. Method Name: verifyPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify payment page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I verify Payment page b.")
    public void i_verify_payment_page_b() {
       sportsJamLoginPage.verifyPayment();
    }
    /*
     * a. Method Name: backFromPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from payment page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I come back from Payment page b.")
    public void i_come_back_from_payment_page_b() {
       sportsJamLoginPage.backFromPayment();
    }
    /*
     * a. Method Name: clickOnFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on FAQs link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on FAQ Link b.")
    public void i_click_on_faq_link_b() {
       sportsJamLoginPage.clickOnFAQ();
    }
    /*
     * a. Method Name: verifyFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify FAQs page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I verify FAQ page b.")
    public void i_verify_faq_page_b() {
       sportsJamLoginPage.verifyFAQ();
    }
    /*
     * a. Method Name: backFromFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I come back from FAQ page b.")
    public void i_come_back_from_faq_page_b() {
       sportsJamLoginPage.backFromFAQ();
    }
    /*
     * a. Method Name: clickOnPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on Policy link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on Policy Link b.")
    public void i_click_on_policy_link_b() {
       sportsJamLoginPage.clickOnPolicy();
    }
    /*
     * a. Method Name: verifyPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify Policy page
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I verify Policy page b.")
    public void i_verify_policy_page_b() {
       sportsJamLoginPage.verifyPolicy();
    }
     /*
     * a. Method Name: backFromPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from Policy link
     * d. Parameter: None
     * e. Return Type: void
     */
    @Then("I come back from Policy page b.")
    public void i_come_back_from_policy_page_b() {
       sportsJamLoginPage.backFromPolicy();
    }

}
