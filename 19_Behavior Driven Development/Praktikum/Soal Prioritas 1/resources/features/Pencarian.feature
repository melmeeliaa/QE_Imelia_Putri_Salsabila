Feature: Search
  As a user
  I want to do a search for my friend's account
  So that I can find my friend's account

  Scenario: As user I managed to find my friend's account
    Given I am on the home page now
    When click field search
    And type in the account name
    Then click enter
    And select an account name