package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ShopSportsPage;
public class ShopSportsPageSteps{

    ExtentTest test = Hooks.reports.createTest("Sports shop");
    ShopSportsPage page = new ShopSportsPage(test);

    @When("I hover on Racket Sports d.")
    public void i_hover_on_racket_sports_d() {
        page.hoverOnRacketSports();
    }
    @When("I click on Shop Sportswear d.")
    public void i_click_on_shop_sportswear_d() {
        page.clickonShopSportswear();
    }
    @When("I verify the URL for Clothing d.")
    public void i_verify_the_url_for_clothing_d() {
        page.verifyClothing();
    }
    @When("I click on List View d.")
    public void i_click_on_list_view_d() {
        page.clickonListView();
    }
    @When("I click on Compare for the first product d.")
    public void i_click_on_compare_for_the_first_product_d() {
        page.clickonCompare1();
    }
    @When("I verify that the first product was added to the comparison list d.")
    public void i_verify_that_the_first_product_was_added_to_the_comparison_list_d() {
        page.verifyYouaddedproducttothecomparisonlist();
    }
    @When("I click on Compare for the second product d.")
    public void i_click_on_compare_for_the_second_product_d() {
        page.clickonCompare2();
    }
    @When("I verify the second product was added d.")
    public void i_verify_the_second_product_was_added_d() {
        page.verifyComapre2();
    }
    @When("I click on the Compare Product List d.")
    public void i_click_on_the_compare_product_list_d() {
        page.clickonCompareProductList();
    }
    @When("I verify the products being compared d.")
    public void i_verify_the_products_being_compared_d() {
        page.verifyCompareProducts();
    }
    @When("I click on the Remove button for the first product d.")
    public void i_click_on_the_remove_button_for_the_first_product_d() {
        page.clickOnX1();
    }
    @When("I confirm the removal of the first product d.")
    public void i_confirm_the_removal_of_the_first_product_d() {
        page.clickOnOK1();
    }
    @When("I verify the removal of the first product d.")
    public void i_verify_the_removal_of_the_first_product_d() {
        page.verifyOk1();
    }
    @When("I click on the Remove button for the second product d.")
    public void i_click_on_the_remove_button_for_the_second_product_d() {
        page.clickOnx2();
    }
    @When("I confirm the removal of the second product d.")
    public void i_confirm_the_removal_of_the_second_product_d() {
        page.clickOnOk2();
    }
    @When("I verify the removal of the second product d.")
    public void i_verify_the_removal_of_the_second_product_d() {
        page.verifyOK2();
    }
    @Then("I verify the final message d.")
    public void i_verify_the_final_message_d() {
        page.verifyMessage();
    }
}
