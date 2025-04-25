package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SportsJamMensShoesPage;
import utils.Base;

public class SportsJamMensShoesPageSteps {
	
	ExtentTest extentTest= Hooks.reports.createTest("Testcase10");
	SportsJamMensShoesPage jamMensShoesPage = new SportsJamMensShoesPage(Base.driver,extentTest);
	
	@When("I verify the Home page url")
	public void i_verify_the_home_page_url() {
	    jamMensShoesPage.verifyHomePageURL();
	    
	}
	@When("I hover on the shoes category")
	public void i_hover_on_the_shoes_category() {
	    jamMensShoesPage.hoverOnShoes();
	    
	}
	@Then("I verify the categories under the shoes section")
	public void i_verify_the_categories_under_the_shoes_section() {
	    
	    jamMensShoesPage.verifyCategories();
	}
	
	@When("I click on Badminton shoes")
	public void i_click_on_badminton_shoes() {
	    
		jamMensShoesPage.clickOnBadmintion();
	    
	}
	@Then("I verify the Badminton shoes page url")
	public void i_verify_the_badminton_shoes_page_url() {
	    jamMensShoesPage.verifyBadmintonShoesPage();
	    
	}
	@When("I click on Basketball shoes")
	public void i_click_on_basketball_shoes() {
	    
	    jamMensShoesPage.clickOnBasketball();
	}
	@Then("I verify the Basketball shoes page url")
	public void i_verify_the_basketball_shoes_page_url() {
	    
	    jamMensShoesPage.verifyBasketBallShoesPage();
	}
	@When("I click on Cricket shoes")
	public void i_click_on_cricket_shoes() {
	    
		jamMensShoesPage.clickOnCricket();
	    
	}
	@Then("I verify the Cricket shoes page url")
	public void i_verify_the_cricket_shoes_page_url() {
	    jamMensShoesPage.verifyCricketShoesPage();
	    
	}
	@When("I click on Football shoes")
	public void i_click_on_football_shoes() {
	    jamMensShoesPage.clickOnFootBall();
	    
	}
	@Then("I verify the Football shoes page url")
	public void i_verify_the_football_shoes_page_url() {
	    jamMensShoesPage.verifyFootBallShoesPage();
	    
	}
	@When("I click on Running shoes")
	public void i_click_on_running_shoes() {
	    
	    jamMensShoesPage.clickOnRunning();
	}
	@Then("I verify the Running shoes page url")
	public void i_verify_the_running_shoes_page_url() {
	    
	    jamMensShoesPage.verifyRunningShoesPage();
	}
	@Then("I click on squash shoes")
	public void i_click_on_squash_shoes() {
	    jamMensShoesPage.clickOnSquash();
	    
	}
	
	@Then("I verify the squash shoes page uRL")
	public void i_verify_the_squash_shoes_page_u_rl() {
	    jamMensShoesPage.verifySquashShoesPage();
	}	
}
