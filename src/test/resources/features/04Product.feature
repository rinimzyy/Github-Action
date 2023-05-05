Feature: Product

  Scenario: WB012 - Successfully select category
    Given I am already the web page
    When I click on the transaction button in the navigation menu
    And I select the sort by category from the dropdown menu
    Then I should be taken to a page displaying all the available clothing items for sale

  Scenario: WB013 - Successfully clear category
    Given I am already web page
    When I click select category
    And I choose category
    And I click on the clear button next to the category dropdown menu
    Then I should be taken back to the homepage of the website

  Scenario: WB0014 - Successfully view category by selecting desired category
    Given I am already login to web page
    When I choose a product
    And I click beli button
    And I click cart button
    Then I successfully add product to cart

  Scenario: WB0015 - Successfully view product detail
    Given I am already login in web page
    When I choose product
    And I click detail button
    Then I successfully view product detail

  Scenario: WB0016 - Successfully give rating to product
    Given I am already login into web page
    When I choose the product
    And I click the detail button
    And I click 5 star
    Then I successfully give rating to product

  Scenario: WB0017 - Successfully view category by selecting desired category withot login
    Given I am already in web page
    When I choose 1 product
    And I click the beli button
    And I click the cart button
    Then I successfully add product to cart without login

  Scenario: WB0018 - Successfully view product detail withot login
    Given I am already in the web page
    When I choose some product
    And I click a detail button
    Then I successfully view product detail without login

  Scenario: WB0019 - Successfully give rating to product without login
    Given I am already go to web page
    When I choose 1 or more product
    And I click detail buttonn
    And I click 5 stars
    Then I successfully give rating to product without login