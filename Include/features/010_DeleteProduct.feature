@tag
Feature: Delete Product Feature
  I want to use this template for my feature file

  @TS.DeleteProduct.010.001
  Scenario Outline: Delete Product with Valid HTTP Method and API URL
    Given Set valid method DP1
    When Set valid API URL DP1
    Then I receieve valid HTTP response 200 DP1
    And Verify Data Response is null
    
  @TS.DeleteProduct.010.002
  Scenario Outline: Delete Product with Valid HTTP Method and Invalid API URL
    Given Set valid method DP2
    When Set invalid API URL DP2
    Then I receieve valid HTTP response 400 DP2
    
  @TS.DeleteProduct.010.003
  Scenario Outline: Delete Product with Invalid HTTP Method and valid API URL
    Given Set invalid method DP3
    When Set valid API URL DP3
    Then I receieve valid HTTP response 405 DP3