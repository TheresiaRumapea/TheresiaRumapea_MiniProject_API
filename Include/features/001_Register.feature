@tag
Feature: Register Feature
    
  @TS.Register.001.001
  Scenario Outline: Register with Valid HTTP Method, API URL, and data (Body)  
    Given Set valid method R1
    When Set valid API URL R1
    And Input valid data (Body) R1
    Then I receieve valid HTTP response 200 R1
    
  @TS.Register.001.002
  Scenario Outline: Register with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method R2
    When Set valid API URL R2
    And Input valid data (Body) R2 
    Then I receieve valid HTTP response 405 R2
    
  @TS.Register.001.003
  Scenario Outline: Register with valid HTTP Method, Invalid API URL, and valid data (Body)  
    Given Set valid method R3
    When Set invalid API URL R3
    And Input valid data (Body) R3
    Then I receieve valid HTTP response 404 R3

  @TS.Register.001.004
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Blank data (Body) 
    Given Set valid method R4
    When Set valid API URL R4
    And Blank data (Body) R4
    Then I receieve valid HTTP response 400 R4

  @TS.Register.001.006
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Email have been registered in data (Body) 
    Given Set valid method R6
    When Set valid API URL R6
    And Input Email have been registered in data (Body) R6
    Then I receieve valid HTTP response 400 R6
 
  @TS.Register.001.007
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Invalid password in data (Body)  
    Given Set valid method R7
    When Set valid API URL R7
    And Invalid password in data (Body) R7  
    Then I receieve valid HTTP response 400 R7 
    
  @TS.Register.001.008
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Invalid email and password in data (Body) 
    Given Set valid method R8
    When Set valid API URL R8
    And Input invalid email and password in data (Body) R8
    Then I receieve valid HTTP response 400 R8
    
 
  @TS.Register.001.009
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Blank Email in data (Body)  
    Given Set valid method R9
    When Set valid API URL R9
    And Blank Email in data (Body) R9 
    Then I receieve valid HTTP response 400 R9
    
  @TS.Register.001.010
  Scenario Outline: Register with Valid HTTP Method, Valid API URL, and Blank Password in data (Body)  
    Given Set valid method R10 
    When Set valid API URL R10
    And Blank Password in data (Body) R10
    Then I receieve valid HTTP response 400 R10 





 
    
  


    
    
    
  
    
    
  
  