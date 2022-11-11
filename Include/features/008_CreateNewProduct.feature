@tag
Feature: Create New Product Feature

  @TS.CreateProduct.008.001
  Scenario Outline: Create New Product with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method CP1
    When Set valid API URL CP1
    And Input valid data (Body) CP1
    Then I receieve valid HTTP response 200 CP1
    And Verify Property Name 'Sony PS5' CP1
		And Verify Property Description 'play has no limits' CP1
	
  @TS.CreateProduct.008.002
  Scenario Outline: Create New Product with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method CP2
    When Set valid API URL CP2
    And Input valid data (Body) CP2
    Then I receieve valid HTTP response 405 CP2	

  @TS.CreateProduct.008.003
  Scenario Outline: Create New Product with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method CP3
    When Set invalid API URL CP3
    And Input valid data (Body) CP3
    Then I receieve valid HTTP response 404 CP3	 

  @TS.CreateProduct.008.004
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank data (Body) 
    Given Set valid method CP4
    When Set valid API URL CP4
    And Blank data (Body) CP4
    Then I receieve valid HTTP response 400 CP4 
    And Verify Error 'EOF' CP4
    
  @TS.CreateCategory.008.005
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid name in data (Body) 
  	Given Set valid method CP5
    When Set valid API URL CP5
    And Input invalid name in data (Body)  CP5
    Then I receieve valid HTTP response 400 CP5	
    
  @TS.CreateCategory.008.006
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid description in data (Body) 
    Given Set valid method CP6
    When Set valid API URL CP6
    And Input invalid description in data (Body) CP6
    Then I receieve valid HTTP response 400 CP6
 
  @TS.CreateCategory.004.007
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid price in data (Body) 
    Given Set valid method CP7
    When Set valid API URL CP7
    And Input invalid price in data (Body) CP7
    Then I receieve valid HTTP response 400 CP7	
    
  @TS.CreateCategory.004.008
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Invalid categories in data (Body) 
    Given Set valid method CP8
    When Set valid API URL CP8
    And Input invalid categories in data (Body) CP8
    Then I receieve valid HTTP response 400 CP8	
    
  @TS.CreateCategory.004.010
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank Description in data (Body)  
    Given Set valid method CP10
    When Set valid API URL CP10
    And  Blank Description in data (Body) C10
    Then I receieve valid HTTP response 200 C10
    And Verify Property Name 'Sony PS5' CP10
		And Verify Property Description is null CP10

  @TS.CreateCategory.004.012
  Scenario Outline: Create New Product with Valid HTTP Method, Valid API URL, and Blank Categories in data (Body) 
    Given Set valid method CP12
    When Set valid API URL CP12
    And  Blank Description in data (Body) CP12
    Then I receieve valid HTTP response 200 CP12
    And Verify Property Name 'Sony PS5' CP12
		And Verify Property Categories is null CP12	
		
		

 

		
		