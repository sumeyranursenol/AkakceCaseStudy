Feature: Test Automation
  Scenario: User logs in, searches for products and adds them to the watch list
    Given User opens akakce.com site
    And User Logs in
    When User searches for "iphone" product
    And User selects product
    Then User adds the product to the watch list