@tag
Feature: Login Feature
  I want to use this template for my feature file
    
  @TS.Login.001.001
  Scenario Outline: Login with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method L1
    When Set valid API URL L1
    And Input valid data (Body) L1
    Then I receieve valid HTTP response 200 L1
    
  @TS.Login.001.002
  Scenario Outline: Login with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method L2
    When Set valid API URL L2
    And Input valid data (Body) L2
    Then I receieve valid HTTP response 405 L2
    
  @TS.Login.001.003
  Scenario Outline: Login with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method L3
    When Set invalid API URL L3
    And Input valid data (Body) L3
    Then I receieve valid HTTP response 404 L3
    
  @TS.Login.001.004
  Scenario Outline: Login with Valid HTTP Method, Valid API URL, and Blank data (Body) 
    Given Set valid method L4
    When Set valid API URL L4
    And Blank data (Body) L4
    Then I receieve valid HTTP response 400 L4
    
  @TS.Login.001.005
  Scenario Outline: Login with Valid HTTP Method, Valid API URL, and Invalid email in data (Body) 
    Given Set valid method L5
    When Set valid API URL L5
    And Input Invalid email in data (Body) L5 
    Then I receieve valid HTTP response 400 L5
    
  @TS.Login.001.006
  Scenario Outline: Login with Valid HTTP Method, Valid API URL, and Invalid password in data (Body) 
    Given Set valid method L6
    When Set valid API URL L6 
    And Input Invalid password in data (Body) L6
    Then I receieve valid HTTP response 400 L6

  @TS.Login.001.008
  Scenario Outline: Login with Valid HTTP Method, Valid API URL, and Blank Email in data (Body) 
    Given Set valid method L8
    When Set valid API URL L8
    And Blank Email in data (Body) L8 
    Then I receieve valid HTTP response 400 L8 

  @TS.Login.001.009
  Scenario Outline: Login with Valid HTTP Method, Valid API URL, and Blank Password in data (Body) 
    Given Set valid method L9
    When Set valid API URL L9
    And Blank Password in data (Body) L9
    Then I receieve valid HTTP response 400 L9
