@test3
Feature: Shop Sports Wear Page

    Scenario: Verify comparison functionality and message
        When I hover on Racket Sports d.
        And I click on Shop Sportswear d.
        And I verify the URL for Clothing d.
        And I click on List View d.
        And I click on Compare for the first product d.
        And I verify that the first product was added to the comparison list d.
        And I click on Compare for the second product d.
        And I verify the second product was added d.
        And I click on the Compare Product List d.
        And I verify the products being compared d.
        And I click on the Remove button for the first product d.
        And I confirm the removal of the first product d.
        And I verify the removal of the first product d.
        And I click on the Remove button for the second product d.
        And I confirm the removal of the second product d.
        And I verify the removal of the second product d.
        Then I verify the final message d.