Feature: User should be able to login correct credentials.

  Scenario: Positive Login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user should see the login button
    Then user should see url contains orders


  Scenario: Positive Login scenario
    Given user is on the login page of web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

