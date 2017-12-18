@tag
Feature: Test Facebook Smoke Scenario
  I want to use this template for my feature file

  @tag1
  Scenario: Test Login with Valid Credential
    Given Open Chrome and start	application
    When I enter valid "username" and valid "password"
    Then user should be able to login successfully

  @tag2
  Scenario Outline: Test Login with Valid Credential
    Given Open Chrome and start	application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully

    Examples: 
      | username  | password |
      | username1 |        5 |
      | username2 |        7 |
