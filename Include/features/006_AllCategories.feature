@tag
Feature: Get All Categories Feature
  I want to use this template for my feature file

  @TS.AllCategories.006.001
  Scenario Outline: Get All Categories with Valid HTTP Method and API URL
    Given Set valid method AC1
    When Set valid API URL AC1
    Then I receieve valid HTTP response 200 AC1
    
  @TS.CategoryByID.006.002
  Scenario Outline: Get All Categories with Valid HTTP Method and Invalid API URL
    Given Set valid method AC2
    When Set invalid API URL AC2
    Then I receieve valid HTTP response 404 AC2
    
  @TS.CategoryByID.006.003
  Scenario Outline: Get All Categories with Invalid HTTP Method and valid API URL
    Given Set invalid method AC3
    When Set valid API URL AC3
    Then I receieve valid HTTP response 405 AC3
    

    
    