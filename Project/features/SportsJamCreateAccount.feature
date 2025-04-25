@test6
Feature: Verifying SportsJam Create an account page.
  Scenario: Testing the account icon present in navigation bar in page
    When I hover on Account icon c.
    And I click on Login c.
    And I click on Create an account c.
    And I send value in Firstname c.
    And I send value in Lastname c.
    And I send value in email c.
    And I send value in password c.
    And I send value in confirm password c.
    And I click on create an account button c.
    And I verify the text Thank you for registering c.
    And I click on Logout button.
    And I navigate back to previous page.
    And I send value in Email in login page c.
    And I send value in password in login page c.
    Then I verify Error message c. 