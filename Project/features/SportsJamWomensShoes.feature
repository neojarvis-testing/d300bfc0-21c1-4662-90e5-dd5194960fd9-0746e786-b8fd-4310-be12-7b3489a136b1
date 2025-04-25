@test1
Feature: Testing WOmen Sports Shoes page of SportsJam
	Scenario: womens shoes page test
	    When I verify the homepage URL
	    And I click on the brand section.
	    Then I verify the brand's page URL
	    When I click on the search bar
	    And I send data to the search bar
	    And I click on the search icon
	    Then I verify that the search results include Puma
	    And I click on the Puma brand
	    Then I verify the Puma page URL
	    And I click on Accessories
	    Then I verify Accessories text is shown in the filter
	    When I hover over Puma Women Sport Quarters Assorted element
	    And I click on the Quick View button
	    And I switch to the iframe for Quick View
	    When I click on the Wish List button
	    Then I verify the displayed login prompt message
	    Then I input data into the email field
	    And I input data into the password field
	    And I click on the Sign In button
	    Then I verify the error message is displayed