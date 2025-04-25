package stepdefinition;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{

	static ExtentReports reports;
	@BeforeAll
	public static void openReport()
	{
		reports = Reporter.generateReport("Sports_Jam");
	}
	
	@Before
	public void openInterface()
	{
		openBrowser();
	}
	
	@After
	public void closeInterface()
	{
		driver.quit();
	}
	
	@AfterAll
	public static void closeReport()
	{
		reports.flush();
	}
}
