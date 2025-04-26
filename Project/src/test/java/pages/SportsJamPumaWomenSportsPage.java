package pages;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import uistore.PumaProductPageLocators;
import uistore.SportsJamBrandPageLocators;
import uistore.SportsJamCustomerLoginLocators;
import uistore.SportsJamHomePageLocators;
import utils.ExcelReader;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamPumaWomenSportsPage {

    WebDriverHelper webDriverHelper;
    ExtentTest test;

    public SportsJamPumaWomenSportsPage(WebDriver driver, ExtentTest test)
    {
        webDriverHelper = new WebDriverHelper(driver, test);
        this.test = test;
    }

    /*
     * a. MethodName: verifyHomePageURL
     * b. AuthorName: Sharath
     * c. Description: This verifies the Home page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyHomePageURL() 
    {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS",0,0),"Home page url is verified");
    }
    
    /*
     * a. MethodName: clickOnBrand
     * b. AuthorName: Sharath
     * c. Description: This code clicks on brand button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnBrand() 
    {
        webDriverHelper.clickOnElement(SportsJamHomePageLocators.brand, "Clicked on brand");
    }
    
    /*
     * a. MethodName: verifyBrandsPageURL
     * b. AuthorName: Sharath
     * c. Description: This verifies the Brand Page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyBrandsPageURL() 
    {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS",1,0),"Brand page url is verified");
    }

    /*
     * a. MethodName: clickOnBrand
     * b. AuthorName: Sharath
     * c. Description: This code clicks on search bar
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnSearchBar() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.searchBar, "Clicked on searchbar");
    }
    
    /*
     * a. MethodName: sendDataToSearchBar
     * b. AuthorName: Sharath
     * c. Description: This code sends data to search bar
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void sendDataToSearchBar(String brand) 
    {
        webDriverHelper.sendData(SportsJamBrandPageLocators.searchBar,brand, "Sent Puma to searchbar");
    }

    /*
     * a. MethodName: clickOnSearchIcon
     * b. AuthorName: Sharath
     * c. Description: This code clicks on searchicon
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnSearchIcon() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.searchIcon, "Clicked on search icon");
        Screenshot.captureScreenShot("clicked_search");
        Reporter.attachScreenshotToReport("clicked_search",test,"clicked_search");
    }

    /*
     * a. MethodName: verifyTextForPuma
     * b. AuthorName: Sharath
     * c. Description: This verifies the The Puma text from element
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyTextForPuma() 
    {
        String text = webDriverHelper.getText(SportsJamBrandPageLocators.pumaLink,"puma text is retrieved form element");
        // Assert.assertTrue(text.contains("Puma"));
        webDriverHelper.checkAssert(text, ExcelReader.getCellData("AssertContainsData",0,0), "checked Puma Value from element");
    }

    /*
     * a. MethodName: clickOnPuma
     * b. AuthorName: Sharath
     * c. Description: This code clicks on Puma Button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnPuma() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.pumaLink, "click on Puma");
    }

    /*
     * a. MethodName: verifyThePumaPage
     * b. AuthorName: Sharath
     * c. Description: This verifies the Puma Page Url
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyThePumaPage() 
    {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS",2,0),"Puma Product Result page url is verified");
    }

    /*
     * a. MethodName: clickOnAccesories
     * b. AuthorName: Sharath
     * c. Description: This code clicks on Accessories Button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnAccesories() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.accessories, "Clicked on Accessries");
    }

    /*
     * a. MethodName: verifyAccessoiresTextInFilter
     * b. AuthorName: Sharath
     * c. Description: This verifies the Accessories text after appliying filter
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyAccessoiresTextInFilter() 
    {
        String text = webDriverHelper.getText(PumaProductPageLocators.accessoriesText, "Retrieved Accessories text from element");
        // System.out.println(text);
        webDriverHelper.checkAssert(text.toLowerCase(), ExcelReader.getCellData("AssertContainsData",1,0), "Checked if text contains accessories");
    }

    /* 
     * a. MethodName: hoverOverPumaWomenSportQuartersAssorted
     * b. AuthorName: Sharath
     * c. Description: This code hovers over first product
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void hoverOverPumaWomenSportQuartersAssorted() 
    {
        webDriverHelper.hoverOverElement(PumaProductPageLocators.firstProduct,"Hoverd on Women Sport Quarter Assorted Prodcut");
    }

    /*
     * a. MethodName: clickOnQuickView
     * b. AuthorName: Sharath
     * c. Description: This code clicks on WuickView Button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnQuickView() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.quickView, "Clicked on QuickView");
    }

    /*
     * a. MethodName: switchToIframe
     * b. AuthorName: Sharath
     * c. Description: This code switcehs into iframe ks on Puma Button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void switchToIframe() 
    {
        webDriverHelper.switchToIFrame(PumaProductPageLocators.iframe, "Switched to Iframe");
    }

    /*
     * a. MethodName: verifyIFrameURL
     * b. AuthorName: Sharath
     * c. Description: This verifies the Page url from the iframe
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyIFrameURL() 
    {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS",3,0), "Iframe Page Url Verified");
    }

    /*
     * a. MethodName: clickOnWishList
     * b. AuthorName: Sharath
     * c. Description: This code clicks on WishList Button
     * d. Parameters: None
     * e. ReturnType: None
     */    
    public void clickOnWishList() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.wishList, "Clicked On WishList");
        webDriverHelper.exitIFrame("exited form iframe");
    }

    /*
     * a. MethodName: verifyLoginPromptMessage
     * b. AuthorName: Sharath
     * c. Description: This verifies the text in prompt message
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyLoginPromptMessage() 
    {
        String text = webDriverHelper.getText(SportsJamCustomerLoginLocators.promtMessage, "Retrieved Prompt message");
        System.out.println(text);
        // Assert.assertTrue(text.toLowerCase().contains("you must login or register to add items to your wishlist."));
        webDriverHelper.checkAssert(text.toLowerCase(), ExcelReader.getCellData("AssertContainsData",2,0), "verified if text contains login ot register");
    }

    /*
     * a. MethodName: clickAndSendDataToEmail
     * b. AuthorName: Sharath
     * c. Description: This code clicks and sends email to input field
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickAndSendDataToEmail(String email) 
    {
        // ExcelReader.getCellData("CustomerLogin",0,0);
        webDriverHelper.clickOnElement(SportsJamCustomerLoginLocators.email, "Clicked On email");
        webDriverHelper.sendData(SportsJamCustomerLoginLocators.email,email,"Sent email to input field");
    }

    /*
     * a. MethodName: clickAndSendDataToPassword
     * b. AuthorName: Sharath
     * c. Description: This code clicks and sends password to input field
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickAndSendDataToPassword(String password) 
    {
        // ExcelReader.getCellData("CustomerLogin",1,0);
        webDriverHelper.clickOnElement(SportsJamCustomerLoginLocators.password, "Clicked On password");
        webDriverHelper.sendData(SportsJamCustomerLoginLocators.password, password , "Sent data to password field");
    }

    /*
     * a. MethodName: clickOnSignIn
     * b. AuthorName: Sharath
     * c. Description: This code clicks on signin Button
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void clickOnSignIn() 
    {
        webDriverHelper.clickOnElement(SportsJamCustomerLoginLocators.signIn,"Clicked on Signin");
    }

    /*
     * a. MethodName: verifyTheErrorMessage
     * b. AuthorName: Sharath
     * c. Description: This verifies the sign in text
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void verifyTheErrorMessage() 
    {
        String text = webDriverHelper.getText(SportsJamCustomerLoginLocators.signInText,"Retrieved data form signin text");
        System.out.println(text);
        webDriverHelper.checkAssert(text, ExcelReader.getCellData("AssertContainsData",3,0), "Verified Text form element");

        webDriverHelper.takeScreenshot("PumaWomen Page","captured screenshot for puma women shoes page");
        Reporter.attachBase64ScreenshotToReport("PumaWomen Page", test, "");
    }


}