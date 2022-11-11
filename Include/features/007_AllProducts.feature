@tag
Feature: All Products Feature
  I want to use this template for my feature file

  @TS.AllProducts.007.001
  Scenario Outline: Get All Products with Valid HTTP Method and API URL
    Given Set valid method AP1
    When Set valid API URL AP1
    Then I receieve valid HTTP response 200 AP1
    
  @TS.AllProducts.007.002
  Scenario Outline: Get All Products with Valid HTTP Method and Invalid API URL
  	Given Set valid method AP2
    When Set invalid API URL AP2
    Then I receieve valid HTTP response 404 AP2

  @TS.AllProducts.007.003
  Scenario Outline: Get All Products with Invalid HTTP Method and valid API URL
  	Given Set invalid method AP3
    When Set valid API URL AP3
    Then I receieve valid HTTP response 405 AP2
 
 
  