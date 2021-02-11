Feature: Free CRM Feature

  Scenario: Free CRM Login Test scenario

    Given User is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    And user clicks on login button
    And user is on home page