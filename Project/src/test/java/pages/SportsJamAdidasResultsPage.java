package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamAdidasResultsPageLocator;
import uistore.SportsJamHomePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SportsJamAdidasResultsPage {
    ExtentTest test;
    WebDriverHelper helper;
    String excelAssertData = "AssertData";

    public SportsJamAdidasResultsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test=test;
    }

    /*
     * a. Method Name: clickOnSearchIcon
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on search icon.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnSearchIcon(){
        helper.clickOnElement(SportsJamHomePageLocator.searchIcon, "Clicked on search icon");
    }

    /*
     * a. Method Name: verifySearchBar
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the search bar is displayed.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifySearchBar(){
        String text = Base.driver.findElement(SportsJamHomePageLocator.placeholderSearchBar).getDomAttribute("placeholder");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 0, 0),"Search bar is verified and displayed");
    }

    /*
     * a. Method Name: clickOnSearchBar
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on search bar.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnSearchBar(){
        helper.clickOnElement(SportsJamHomePageLocator.searchBar, "Clicked on search bar");
    }

    /*
     * a. Method Name: sendDataInSearchBar
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to send data in search bar.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void sendDataInSearchBar(){
        helper.sendData(SportsJamHomePageLocator.searchBar, ExcelReader.getCellData("SearchBarData", 0, 0), "Input sent");
    }

    /*
     * a. Method Name: clickOnGoButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on go button.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnGoButton(){
        helper.clickOnElement(SportsJamHomePageLocator.goButton, "Clicked on Go button");
    }

    /*
     * a. Method Name: pressEnter
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to press enter.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void pressEnter(){
        helper.enterData(SportsJamHomePageLocator.searchBar);
    }

    /*
     * a. Method Name: verifyAdidasInHeading
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the heading.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyAdidasInHeading(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.adidasHeading, "Adidas heading verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 1, 0), "Adidas heading verified");
    }

    /*
     * a. Method Name: selectCheckboxOfRacketSports
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to select the checkbox of Racket Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void selectCheckboxOfRacketSports(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, "Selected Racket Sports");
    }

    /*
     * a. Method Name: verifyRacketSportsLabel
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the Racket sports label.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyRacketSportsLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRacketSportsLabel, "Racket Sports label verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 2, 0),"Racket Sports label verified");
    }
    
    /*
     * a. Method Name: selectCheckboxOfShoes
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to select the checkbox of Shoes.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void selectCheckboxOfShoes(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryShoes, "Selected Shoes");
    }
    
    /*
     * a. Method Name: verifyShoesLabel
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used verify the Racket sports label.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyShoesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryShoesLabel, "Shoes label verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 3, 0),"Shoes label verified");
    }

    /*
     * a. Method Name: deSelectCheckboxOfRacketSports
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to de-select the checkbox of Racket Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void deSelectCheckboxOfRacketSports(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRacketSports, "De-selected Racket Sports");
    }

    /*
     * a. Method Name: selectCheckboxOfClothing
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to select the checkbox of CLothing.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void selectCheckboxOfClothing(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryClothing, "Selected Clothing");
    }

    /*
     * a. Method Name: verifyClothingLabel
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used verify the clothing label.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyClothingLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryClothingLabel, "Clothing label verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 4, 0), "Clothing label verified");
    }

    /*
     * a. Method Name: selectCheckboxOfAccessories
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to select the checkbox of Accessories.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void selectCheckboxOfAccessories(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryAccessories, "Selected Accessories");
    }

    /*
     * a. Method Name: verifyAccessoriesLabel
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used verify the Accessories label.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyAccessoriesLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryAccessoriesLabel, "Accessories label verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 5, 0), "Accessories label verified");
    }

    /*
     * a. Method Name: selectCheckboxOfRunning
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to select the checkbox of Running.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void selectCheckboxOfRunning(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.filterCategoryRunning, "Selected Running");
    }

    /*
     * a. Method Name: verifyRunningLabel
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used verify the Running label.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyRunningLabel(){
        String text = helper.getText(SportsJamAdidasResultsPageLocator.filterCategoryRunningLabel, "Running label verified");
        LoggerHandler.info(text);
        helper.checkAssert(text, ExcelReader.getCellData(excelAssertData, 6, 0), "Running label verified");
    }

    /*
     * a. Method Name: clickClearAllButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to clear all the filters.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickClearAllButton(){
        helper.clickOnElement(SportsJamAdidasResultsPageLocator.clearAllButton, "Clicked on Clear All button");
    }

    // /*
    //  * a. Method Name: adidasProductsFilter
    //  * b. Author Name: Tanishk Maheshwari
    //  * c. Description: This will be used to integrate all the methods in a single method which will be called in the runner.
    //  * d. Parameter: None
    //  * e. Return Type: void
    //  */
    // public void adidasProductsFilter(){
    //     clickOnSearchIcon();
    //     verifySearchBar();
    //     clickOnSearchBar();
    //     sendDataInSearchBar();
    //     clickOnGoButton();
    //     pressEnter();
    //     verifyAdidasInHeading();
    //     selectCheckboxOfRacketSports();
    //     verifyRacketSportsLabel();
    //     selectCheckboxOfShoes();
    //     verifyShoesLabel();
    //     deSelectCheckboxOfRacketSports();
    //     selectCheckboxOfClothing();
    //     verifyClothingLabel();
    //     selectCheckboxOfAccessories();
    //     verifyAccessoriesLabel();
    //     selectCheckboxOfRunning();
    //     verifyRunningLabel();
    //     clickClearAllButton();
    // }
}