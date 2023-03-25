Feature: Dark Mode
  As a user
  I want to change my linkedin view to dark mode
  So that my linkedin view to dark mode

  Scenario: As user I managed to change my linkedin view to dark mode
    Given I am on the home page.
    When click my profile icon.
    And click settings and privacy
    Then click the arrow on the display
    And select dark mode