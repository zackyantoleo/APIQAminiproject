@tag
Feature: Login
 
  Scenario: Login user with valid data
    Given Set POST HTTP method and login endpoint
    When Set Login user with valid data
    And Send POST HTTP request
    Then Receive Token and valid Login HTTP response code 200
    
    Scenario: Login with empty password
    Given Set POST HTTP method and login endpoint
    When Set Login user with empty password
    And Send POST HTTP request
    Then Receive invalid HTTP Login response code 400
    
    Scenario: Login with invalid payload format
    Given Set POST HTTP method and login endpoint
    When Set Login user with invalid payload format
    And  Send POST HTTP request
    Then Receive invalid HTTP Login response code 400