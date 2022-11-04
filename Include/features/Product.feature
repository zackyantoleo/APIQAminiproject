@tag
Feature: Product
 
  Scenario: Create New Product
    Given Set POST HTTP method and Product endpoint and token to authorization header
    When Set Product payload with valid data
    And Send POST HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Delete Product
    Given Set DELETE HTTP method and Product endpoint
    When Set Product payload with valid data
    And Send DELETE HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get All Product
    Given Set GET HTTP method and Product endpoint and token to authorization header
    And Send GET HTTP request
    Then Receive HTTP response code 200   
    
    Scenario: Get Product by ID
    Given Set GET HTTP method and Product endpoint with ID
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get Product Rating
    Given Set GET HTTP method and Rating endpoint and token to authorization header
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Give Product Rating
    Given Set POST HTTP method and Rating endpoint and token to authorization header
    When Set Rating payload with valid data
    And Send POST HTTP request
    Then Receive HTTP response code 200