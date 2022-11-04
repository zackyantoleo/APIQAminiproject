@tag
Feature: Register
 
  Scenario: Register new user with valid data
    Given Set POST HTTP method and register endpoint
    When Set new user payload with valid data
    And  Send POST HTTP request
    Then Receive valid Register HTTP response code 200
    
    Scenario: Register with empty password
    Given Set POST HTTP method and register endpoint
    When Set new user payload with empty password
    And Send POST HTTP request
    Then Receive invalid Register HTTP response code 400
    
    Scenario: Login with invalid payload format
    Given Set POST HTTP method and register endpoint
    When Set new user payload with invalid payload format
    And Send POST HTTP request    
    Then Receive invalid HTTP response code 400