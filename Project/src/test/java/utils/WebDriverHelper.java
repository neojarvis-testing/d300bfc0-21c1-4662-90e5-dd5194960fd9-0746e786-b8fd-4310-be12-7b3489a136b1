package utils;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
 
public class WebDriverHelper {
    WebDriver driver;
	ExtentTest test;
	 List<String> list=new ArrayList<String>();
	public WebDriverHelper(WebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		list.add(driver.getWindowHandle());
	}
	/*
	 * Method Name: clickOnElement
	 * Author Name: Muralidhar
	 * Description: Clicks on the specified web element after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void clickOnElement(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			driver.findElement(locator).click();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: sendData
	 * Author Name: Muralidhar
	 * Description: Sends data to the specified web element after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String value, String message
	 * Return Type: None
	 */

	public void sendData(By locator, String value, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			driver.findElement(locator).sendKeys(value);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: getText
	 * Author Name: Muralidhar
	 * Description: Retrieves text from the specified web element after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String message
	 * Return Type: String
	 */

	public String getText(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			String dataString = driver.findElement(locator).getText();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
			return dataString;
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
		return null;
	}
	/*
	 * Method Name: hoverOverElement
	 * Author Name: Muralidhar
	 * Description: Hovers the mouse cursor over the specified web element after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void hoverOverElement(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(locator);
			action.moveToElement(element).build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: hoverOverClick
	 * Author Name: Muralidhar
	 * Description: Clicks on the specified web element by hovering over it after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void hoverOverClick(By locator, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement element = driver.findElement(locator);
			action.click(element).build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: switchToIFrame
	 * Author Name: Muralidhar
	 * Description: Switches the driver context to the specified iframe after ensuring it is visible within the provided timeout.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void switchToIFrame(By locator, String message){
		try {
			waitForElementToBeVisible(locator, 10);
			WebElement element=driver.findElement(locator);
			driver.switchTo().frame(element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: exitIFrame
	 * Author Name: Muralidhar
	 * Description: Exits the current iframe context and switches back to the default content.
	 * Parameters: String message
	 * Return Type: None
	 */

	public void exitIFrame(String message){
		try {
			driver.switchTo().defaultContent();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: jsScrollUsingPixel
	 * Author Name: Muralidhar
	 * Description: Scrolls the webpage by the specified pixel offset using JavaScript.
	 * Parameters: int x, int y, String message
	 * Return Type: None
	 */

	public void jsScrollUsingPixel(int x,int y, String message) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("window.scrollBy(arguments[0],arguments[1])", x,y);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: jsScrollUntilElementIsVisible
	 * Author Name: Muralidhar
	 * Description: Scrolls until the specified web element is visible using JavaScript.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void jsScrollUntilElementIsVisible(By locator, String message) {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: jsClick
	 * Author Name: Muralidhar
	 * Description: Performs a click action on the specified web element using JavaScript.
	 * Parameters: By locator, String message
	 * Return Type: None
	 */

	public void jsClick(By locator, String message) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(locator);
			jsExecutor.executeScript("arguments[0].click()",element);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: selectDropDown
	 * Author Name: Muralidhar
	 * Description: Selects an option from the dropdown menu by visible text.
	 * Parameters: By locator, String value, String message
	 * Return Type: None
	 */

	public void selectDropDown(By locator, String value, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			WebElement element = driver.findElement(locator);
			
			Select select = new Select(element);
			select.selectByVisibleText(value);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: getElementsByXPath
	 * Author Name: Muralidhar
	 * Description: Retrieves a list of web elements based on the provided XPath expression.
	 * Parameters: String path, String message
	 * Return Type: List<WebElement>
	 */

	public List<WebElement> getElementsByXPath(String path, String message){
		try {
			List<WebElement> elements = driver.findElements(By.xpath(path));
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
			return elements;
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
		return null;
	}
	/*
	 * Method Name: switchToChildWindow
	 * Author Name: Muralidhar
	 * Description: Switches the driver context to a child window.
	 * Parameters: String message
	 * Return Type: None
	 */

	public void swichToChildWindow(String message) {
		try {
			String parent = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			for(String child: set) {
				if(!child.equals(parent)) {
					driver.switchTo().window(child);
				}
			}
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: switchToParentWindow
	 * Author Name: Muralidhar
	 * Description: Switches the driver context to the parent window.
	 * Parameters: String message
	 * Return Type: None
	 */

	public void swichToParentWindow(String message) {
		try {
			String child = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			for(String parent: set) {
				if(!child.equals(parent)) {
					driver.switchTo().window(parent);
				}
			}
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: dragAndDrop
	 * Author Name: Muralidhar
	 * Description: Drags an element from the source location and drops it at the destination location.
	 * Parameters: By sourcePath, By destinationPath, String message
	 * Return Type: None
	 */
	public void dragAndDrop(By sourcePath, By destinationPath, String message) {
		try {
			waitForElementToBeVisible(sourcePath, 10);
			waitForElementToBeVisible(destinationPath, 10);
			Actions action = new Actions(driver);
			WebElement source = driver.findElement(sourcePath);
			WebElement destination = driver.findElement(destinationPath);
			action.dragAndDrop(source, destination).perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: sliderFunction
	 * Author Name: Muralidhar
	 * Description: Moves the slider to the specified pixel offset.
	 * Parameters: By locator, int pixel, String message
	 * Return Type: None
	 */

	public void sliderFunction(By locator, int pixel, String message) {
		try {
			waitForElementToBeVisible(locator, 10);
			Actions action = new Actions(driver);
			WebElement slider = driver.findElement(locator);
			action.clickAndHold(slider).moveByOffset(pixel, 0).release().build().perform();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: waitForElementToBeVisible
	 * Author Name: Muralidhar
	 * Description: Waits until the specified web element is visible within the provided timeout period.
	 * Parameters: By locator, int seconds
	 * Return Type: None
	 */

	public void waitForElementToBeVisible(By locator ,int seconds ){
        try{
        new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch(Exception e){
            LoggerHandler.error("waiting for element failed");
        }
    }
	/*
	 * Method Name: navigateBack
	 * Author Name: Muralidhar
	 * Description: Navigates back to the previous page.
	 * Parameters: String message
	 * Return Type: None
	 */

	public void navigateBack(String message) {
		try {
			driver.navigate().back();
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			 
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: enterAction
	 * Author Name: Muralidhar
	 * Description: Sends an Enter key action to the specified web element.
	 * Parameters: By locator, String value, String message
	 * Return Type: None
	 */

	public void enterAction(By locator, String value, String message) {
		try {
			driver.findElement(locator).sendKeys(Keys.ENTER);
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (Exception e) {
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
	}
	/*
	 * Method Name: switchToNewWindow
	 * Author Name: Muralidhar
	 * Description: Switches the driver context to a newly opened window and adds its handle to a list.
	 * Parameters: None
	 * Return Type: None
	 */
	public void switchToNewWindow() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String windowHandle : windowHandles) {
                if (!windowHandle.isEmpty()) {
                    driver.switchTo().window(windowHandle);
                    list.add(windowHandle);
                } else {
                    throw new Exception("New window could not be retrieved");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	/*
	 * Method Name: switchBackToWindow
	 * Author Name: Muralidhar
	 * Description: Switches back to the specified window using its handle index from the list.
	 * Parameters: int x
	 * Return Type: None
	 */

	public void switchBackTowindow(int x){
		driver.switchTo().window(list.get(x));
	}
	/*
	 * Method Name: verifyPageUrl
	 * Author Name: Muralidhar
	 * Description: Verifies the current page URL against the expected URL.
	 * Parameters: String expectedUrl, String message
	 * Return Type: None
	 */

    public void verifyPageUrl(String expectedUrl, String message) {
        try 
		{
			String PageUrl = driver.getCurrentUrl();
			LoggerHandler.info(PageUrl + "Page Url");
			LoggerHandler.info(expectedUrl + "Expected PageUrl");
			Assert.assertEquals(expectedUrl,PageUrl);

			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} 
		catch (AssertionError e) 
		{
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);	
		}
    }
	/*
	 * Method Name: checkAssert
	 * Author Name: Muralidhar
	 * Description: Checks if the specified text contains the given value.
	 * Parameters: String text, String containsValue, String message
	 * Return Type: None
	 */

    public void checkAssert(String text, String containsValue, String message) {
        try {
			LoggerHandler.info(text + "text value");
            LoggerHandler.info(containsValue + "contains Value");
			Assert.assertTrue(text.contains(containsValue));
			LoggerHandler.info(message);
			test.log(Status.PASS, message);
		} catch (AssertionError e) {
			LoggerHandler.error(message);
			test.log(Status.FAIL, message);
		}
    }
	/*
	 * Method Name: enterData
	 * Author Name: Muralidhar
	 * Description: Sends an Enter key action to the specified web element.
	 * Parameters: By path
	 * Return Type: None
	 */

	public void enterData(By path) {
        driver.findElement(path).sendKeys(Keys.ENTER);
    }
	/*
	 * Method Name: takeScreenshotMuralidhar
	 * Author Name: Muralidhar
	 * Description: Captures a screenshot and attaches it to the report.
	 * Parameters: String filename, String description
	 * Return Type: None
	 */

	public void takeScreenshot(String filename,String description)
	{
		Screenshot.captureScreenShot(filename);
        Reporter.attachScreenshotToReport(filename, test, description);
	}
}