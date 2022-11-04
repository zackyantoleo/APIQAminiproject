@tag
Feature: User Information
 
  Scenario: Get user information with token
    Given Set GET HTTP method and get user endpoint
    When Set token to authorization header
    And  Send GET HTTP request
    Then Receive valid Get user information HTTP response code 200
    
    Scenario: Get user information without token
    Given Set GET HTTP method and get user endpoint
    And Send GET HTTP request
    Then Receive invalid Get user information HTTP response code 401
    