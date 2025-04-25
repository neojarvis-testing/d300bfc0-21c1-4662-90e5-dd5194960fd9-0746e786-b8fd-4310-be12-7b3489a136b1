package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SportsJamFooterPage;

public class SportsJamFooterStep {
    ExtentTest extentTest= Hooks.reports.createTest("FooterTestCase");
    SportsJamFooterPage sportsJamFooterPage=new SportsJamFooterPage(extentTest);
    /*
     * a. Method Name: clickOnFacebook
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on FacebookIcon
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I click on Facebook b.")
    public void i_click_on_facebook_b() {
        sportsJamFooterPage.clickOnFacebook();
    }
     /*
     * a. Method Name: clickOnYouTube
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on Youtube Icon 
     * d. Parameter: None
     * e. Return Type: void
     */
    @Given("I come back to main window b.")
    public void i_come_back_to_main_window_b() {
        sportsJamFooterPage.backFromFaceBook();
    }
    /*
     * a. Method Name: clickOnYouTube
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on Youtube Icon 
     * d. Parameter: None
     * e. Return Type: void
     */
    @Then("I click on You Tube b.")
    public void i_click_on_you_tube_b() {
        sportsJamFooterPage.clickOnYouTube();
    }
     /*
     * a. Method Name: backfromYouTube
     * b. Author Name: Srujana Makam
     * c. Description: A method to comeback to parent window
     * d. Parameter: None
     * e. Return Type: void
     */
    @Then("I come back to parent window b.")
    public void i_come_back_to_parent_window_b() {
        sportsJamFooterPage.backfromYouTube();
    }
}
