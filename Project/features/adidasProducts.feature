@adidasProductsFilter
Feature: Checking functionality of filters in adidas products page.

    Scenario: User searches for Adidas and applies filters

        When I click on the search icon a
        And I verify the search bar is displayed a
        And I click on the search bar a
        And I enter input "ADIDAS" in the search bar a
        And I click the Go button a
        And I press Enter a
        And I verify the heading a
        Then I select the checkbox for Racket Sports a
        And I verify the label for Racket Sports a
        Then I select the checkbox for Shoes a
        And I verify the label for Shoes a
        Then I deselect the checkbox for Racket Sports a
        And I select the checkbox for Clothing a
        And I verify the label for Clothing a
        Then I select the checkbox for Accessories a
        And I verify the label for Accessories a
        Then I select the checkbox for Running a
        And I verify the label for Running a
        And I click the Clear All button a