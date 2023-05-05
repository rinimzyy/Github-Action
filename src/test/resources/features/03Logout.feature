Feature: Logout

  Scenario: WB0011 - Successfully logout
    Given I am already login
    When I click user button
    And I click logout button
    Then I successfully logout