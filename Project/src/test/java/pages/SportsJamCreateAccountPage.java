package pages;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamCreateAccountPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamCreateAccountPage {
    ExtentTest test;
    WebDriverHelper helper;
    String excelCreateAccountSheet = "CreateAccountPage";
    public SportsJamCreateAccountPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test = test;
    }
  
    /*
     * a. MethodName: hoverOnLogin
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to hover on Login Icon.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnLogin(){
        try {
            helper.hoverOverElement(SportsJamCreateAccountPageLocators.loginIcon, "Hovered on Login");
        } catch (Exception e) {
           LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnLogin
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on login.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnLogin(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.loginButton, "Clicked on LOG IN");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnCreateAccount
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on create account.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCreateAccount(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.createAccount, "Clicked on create Account");
            Thread.sleep(2000);
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInFirstName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in first name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInFirstName(String fName){
        try {
            Thread.sleep(2000);
            helper.clickOnElement(SportsJamCreateAccountPageLocators.firstName, "Clicked on Firstname");
            helper.sendData(SportsJamCreateAccountPageLocators.firstName,fName , "Sent value to firstname");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInLastName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in last name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLastName(String lName){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.lastName, "Clicked on ");
            helper.sendData(SportsJamCreateAccountPageLocators.lastName, lName , "Sent value to last name");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInEmail
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in email.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInEmail(String email){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.email, "Clicked on email");
            helper.sendData(SportsJamCreateAccountPageLocators.email, email, "Sent value to email");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in password field.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInPassword(String passwordData){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.password, "Clicked on password");
            helper.sendData(SportsJamCreateAccountPageLocators.password, passwordData , "Sent value to password");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInConfirmPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in confirm password.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInConfirmPassword(String passwordData){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.confirmPassword, "Clicked on ");
            helper.sendData(SportsJamCreateAccountPageLocators.confirmPassword, passwordData , "Sent value to confirmpassword");
            Screenshot.captureScreenShot("account details");
            Reporter.attachScreenshotToReport("account details", test, "Account details of created account");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnCreate
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on create account.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCreate(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.create, "Clicked on create");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyThankYou
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify thank you message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyThankYou(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.thankYou, "Verified Thank you message");
            Assert.assertTrue(data.contains("THANK YOU"));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnLogout
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on logout.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnLogout(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.logout,"Clicked on logout");
            Screenshot.captureScreenShot("logout");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: backNavigate
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to navigate back.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void backNavigate(){
        try {
            helper.navigateBack("Navigated Back");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInLoginEmail
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in email in login page.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLoginEmail(String email){
        try {
            helper.sendData(SportsJamCreateAccountPageLocators.loginEmail, email, "Sent email in Login page");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: sendInLoginPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in password in login page.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLoginPassword(String password){
        try {
            helper.sendData(SportsJamCreateAccountPageLocators.loginPassword, password, "Sent password in Login page");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnSignIn
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on sign in.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnSignIn(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.signIn, "Clicked on signIn");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyErrorMessage
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify error message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyErrorMessage(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.errorMessage, "Verified Error Message");
            Assert.assertTrue(data.contains( "THE ACCOUNT SIGN-IN WAS INCORRECT OR YOUR ACCOUNT IS DISABLED"));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

}
