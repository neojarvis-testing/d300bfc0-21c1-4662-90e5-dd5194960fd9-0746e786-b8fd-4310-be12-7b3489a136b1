package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProtectiveGearPage;
import utils.Base;

public class ProtectiveGearPageSteps {
    ExtentTest test=Hooks.reports.createTest("Protective");
    ProtectiveGearPage page=new ProtectiveGearPage(test);

    @When("I hover on Team Sports d.")
    public void i_hover_on_team_sports_d() {
        page.hoverOnTeamSport();
    }
    @When("I hover on Protective Gear d.")
    public void i_hover_on_protective_gear_d() {
        page.hoveredOnProtectiveGear();
    }
    @When("I click on Batting Gloves d.")
    public void i_click_on_batting_gloves_d() {
        page.clickOnBattingGloves();
    }
    @When("I verify the URL for Batting Gloves d.")
    public void i_verify_the_url_for_batting_gloves_d() {
        page.verifyBattingGlovesURL();
    }
    @When("I verify Batting Gloves d.")
    public void i_verify_batting_gloves_d() {
        page.verifyBattingGloves();
        Base.driver.navigate().back();
        page.hoverOnTeamSport();
    }
    @When("I click on Batting Leg Guards d.")
    public void i_click_on_batting_leg_guards_d() {
        page.clickOnBattingLegGuards();
    }
    @When("I verify the URL for Batting Leg Guards d.")
    public void i_verify_the_url_for_batting_leg_guards_d() {
        page.verifyBattingLeguardURL();
    }
    @When("I verify Batting Leg Guards d.")
    public void i_verify_batting_leg_guards_d() {
        page.verifyBattingLegGuard();
        Base.driver.navigate().back();
        page.hoverOnTeamSport();
    }
    @When("I click on Wicket Keeping Gloves d.")
    public void i_click_on_wicket_keeping_gloves_d() {
        page.hoveredOnProtectiveGear();
        page.clickOnWicketKeepingGloves();
    }
    @When("I verify the URL for Wicket Keeping Gloves d.")
    public void i_verify_the_url_for_wicket_keeping_gloves_d() {
        page.verifyWicketKeepingGlovesURL();
    }
    @When("I verify Wicket Keeping Gloves d.")
    public void i_verify_wicket_keeping_gloves_d() {
        page.verifyWicketKeepingGloves();
        Base.driver.navigate().back();
        page.hoverOnTeamSport();
    }
    @When("I click on Wicket Keeping Leg Guards d.")
    public void i_click_on_wicket_keeping_leg_guards_d() {
        page.hoveredOnProtectiveGear();
        page.clickoNWicketKeepingLegGuard();
    }
    @When("I verify the URL for Wicket Keeping Leg Guards d.")
    public void i_verify_the_url_for_wicket_keeping_leg_guards_d() {
        page.verifyWicketKeepingLegGuardURL();
    }
    @When("I verify Wicket Keeping Leg Guards d.")
    public void i_verify_wicket_keeping_leg_guards_d() {
        page.verifyWicketKeepingLegGuard();
        Base.driver.navigate().back();
        page.hoverOnTeamSport();
    }
    @When("I click on Cricket Helmets d.")
    public void i_click_on_cricket_helmets_d() {
        page.hoveredOnProtectiveGear();
        page.clickonCricketHelmets();
    }
    @When("I verify the URL for Cricket Helmets d.")
    public void i_verify_the_url_for_cricket_helmets_d() {
        page.verifyCricketHelmetsURL();
    }
    @When("I verify Cricket Helmets d.")
    public void i_verify_cricket_helmets_d() {
        page.verifyCricketHelmets();
        Base.driver.navigate().back();
        page.hoverOnTeamSport();
    }
    @When("I click on Inner Thigh Pads d.")
    public void i_click_on_inner_thigh_pads_d() {
        page.hoveredOnProtectiveGear();
        page.clickOnInnerThighPads();
    }
    @When("I verify the URL for Inner Thigh Pads d.")
    public void i_verify_the_url_for_inner_thigh_pads_d() {
        page.verifyInnerThighPadsURL();
    }
    @Then("I verify Inner Thigh Pads d.")
    public void i_verify_inner_thigh_pads_d() {
        page.verifyInnerThighPads();
    }
}
