Feature: Login

  Scenario: WB006 - Successfully login by entering valid email and password
    Given I am on the login page
    When I enter valid email
    And I enter password
    And I click login button
    Then I successfully login

  Scenario: WB007 - Fail to login because email and password field is empty
    Given I am on login page
    When I not enter valid email
    And I not enter password
    And I click the login button
    Then I fail to login

  Scenario: WB008 - Fail to login because email field is empty
    Given I am on login web page
    When Email field is empty
    And I enter valid password
    And I clicking the login button
    Then I failed to login

  Scenario: WB009 - Fail to login because password field is empty
    Given I am on the login web page
    When I filling email field
    And Password field is empty
    And I tap the login button
    Then The login is failed

  Scenario: WB0010 - Fail to login because entering invalid email
    Given On the login web page
    When I filling email field with invalid email
    And I filling password field
    And I tap login button
    Then The login is fail