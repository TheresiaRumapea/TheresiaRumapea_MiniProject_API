@tag
Feature: Product Ratings Feature
  I want to use this template for my feature file

  @TS.ProductRatings.012.001
  Scenario Outline: Get Products Ratings with Valid HTTP Method and API URL
    Given Set valid method PR1
    When Set valid API URL PR1
    Then I receieve valid HTTP response 200 PR1
    And Verify Property data is 4 PR1
    
  @TS.ProductRatings.012.002
  Scenario Outline: Get Products Ratings with Valid HTTP Method and Invalid API URL
    Given Set valid method PR2
    When Set invalid API URL PR2
    Then I receieve valid HTTP response 404 PR2
    
  @TS.ProductRatings.012.003
  Scenario Outline: Get Products Ratings with Invalid HTTP Method and valid API URL
    Given Set invalid method PR3
    When Set valid API URL PR3
    Then I receieve valid HTTP response 405 PR3