Feature: Practice and Login Page Functionality
  As a
  User I want to visit lets kode it website

  Scenario: Verify user should navigate to practice page
    Given I am on home page
    When I click on practice element
    Then I should be in practice page successfully

  Scenario: Verify user should navigate to login page
    Given I am on home page
    When I click on login element
    Then I should be in login page successfully