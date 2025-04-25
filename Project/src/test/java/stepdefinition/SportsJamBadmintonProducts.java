package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamBadmintonPage;

public class SportsJamBadmintonProducts {
    ExtentTest test = Hooks.reports.createTest("addProductsToCartTest");
    SportsJamBadmintonPage sportsJamBadmintonPage = new SportsJamBadmintonPage(test);

    /*
     * a. Method Name: i_hover_on_the_racket_sports_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates hovering over the Racket Sports category.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I hover on the Racket Sports a")
    public void i_hover_on_the_racket_sports_a() {
        sportsJamBadmintonPage.hoverOnRacketSports();
    }

    /*
     * a. Method Name: i_click_on_badminton_rackets_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the Badminton Rackets category.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click on Badminton Rackets a")
    public void i_click_on_badminton_rackets_a() {
        sportsJamBadmintonPage.clickOnBadmintonRackets();
    }

    /*
     * a. Method Name: i_verify_badminton_rackets_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the listing of Badminton Rackets.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I verify Badminton Rackets a")
    public void i_verify_badminton_rackets_a() {
        sportsJamBadmintonPage.verifyBadmintonRackets();
    }

    /*
     * a. Method Name: i_click_on_the_first_product_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the first product in the listing.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click on the first product a")
    public void i_click_on_the_first_product_a() {
        sportsJamBadmintonPage.clickOnProductNumberOne();
    }

    /*
     * a. Method Name: i_verify_the_product_page_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the product details page.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I verify the product page a")
    public void i_verify_the_product_page_a() {
        sportsJamBadmintonPage.verifyProductPage();
    }

    /*
     * a. Method Name: i_verify_the_add_to_cart_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the presence of the Add to Cart button.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I verify the Add to Cart button a")
    public void i_verify_the_add_to_cart_button_a() {
        sportsJamBadmintonPage.verifyAddToCartButton();
    }

    /*
     * a. Method Name: i_click_on_the_increase_quantity_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks the Increase Quantity button.
     * d. Parameters: None
     * e. Return Type: None
     */
    @When("I click on the Increase Quantity button a")
    public void i_click_on_the_increase_quantity_button_a() {
        sportsJamBadmintonPage.clickOnIncreaseQuantityButton();
    }

    /*
     * a. Method Name: i_click_on_the_add_to_cart_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Adds the product to the shopping cart.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the Add to Cart button a")
    public void i_click_on_the_add_to_cart_button_a() {
        sportsJamBadmintonPage.clickOnAddToCartButton();
    }

    /*
     * a. Method Name: i_verify_confirmation_message_in_the_pop_up_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the confirmation pop-up message after adding the product to the cart.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify confirmation message in the pop-up a")
    public void i_verify_confirmation_message_in_the_pop_up_a() {
        sportsJamBadmintonPage.verifyConfirmationMessageInPopUp();
    }

    /*
     * a. Method Name: i_click_on_the_check_button_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks the Check button for ZIP Code verification.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the Check button a")
    public void i_click_on_the_check_button_a() {
        sportsJamBadmintonPage.clickOnCheckButton();
    }

    /*
     * a. Method Name: i_verify_zip_code_error_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the ZIP Code error message if entered incorrectly.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify ZIP Code error a")
    public void i_verify_zip_code_error_a() {
        sportsJamBadmintonPage.verifyZIPCodeError();
    }

    /*
     * a. Method Name: i_click_on_the_zip_code_input_box_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the ZIP Code input box.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the ZIP Code input box a")
    public void i_click_on_the_zip_code_input_box_a() {
        sportsJamBadmintonPage.clickOnZipCodeInputBox();
    }

    /*
     * a. Method Name: i_enter_the_zip_code_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Enters ZIP Code for validation.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I enter the ZIP Code a")
    public void i_enter_the_zip_code_a() {
        sportsJamBadmintonPage.sendInputInZIPCodeInputBox();
    }

    /*
     * a. Method Name: i_click_on_the_check_button_a_2nd_time
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks the Check button for the second time.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the Check button a 2nd time")
    public void i_click_on_the_check_button_a_2nd_time() {
        sportsJamBadmintonPage.clickOnCheckButton();
    }

    /*
     * a. Method Name: i_hover_on_racket_sports_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Simulates hovering over the Racket Sports category.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I hover on Racket Sports a")
    public void i_hover_on_racket_sports_a() {
        sportsJamBadmintonPage.hoverOnRacketSports();
    }

    /*
     * a. Method Name: i_click_on_badminton_shoes_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the Badminton Shoes category.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on Badminton Shoes a")
    public void i_click_on_badminton_shoes_a() {
        sportsJamBadmintonPage.clickOnBadmintonShoes();
    }

    /*
     * a. Method Name: i_verify_badminton_shoes_listed_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies that Badminton Shoes are correctly listed.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify Badminton Shoes listed a")
    public void i_verify_badminton_shoes_listed_a() {
        sportsJamBadmintonPage.verifyBadmintonShoes();
    }

    /*
     * a. Method Name: i_click_on_the_first_product_in_the_page_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the first product displayed in the page.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the first product in the page a")
    public void i_click_on_the_first_product_in_the_page_a() {
        sportsJamBadmintonPage.clickOnProductNumberOneInPage();
    }

    /*
     * a. Method Name: i_click_on_size_five_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on size 5 selection for the product.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on size five a")
    public void i_click_on_size_five_a() {
        sportsJamBadmintonPage.clickOnSize5();
    }

    /*
     * a. Method Name: i_click_on_the_add_to_cart_button_on_the_page_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on the Add to Cart button for the selected product.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on the Add to Cart button on the page a")
    public void i_click_on_the_add_to_cart_button_on_the_page_a() {
        sportsJamBadmintonPage.clickOnAddToCartButtonInPage();
    }

    /*
     * a. Method Name: i_verify_an_error_message_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Verifies the error message displayed after attempting to add an unavailable product to the cart.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I verify an error message a")
    public void i_verify_an_error_message_a() {
        sportsJamBadmintonPage.verifyErrorMessage();
    }

    /*
     * a. Method Name: i_click_on_size_ten_a
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Clicks on size 10 selection for the product.
     * d. Parameters: None
     * e. Return Type: None
     */
    @Then("I click on size ten a")
    public void i_click_on_size_ten_a() {
        sportsJamBadmintonPage.clickOnSize10();
    }

    
    @Then("I click on the Add to Cart button on the page a 2nd time")
    public void i_click_on_the_add_to_cart_button_on_the_page_a_2nd_time() {
        sportsJamBadmintonPage.clickOnAddToCartButtonInPage();
    }
}