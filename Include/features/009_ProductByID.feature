@tag
Feature: Product By ID Feature
  I want to use this template for my feature file

  @TS.ProductByID.009.001
  Scenario Outline: Get Product By ID with Valid HTTP Method and API URL
    Given Set valid method PID1
    When Set valid API URL PID1
    Then I receieve valid HTTP response 200 PID1
    And Verify Property ID 56 PID1
    
  @TS.ProductByID.009.002
  Scenario Outline: Get Product By ID with Valid HTTP Method and Invalid API URL
    Given Set valid method PID2
    When Set invalid API URL PID2
    Then I receieve valid HTTP response 400 PID2
    
  @TS.ProductByID.009.003
  Scenario Outline: Get Product By ID with Invalid HTTP Method and valid API URL
    Given Set invalid method PID3
    When Set valid API URL PID3
    Then I receieve valid HTTP response 405 PID3