@tag
Feature: Order
 
  Scenario: Create New Order
    Given Set POST HTTP method and Order endpoint and token to authorization header
    When Set Order payload with valid data
    And Send POST HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Create New Order without Token
    Given Set POST HTTP method and Order endpoint
    When Set Order payload with valid data
    And Send POST HTTP request
    Then Receive HTTP response code 500
    
    Scenario: Get All Order
    Given Set GET HTTP method and Order endpoint and token to authorization header
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get All Order without Token
    Given Set GET HTTP method and Order endpoint
    And Send GET HTTP request
    Then Receive HTTP response code 404
    
    Scenario: Get Order by ID
    Given Set GET HTTP method and Order endpoint with ID
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get Order with invalid ID
    Given Set GET HTTP method and Order endpoint with invalid ID
    And Send GET HTTP request
    Then Receive HTTP response code 500