Feature: Page Functionality Test
  As a User I want to test Functionality of Page

@smoke, @regression
  Scenario: User Should verify The page Functionality
    Given   I am on HomePage
    When    I click on  Building And Material Page
    And     I click  on RoofFelt
    And     I Verify RoofFelt Text
    And     I select BlackShed
    And     I Verify IkoBlackShed Text
    And     I clear Quantity
    Then    I Add Quantity "3"

