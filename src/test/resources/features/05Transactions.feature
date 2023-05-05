Feature: Transactions

  Scenario: WB0020 - Successfully pay the order
    Given I am already login to web alta
    When I add some product to cart
    And I go to user cart
    And I checking the product before paying
    And I click bayar button
    Then I successfully pay the product

  Scenario: WB0021 - Failed pay the order without login
    Given I am on web alta
    When I add some of product to cart
    And I go to the user cart
    And I checking product before paying
    And I click the bayar button
    Then I failed pay the product and redirected to login page

  Scenario: WB0022 - Successfully view user transaction
    Given I am already login in web alta
    When I do a transaction
    Then I can see user transactions history

  Scenario: WB0023 - Successfully view user transaction in ascending order
    Given I am already login in the web alta
    When I do a product transaction
    And I can see transactions history
    And I click ascending button
    Then I can see view user transaction in ascending order

  Scenario: WB0024 - Successfully view user transaction in descending order
    Given I am already login into web alta
    When I do some transaction
    And I can view transactions history
    And I click descending button
    Then I can see view user transaction in descending order

  Scenario: WB0025 - Successfully set the number of transaction history per page
    Given I am already login the web alta
    When I do transaction
    And I can view the transactions history
    And I choose sort by transaction
    And I set the number of items per page
    Then I should see the history transaction items on the page