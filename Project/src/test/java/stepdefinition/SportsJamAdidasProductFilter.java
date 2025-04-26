package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamAdidasResultsPage;

public class SportsJamAdidasProductFilter {
    ExtentTest test = Hooks.reports.createTest("adidasProductFilterTest");
    SportsJamAdidasResultsPage sportsJamAdidasResultsPage = new SportsJamAdidasResultsPage(test);

    /*
     * a. Method Name: i_click_on_the_search_icon_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates clicking on the search icon.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click on the search icon a")
    public void i_click_on_the_search_icon_a() {
        sportsJamAdidasResultsPage.clickOnSearchIcon();
    }

    /*
     * a. Method Name: i_verify_the_search_bar_is_displayed_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the visibility of the search bar.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I verify the search bar is displayed a")
    public void i_verify_the_search_bar_is_displayed_a() {
        sportsJamAdidasResultsPage.verifySearchBar();
    }

    /*
     * a. Method Name: i_click_on_the_search_bar_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates clicking on the search bar.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click on the search bar a")
    public void i_click_on_the_search_bar_a() {
        sportsJamAdidasResultsPage.clickOnSearchBar();
    }

    /*
     * a. Method Name: i_enter_input_in_the_search_bar_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates entering input in the search bar.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I enter input {string} in the search bar a")
public void i_enter_input_in_the_search_bar_a(String string) {
        sportsJamAdidasResultsPage.sendDataInSearchBar(string);
    }

    /*
     * a. Method Name: i_click_the_go_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates clicking the Go button after search input.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click the Go button a")
    public void i_click_the_go_button_a() {
        sportsJamAdidasResultsPage.clickOnGoButton();
    }

    /*
     * a. Method Name: i_press_enter_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates pressing the Enter key for search submission.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I press Enter a")
    public void i_press_enter_a() {
        sportsJamAdidasResultsPage.pressEnter();
    }

    /*
     * a. Method Name: i_verify_the_heading_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the heading on the search results page.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I verify the heading a")
    public void i_verify_the_heading_a() {
        sportsJamAdidasResultsPage.verifyAdidasInHeading();
    }

    /*
     * a. Method Name: i_select_the_checkbox_for_racket_sports_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Selects the filter checkbox for Racket Sports.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I select the checkbox for Racket Sports a")
    public void i_select_the_checkbox_for_racket_sports_a() {
        sportsJamAdidasResultsPage.selectCheckboxOfRacketSports();
    }

    /*
     * a. Method Name: i_verify_the_label_for_racket_sports_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the label for Racket Sports filter.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify the label for Racket Sports a")
    public void i_verify_the_label_for_racket_sports_a() {
        sportsJamAdidasResultsPage.verifyRacketSportsLabel();
    }

    /*
     * a. Method Name: i_select_the_checkbox_for_shoes_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Selects the checkbox filter for Shoes.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I select the checkbox for Shoes a")
    public void i_select_the_checkbox_for_shoes_a() {
        sportsJamAdidasResultsPage.selectCheckboxOfShoes();
    }

    /*
     * a. Method Name: i_verify_the_label_for_shoes_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the label corresponding to the Shoes filter.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify the label for Shoes a")
    public void i_verify_the_label_for_shoes_a() {
        sportsJamAdidasResultsPage.verifyShoesLabel();
    }

    /*
     * a. Method Name: i_deselect_the_checkbox_for_racket_sports_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Deselects the checkbox filter for Racket Sports.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I deselect the checkbox for Racket Sports a")
    public void i_deselect_the_checkbox_for_racket_sports_a() {
        sportsJamAdidasResultsPage.deSelectCheckboxOfRacketSports();
    }

    /*
     * a. Method Name: i_select_the_checkbox_for_clothing_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Selects the checkbox filter for Clothing.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I select the checkbox for Clothing a")
    public void i_select_the_checkbox_for_clothing_a() {
        sportsJamAdidasResultsPage.selectCheckboxOfClothing();
    }

    /*
     * a. Method Name: i_verify_the_label_for_clothing_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the label corresponding to the Clothing filter.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify the label for Clothing a")
    public void i_verify_the_label_for_clothing_a() {
        sportsJamAdidasResultsPage.verifyClothingLabel();
    }

    /*
     * a. Method Name: i_select_the_checkbox_for_accessories_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Selects the checkbox filter for Accessories.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I select the checkbox for Accessories a")
    public void i_select_the_checkbox_for_accessories_a() {
        sportsJamAdidasResultsPage.selectCheckboxOfAccessories();
    }

    /*
     * a. Method Name: i_verify_the_label_for_accessories_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the label corresponding to the Accessories filter.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify the label for Accessories a")
    public void i_verify_the_label_for_accessories_a() {
        sportsJamAdidasResultsPage.verifyAccessoriesLabel();
    }

    /*
     * a. Method Name: i_select_the_checkbox_for_running_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Selects the checkbox filter for Running.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I select the checkbox for Running a")
    public void i_select_the_checkbox_for_running_a() {
        sportsJamAdidasResultsPage.selectCheckboxOfRunning();
    }

    /*
     * a. Method Name: i_verify_the_label_for_running_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the label corresponding to the Running filter.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify the label for Running a")
    public void i_verify_the_label_for_running_a() {
        sportsJamAdidasResultsPage.verifyRunningLabel();
    }
    
    /*
     * a. Method Name: i_click_the_clear_all_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates clicking the Clear All button to reset filters.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click the Clear All button a")
    public void i_click_the_clear_all_button_a() {
        sportsJamAdidasResultsPage.clickClearAllButton();
    }
}