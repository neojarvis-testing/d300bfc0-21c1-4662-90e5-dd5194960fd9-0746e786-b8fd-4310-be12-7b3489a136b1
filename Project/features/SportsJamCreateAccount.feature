@test6
Feature: Verifying SportsJam Create an account page.
  Scenario: Testing the account icon present in navigation bar in page
    When I hover on Account icon c.
    And I click on Login c.
    And I click on Create an account c.
    And I send value to FirstName field as "Something" c.
    And I send value to LastName fied as "Nothing" c.
    And I send value to email field as "Eample.12345@gmail.com" c.
    And I send value to password field as "Qwertasdf@#$7654" c.
    And I send value to confirm password field as "Qwertasdf@#$7654" c.
    And I click on create an account button c.
    And I verify the text Thank you for registering c.
    And I click on Logout button.
    And I navigate back to previous page.
    And I send value to login email field as "test134@gmail.com" in login page c.
    And I send value to login password field as "test140@ga" in login page c.
    Then I verify Error message c. 