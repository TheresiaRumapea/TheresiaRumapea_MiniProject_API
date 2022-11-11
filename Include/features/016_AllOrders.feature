@tag
Feature: All Orders Feature
  I want to use this template for my feature file

  @TS.AllOrders.016.001
  Scenario Outline: Get All Orders with Valid HTTP Method and API URL
    Given Set valid method AO1
    When Set valid API URL AO1
    And Input Bearer Token in tab Authorization AO1
    Then I receieve valid HTTP response 200 AO1
    
  @TS.AllOrders.016.002
  Scenario Outline: Get All Orders with Valid HTTP Method and Invalid API URL
    Given Set valid method AO2
    When Set invalid API URL AO2
    And Input Bearer Token in tab Authorization AO2
    Then I receieve valid HTTP response 404 AO2

  @TS.AllOrders.016.003
  Scenario Outline: Get All Orders with Invalid HTTP Method and valid API URL
    Given Set invalid method AO3
    When Set valid API URL AO3
    And Input Bearer Token in tab Authorization AO3
    Then I receieve valid HTTP response 405 AO3
    
  @TS.AllOrders.016.004
  Scenario Outline: Get All Orders with Valid HTTP Method and API URL and Blank bearer token in Authorization
    Given Set invalid method AO4
    When Set valid API URL AO4
    And Blank Bearer Token in tab Authorization AO4
    Then I receieve valid HTTP response 401 AO4
    And Verify error is unauthorized AO4