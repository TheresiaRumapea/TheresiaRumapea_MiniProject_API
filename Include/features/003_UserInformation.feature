@tag
Feature: User Information Feature
  I want to use this template for my feature file
    
  @TS.UserInformation.001.001
  Scenario Outline: Get User Information with Valid HTTP Method and API URL 
    Given Set valid method U1
    When Set valid API URL U1
    And Input Bearer Token in tab Authorization U1
    Then I receieve valid HTTP response 200 U1
    
  @TS.UserInformation.001.002
  Scenario Outline: Get User Information with Invalid HTTP Method and valid API URL
    Given Set invalid method U2
    When Set valid API URL U2
    And Input Bearer Token in tab Authorization U2
    Then I receieve valid HTTP response 405 U2
    
  @TS.UserInformation.001.003
  Scenario Outline: Get User Information with Valid HTTP Method and Invalid API URL
    Given Set valid method U3
    When Set invalid API URL U3
    And Input Bearer Token in tab Authorization U3
    Then I receieve valid HTTP response 404 U3
   
