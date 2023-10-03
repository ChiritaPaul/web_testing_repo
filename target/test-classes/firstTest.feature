Feature: Web login
  @Paul
  Scenario: User should be able to login with valid credentials
    Given the user is on "Facebook" page
    When the user enters valid credentials
    And hits submit
    Then user is logged into his account