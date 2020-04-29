Feature: Sign up page and Home page functionality
  As a User
  I want to visit lets kode it website

  Scenario: Verify user should navigate to Sign up page
    Given I am on home page
    When I click on Sign Up button
    Then I should be on Sign Up page successfully

  Scenario: Verify user should navigate to Home page
    Given I am on Sign Up page
    When I click on Lets kode it Logo
    Then I should be on Home Page successfully