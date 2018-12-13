Feature: Check the Banking websites

  Scenario: Barclays Banking websites
    Given I am a Chrome User
    When I open Barclays Web Site
    Then Barclays home page display
    And I see Login button
    And I see Register button
    And I see ContactUs button

  Scenario: Santander Banking website
    Given I am a Chrome User
    When I open Santander Web Site
    Then Santander home page display
    And I see Santander Login button

