@tag
Feature: Test Create posts
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Create a Post with valid values
    Given Header values for the api
    
    When I Create a post with title "<title>" and body "<body>"
    Then  Post should be created successfully

 

    Examples: 
      | title| body |
      | Create A New POST |  This is body of a new post|
      | Create another POST |  This is body of another new post|
