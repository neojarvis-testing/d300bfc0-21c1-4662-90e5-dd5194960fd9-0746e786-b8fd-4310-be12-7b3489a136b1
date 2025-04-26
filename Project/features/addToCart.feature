@addProductsToCart
Feature: Checking functionality for adding products to cart and delivery at the ZIP Code

    Scenario: Browsing and adding products to the cart according to the ZIP Code

        When I hover on the Racket Sports a
        And I click on Badminton Rackets a
        And I verify Badminton Rackets a
        And I click on the first product a
        And I verify the product page a
        And I verify the Add to Cart button a
        And I click on the Increase Quantity button a
        Then I click on the Add to Cart button a
        And I verify confirmation message in the pop-up a
        And I click on the Check button a
        And I verify ZIP Code error a
        And I click on the ZIP Code input box a
        And I enter the ZIP Code "641001" a
        And I click on the Check button a 2nd time
        And I hover on Racket Sports a
        And I click on Badminton Shoes a
        And I verify Badminton Shoes listed a
        And I click on the first product in the page a
        And I click on size five a
        And I click on the Add to Cart button on the page a
        And I verify an error message a
        And I click on size ten a
        And I click on the Add to Cart button on the page a 2nd time