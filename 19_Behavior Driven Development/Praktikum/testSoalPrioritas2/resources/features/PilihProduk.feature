Feature: pilihProduk
  As a user
  I want to select a product
  So that I can proceed to payment

  Scenario: As user I have successfully selected a product
    Given I am on the product page
    When I select a product
    And I entered the phone number
    Then I chose nominal
    And I go to the payment page