Feature: Login
  Scenario: Login with valid username and password
    Given user is on login page
    When user input username with "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user is on homepage