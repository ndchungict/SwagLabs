Feature: Sort

  Background:
    Given that Leo is browsing the login page
    When he login with authenticated account
    And he should see all products

  Scenario: Sort products by name A to Z
    When he select product sort by name A to Z
    Then the products will be sorted

  Scenario: Sort products by name Z to A
    When he select product sort by name Z to A
    Then the products will be sorted

  Scenario: Sort products by price low to high
    When he select product sort by price low to high
    Then the products will be sorted

  Scenario: Sort products by price high to low
    When he select product sort by price high to low
    Then the products will be sorted
