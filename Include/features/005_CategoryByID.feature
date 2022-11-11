@tag
Feature: Category By ID Feature
  I want to use this template for my feature file

  @TS.CategoryByID.005.001
  Scenario Outline: Get Category By ID with Valid HTTP Method and API URL
    Given Set valid method CID1
    When Set valid API URL CID1
    Then I receieve valid HTTP response 200 CID1
    And Verify Property ID 5 CID1
    
  @TS.CategoryByID.005.002
  Scenario Outline: Get Category By ID with Valid HTTP Method and Invalid API URL
    Given Set valid method CID2
    When Set invalid API URL CID2
    Then I receieve valid HTTP response 400 CID2
    
  @TS.CategoryByID.005.003
  Scenario Outline: Get Category By ID with Invalid HTTP Method and valid API URL
    Given Set invalid method CID3
    When Set valid API URL CID3
    Then I receieve valid HTTP response 405 CID3
    
    