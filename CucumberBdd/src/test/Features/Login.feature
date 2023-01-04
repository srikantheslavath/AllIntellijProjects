
Feature: Login Functionality

  Scenario Outline: Verification of login Functionality

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the homepage
    Examples:
      |username|password|
      |srikantheslavath|Innovapath|
    |Sri1997         |Innovapath123|
@smoke
    Scenario: tags
      Given
      When
      And

  @Regression
Scenario:regession test
    Given
    When
    And


