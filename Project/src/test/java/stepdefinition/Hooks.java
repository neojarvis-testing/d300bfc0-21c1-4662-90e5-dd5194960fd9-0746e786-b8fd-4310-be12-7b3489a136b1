package stepdefinition;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{

	public static ExtentReports reports;

	/*
     * a. Method Name: openReport
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Initializes the ExtentReports instance for logging test reports.
     * d. Parameters: None
     * e. Return Type: None
     */
	@BeforeAll
	public static void openReport()
	{
		reports = Reporter.generateReport("Sports_Jam");
	}
	
	/*
     * a. Method Name: openInterface
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Launches the browser session before each test scenario.
     * d. Parameters: None
     * e. Return Type: None
     */
	@Before
	public void openInterface()
	{
		openBrowser();
	}
	
	/*
     * a. Method Name: closeInterface
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Closes the browser session after each test scenario.
     * d. Parameters: None
     * e. Return Type: None
     */
	@After
	public void closeInterface()
	{
		driver.quit();
	}
	
	/*
     * a. Method Name: closeReport
     * b. Author Name: Tanishk Maheshwari
     * c. Description: Finalizes and flushes the ExtentReports instance after all test scenarios are executed.
     * d. Parameters: None
     * e. Return Type: None
     */
	@AfterAll
	public static void closeReport()
	{
		reports.flush();
	}
}
