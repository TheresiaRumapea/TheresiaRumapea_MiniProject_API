@tag
Feature: Create Order Feature
  I want to use this template for my feature file
    
  @TS.CreateOrder.015.001
  Scenario Outline: Create A New Order with Valid HTTP Method, API URL, and data (Body) 
    Given Set valid method CO1
    When Set valid API URL CO1
    And Input Bearer Token in tab Authorization CO1
    And Input valid data (Body) CO1
    Then I receieve valid HTTP response 200 CO1
    And Verify property quantity is 1 CO1

  @TS.CreateOrder.015.002
  Scenario Outline: Create A New Order with Invalid HTTP Method, valid API URL, and valid data (Body) 
    Given Set invalid method CO2
    When Set valid API URL CO2
    And Input Bearer Token in tab Authorization CO2
    And Input valid data (Body) CO2
    Then I receieve valid HTTP response 405 CO2
    
  @TS.CreateOrder.015.003
  Scenario Outline: Create A New Order with valid HTTP Method, Invalid API URL, and valid data (Body) 
    Given Set valid method CO3
    When Set invalid API URL CO3
    And Input Bearer Token in tab Authorization CO3
    And Input valid data (Body) CO3
    Then I receieve valid HTTP response 404 CO3  

  @TS.CreateOrder.015.004
  Scenario Outline: Create A New Order with Valid HTTP Method, Valid API URL, and Blank data (Body) 
		Given Set valid method CO4
    When Set valid API URL CO4
    And Input Bearer Token in tab Authorization CO4
    And Blank data (Body) CO4
    Then I receieve valid HTTP response 400 CO4
    And Verify error is EOF CO4

	@TS.CreateOrder.015.005
  Scenario Outline: Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Product_id in data (Body) 
		Given Set valid method CO5
    When Set valid API URL CO5
    And Input Bearer Token in tab Authorization CO5
    And Input invalid product_id in data (Body) CO5
    Then I receieve valid HTTP response 400 CO5 

	@TS.CreateOrder.015.006
	Scenario Outline: Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Quantity in data (Body) 
		Given Set valid method CO6
    When Set valid API URL CO6
    And Input Bearer Token in tab Authorization CO6
    And Input invalid quantity in data (Body) CO6
    Then I receieve valid HTTP response 400 CO6

	@TS.CreateOrder.015.007
	Scenario Outline: Create A New Order with Valid HTTP Method, Valid API URL, and Invalid Product_id and Quantity in data (Body) 
		Given Set valid method CO7
    When Set valid API URL CO7
    And Input Bearer Token in tab Authorization CO7
    And Input invalid product_id and quantity in data (Body) CO7
    Then I receieve valid HTTP response 400 CO7

   