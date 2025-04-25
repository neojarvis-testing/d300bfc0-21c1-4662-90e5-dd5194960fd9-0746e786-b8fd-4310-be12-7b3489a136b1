@test10
Feature: Verifying SportsJam Mens shoes page
  Scenario: Testing the various shoes categories in mens shows page
    When I verify the Home page url
    And I hover on the shoes category
    Then I verify the categories under the shoes section
    When I click on Badminton shoes
    Then I verify the Badminton shoes page url
    When I hover on the shoes category
    And I click on Basketball shoes
    Then I verify the Basketball shoes page url
    When I hover on the shoes category
    And I click on Cricket shoes
    Then I verify the Cricket shoes page url
    When I hover on the shoes category
    And I click on Football shoes
    Then I verify the Football shoes page url
    When I hover on the shoes category
    And I click on Running shoes
    Then I verify the Running shoes page url
    When I hover on the shoes category
    And I click on squash shoes
    Then I verify the squash shoes page uRL