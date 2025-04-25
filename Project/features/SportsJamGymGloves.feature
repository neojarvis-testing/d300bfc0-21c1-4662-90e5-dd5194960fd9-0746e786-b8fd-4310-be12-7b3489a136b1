@test5
Feature: Verifying SportsJam Gym Accessories page.
  Scenario: Testing the various Gym Accessories present in navigation bar in page
    When I hover on Fitness c.
    And I click on Gym Gloves c.
    And I verify the title Gym Gloves c.
    And I click on Evarlast c.
    And I Verify the filter Everlast c.
    And I click on first Product c.
    And I click on Add to cart.
    And I verify the text Product added to cart c.
    And I hover on cart c.
    And I verify the name of product c.
    And I click on view cart c.
    And I verify Shopping cart c.
    And I click on Proceed to checkout c.
    Then I verify text Order Summary c. 
