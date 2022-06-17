@Regression @smoke
Feature: Library app login feature
  User Stroy:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin
Background: For the scenario in the feature file, user is expected to be on login page.
  @Librarian @employee @wip

  Scenario: Login as librarian
    Given user is one the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @Student

  Scenario: Login as student
    Given user is one the library login page
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    Given user is one the library login page
    When user enters admin username
    And user enter admin password
    Then user should see the dashboard
# this is how we add a comment in feature files.Feature:

