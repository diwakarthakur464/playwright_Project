Feature: Login
  As a user of the Sauce Demo application
  I want to log in with valid credentials
  So that I can access the inventory dashboard

  Scenario: Successful login with valid credentials
    Given the user opens the login page
    When the user enters valid credentials
    Then the user should land on the dashboard
