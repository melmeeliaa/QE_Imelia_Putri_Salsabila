Feature: pilihProduk
  As a user
  I want to choose a payment method
  So that I managed to pay for the product I bought

  Scenario: As user I managed to pay for the product I bought
    Given I'm on the payment method page
    When I choose a payment method
    And I click pay now
    Then I managed to make a payment