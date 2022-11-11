@tag
Feature: Product Comments Feature
  I want to use this template for my feature file

  @TS.ProductComments.014.001
  Scenario Outline: 
    Given Set valid method PC1
    When Set valid API URL PC1
    Then I receieve valid HTTP response 200 PC1
    
  @TS.ProductComments.014.002
  Scenario Outline:
    Given Set valid method PC2
    When Set invalid API URL PC2
    Then I receieve valid HTTP response 404 PC2
    
  @TS.ProductComments.014.003
  Scenario Outline: 
    Given Set invalid method PC3
    When Set valid API URL PC3
    Then I receieve valid HTTP response 405 PC3