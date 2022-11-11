@tag
Feature: Create Category Feature

  @TS.CreateCategory.004.001
  Scenario Outline: Create Category with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method CC1
    When Set valid API URL CC1
    And Input valid data (Body) CC1
    Then I receieve valid HTTP response 200 CC1
    And Verify Property Name 'gamingo' CC1
		And Verify Property Description 'foro gaming purposes' CC1

  @TS.CreateCategory.004.002
  Scenario Outline: Create Category with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method CC2
    When Set valid API URL CC2
    And Input valid data (Body) CC2
    Then I receieve valid HTTP response 405 CC2	
    
  @TS.CreateCategory.004.003
  Scenario Outline: Create Category with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method CC3
    When Set invalid API URL CC3
    And Input valid data (Body) CC3
    Then I receieve valid HTTP response 404 CC3	  
    
  @TS.CreateCategory.004.004
  Scenario Outline: Create Category with Valid HTTP Method, Valid API URL, and Blank data (Body) 
    Given Set valid method CC4
    When Set valid API URL CC4
    And Blank data (Body) CC4
    Then I receieve valid HTTP response 400 CC4 
    And Verify Error 'EOF' CC4
    
  @TS.CreateCategory.004.005
  Scenario Outline: Create Category with Valid HTTP Method, Valid API URL, and Invalid name in data (Body) 
    Given Set valid method CC5
    When Set valid API URL CC5
    And Input invalid name in data (Body)  CC5
    Then I receieve valid HTTP response 400 CC5	
     
  @TS.CreateCategory.004.006
  Scenario Outline: Create Category with Valid HTTP Method, Valid API URL, and Invalid description in data (Body) 
    Given Set valid method CC6
    When Set valid API URL CC6
    And Input invalid description in data (Body) CC6
    Then I receieve valid HTTP response 400 CC6	
    
    
  @TS.CreateCategory.004.007
  Scenario Outline: Create Category with Valid HTTP Method, Valid API URL, and Invalid name and description in data (Body) 
    Given Set valid method CC7
    When Set valid API URL CC7
    And Input invalid name and description in data (Body) CC7
    Then I receieve valid HTTP response 400 CC7	
    
    
  @TS.CreateCategory.004.009
  Scenario Outline: Create Category with Valid HTTP Method, Valid API URL, and Blank Description in data (Body) 
    Given Set valid method CC9
    When Set valid API URL CC9
    And Blank Description in data (Body)  CC9
    Then I receieve valid HTTP response 200 CC9	
    And Verify Property Name 'gamingo' CC9
     


    
    
    