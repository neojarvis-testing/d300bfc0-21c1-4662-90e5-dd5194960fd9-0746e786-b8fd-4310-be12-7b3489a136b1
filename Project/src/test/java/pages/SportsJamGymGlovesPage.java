package pages;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamGymGlovesLocators;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamGymGlovesPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SportsJamGymGlovesPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test=test;
    }
    
    /*
     * a. MethodName: hoverOnFitness
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to hover on fitness in navigation bar.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnFitness(){
        try {
            helper.hoverOverElement(SportsJamGymGlovesLocators.fitness,"Hovered on fitness");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnGymGloves
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Click on Gym Gloves under Fitness section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnGymGloves(){
        try {
            helper.clickOnElement(SportsJamGymGlovesLocators.gymGloves, "Clicked on Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyGymGloves
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify title Gym Gloves .
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyGymGloves(){
        try {
            String data = helper.getText(SportsJamGymGlovesLocators.titleGymGloves, "Verified Gym Gloves");
            Assert.assertEquals(data, "Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnEverlast
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Click on Everlast in filter section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnEverlast(){
        try {
            helper.clickOnElement(SportsJamGymGlovesLocators.everlast, "Clicked on Everlast");
            helper.takeScreenshot("ClickedEverlast","Clicked on EverLast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyEverlast
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify everlast in filter section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyEverlast(){
        try {
            helper.waitForElementToBeVisible(SportsJamGymGlovesLocators.titleEverlast, 10);
            String data = helper.getText(SportsJamGymGlovesLocators.titleEverlast, "Verified Everlast");
            Assert.assertEquals(data, "Everlast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnProduct
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to select first product.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnProduct(){
        try {
            helper.waitForElementToBeVisible(SportsJamGymGlovesLocators.product, 10);
            helper.clickOnElement(SportsJamGymGlovesLocators.product, "Clicked on product");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnAddToCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on Add to cart Button.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnAddToCart(){
        try {
            helper.clickOnElement(SportsJamGymGlovesLocators.AddToCart, "Clicked on add to cart");
            helper.clickOnElement(SportsJamGymGlovesLocators.closeProduct,"Dismissed Product");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyProductAddedToCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to veridy that the product is added to cart.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyProductAddedToCart(){
        try {
            helper.waitForElementToBeVisible(SportsJamGymGlovesLocators.titleProductAddedToCart, 10);
            String data = helper.getText(SportsJamGymGlovesLocators.titleProductAddedToCart, "Verified Product added to cart");
            Assert.assertTrue(data.contains("YOU ADDED EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE) TO"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: hoverOnCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Hover on cart icon.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnCart(){
        try {
            helper.hoverOverElement(SportsJamGymGlovesLocators.cart, "Hovered on cart on top right");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify product name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyName(){
        try {
            String data = helper.getText(SportsJamGymGlovesLocators.inCartItem, "Verified Product added to cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnViewCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on View Cart.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnViewCart(){
        try {
            helper.clickOnElement(SportsJamGymGlovesLocators.viewCart, "Clicked on view Cart");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyShoppingCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify shopping cart contains product.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyShoppingCart(){
        try {
            helper.waitForElementToBeVisible(SportsJamGymGlovesLocators.nameInCart, 10);
            String data = helper.getText(SportsJamGymGlovesLocators.nameInCart, "Verified name in cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
            Screenshot.captureScreenShot("Shopping cart");
            Reporter.attachScreenshotToReport("Shopping cart", test, "Shopping cart product");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnProceedToCheckout
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on proceed to check out.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnProceedToCheckout(){
        try {
            helper.clickOnElement(SportsJamGymGlovesLocators.proceedToCheckout, "Clicked on proceed to checkout");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyOrderSummary
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify order summary.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyOrderSummary(){
        try {
            helper.waitForElementToBeVisible(SportsJamGymGlovesLocators.orderSummary, 10);
            String data = helper.getText(SportsJamGymGlovesLocators.orderSummary, "Verified Order Summary");
            Assert.assertEquals(data, "ORDER SUMMARY");
            Screenshot.captureScreenShot("Order summary");
            Reporter.attachScreenshotToReport("Order summary", test, "Attachment of Order summary");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
