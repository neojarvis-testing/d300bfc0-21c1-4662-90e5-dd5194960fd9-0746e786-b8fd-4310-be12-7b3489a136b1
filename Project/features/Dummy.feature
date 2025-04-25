Feature: Shop Sports Wear Page

    Scenario: Verify comparison functionality and message
        When I hover on Racket Sports
        And I click on Shop Sportswear
        And I verify the URL for Clothing
        And I click on List View
        And I click on Compare for the first product
        And I verify that the first product was added to the comparison list
        And I click on Compare for the second product
        And I verify the second product was added
        And I click on the Compare Product List
        And I verify the products being compared
        And I click on the Remove button for the first product
        And I confirm the removal of the first product
        And I verify the removal of the first product
        And I click on the Remove button for the second product
        And I confirm the removal of the second product
        And I verify the removal of the second product
        Then I verify the final message