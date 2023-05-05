Feature: Register

#  Scenario: WB001 - Successfully register by entering name, valid email, and password
#    Given I am on the register page
#    When I enter valid user name
#    And I enter user email
#    And I enter user password
#    And I click register button
#    Then I successfully register

  Scenario: WB002 - Failed to register because field to fill is empty
    Given I am go to register page
    When Username is empty
    And Email is empty
    And Password is empty
    And I click the register button
    Then I fail register

  Scenario: WB003 - Failed to register because email was already registered
    Given I am go into register page
    When I entering valid user name
    And I entering user email
    And I entering user password
    And I clicking the register button
    Then I failed register