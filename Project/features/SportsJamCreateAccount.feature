@test6
Feature: Verifying SportsJam Create an account page.
  Scenario: Testing the account icon present in navigation bar in page
    When I hover on Account icon c.
    And I click on Login c.
    And I click on Create an account c.
    And I send value to FirstName field as "<FirstName>" c.
    And I send value to LastName fied as "<LastName>" c.
    And I send value to email field as "<Email>" c.
    And I send value to password field as "<Password>" c.
    And I send value to confirm password field as "<ConfPassword>" c.
    And I click on create an account button c.
    And I verify the text Thank you for registering c.
    And I click on Logout button.
    And I navigate back to previous page.
    And I send value to login email field as "<LoginEmail>" in login page c.
    And I send value to login password field as "<LoginPassword>" in login page c.
    Then I verify Error message c. 
    Examples:
    |FirstName|LastName|              Email       |    Password    |  ConfPassword  |    LoginEmail   |LoginPassword|
    |  Hellow |  World |Example1asdfg234@gmail.com|Qwertasdf@#$7654|Qwertasdf@#$7654|test134@gmail.com| test140@ga  |