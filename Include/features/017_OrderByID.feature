@tag
Feature: Order By ID Feature
  I want to use this template for my feature file

  @TS.OrderByID.017.001
  Scenario Outline: Get Order By ID with Valid HTTP Method and API URL
    Given Set valid method OBI1
    When Set valid API URL OBI1
    And Input Bearer Token in tab Authorization OBI1
    Then I receieve valid HTTP response 200 OBI1
    And Verify Property ID is 1 OBI1
    
  @TS.OrderByID.017.002
  Scenario Outline: Get Order By ID with Valid HTTP Method and Invalid API URL
    Given Set valid method OBI2
    When Set invalid API URL OBI2
    And Input Bearer Token in tab Authorization OBI2
    Then I receieve valid HTTP response 404 OBI2

  @TS.OrderByID.017.003
  Scenario Outline: Get Order By ID with Invalid HTTP Method and valid API URL
    Given Set invalid method OBI3
    When Set valid API URL OBI3
    And Input Bearer Token in tab Authorization OBI3
    Then I receieve valid HTTP response 405 OBI3
    
  @TS.OrderByID.017.004
  Scenario Outline: Get Order By ID with Valid HTTP Method and API URL and Blank bearer token in Authorization
    Given Set invalid method OBI4
    When Set valid API URL OBI4
    And Blank Bearer Token in tab Authorization OBI4
    Then I receieve valid HTTP response 401 OBI4
    And Verify error is unauthorized OBI4