@tag
Feature: Create Comment Feature
  I want to use this template for my feature file
    
  @TS.CreateComment.013.001
  Scenario Outline: Create Comment For Product with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method CCO1
    When Set valid API URL CCO1
    And Input Bearer Token in tab Authorization CCO1
    And Input valid data (Body) CCO1
    Then I receieve valid HTTP response 200 CCO1
    And Verify property content is 'the games are great including Gran Turismo 7 but sadly GT4 is much better' CCO1
    
  @TS.CreateComment.013.002
  Scenario Outline: Create Comment For Product with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method CCO2
    When Set valid API URL CCO2
    And Input Bearer Token in tab Authorization CCO2
    And Input valid data (Body) CCO2
    Then I receieve valid HTTP response 405 CCO2
    
  @TS.CreateComment.013.003
  Scenario Outline: Create Comment For Product with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method CCO3
    When Set invalid API URL CCO3
    And Input Bearer Token in tab Authorization CCO3
    And Input valid data (Body) CCO3
    Then I receieve valid HTTP response 404 CCO3  

  @TS.CreateComment.013.007
  Scenario Outline: Create Comment For Product with Valid HTTP Method, Valid API URL, Valid data (body) and Blank bearer token in Authorization 
    Given Set valid method CCO7
    When Set valid API URL CCO7
    And Input Bearer Token in tab Authorization CCO7
    And Blank data (Body) CCO7
    Then I receieve valid HTTP response 401 CCO7    
    And Verify error is unauthorized CCO7
    
    
    