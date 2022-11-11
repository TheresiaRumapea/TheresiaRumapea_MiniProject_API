@tag
Feature: Assign Product Rating Feature
  I want to use this template for my feature file
    
  @TS.AssignProductRating.011.001
  Scenario Outline: Assign Product Rating with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method APR1
    When Set valid API URL APR1
    And Input Bearer Token in tab Authorization APR1
    And Input valid data (Body) APR1
    Then I receieve valid HTTP response 200 APR1
    And Verify property ID is 15 APR1
    
    
  @TS.AssignProductRating.011.002
  Scenario Outline: Assign Product Rating with Invalid HTTP Method, valid API URL, and valid data (Body)   
    Given Set invalid method APR2
    When Set valid API URL APR2
    And Input Bearer Token in tab Authorization APR2
    And Input valid data (Body) APR2
    Then I receieve valid HTTP response 405 APR2
    
  @TS.AssignProductRating.011.003
  Scenario Outline: Assign Product Rating with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method APR3
    When Set invalid API URL APR3
    And Input Bearer Token in tab Authorization APR3
    And Input valid data (Body) APR3
    Then I receieve valid HTTP response 404 APR3  

  @TS.AssignProductRating.011.004
  Scenario Outline: Assign Product Rating with Valid HTTP Method, Valid API URL, and Blank data (Body) 
    Given Set valid method APR4
    When Set valid API URL APR4
    And Input Bearer Token in tab Authorization APR4
    And Blank data (Body) APR4
    Then I receieve valid HTTP response 200 APR4    
    And Verify property ID is 15 APR4