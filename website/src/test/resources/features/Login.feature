Feature: Login SwabLabs Website
  As a customer
  I want to buy some clothes
  So that I need to log into my account

  Scenario: Login successfully
    Given that Leo is browsing the login page
    When he login with authenticated account
    Then the shopping cart will be displayed