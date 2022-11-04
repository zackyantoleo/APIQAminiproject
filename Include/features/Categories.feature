@tag
Feature: Categories
 
  Scenario: Create Category with valid data
    Given Set POST HTTP method and Categories endpoint
    When Set Categories payload with valid data
    And Send POST HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Create Category without name
    Given Set POST HTTP method and Categories endpoint
    When Set Categories payload without name
    And Send POST HTTP request
    Then Receive HTTP response code 500
    
    Scenario: Get All Category
    Given Set GET HTTP method and Categories endpoint
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get All Category with invalid enpoint
    Given Set GET HTTP method and invalid Categories endpoint
    And Send GET HTTP request
    Then Receive HTTP response code 404
    
    Scenario: Get Category by ID
    Given Set GET HTTP method and Categories endpoint with ID
    And Send GET HTTP request
    Then Receive HTTP response code 200
    
    Scenario: Get Category with invalid ID
    Given Set GET HTTP method and Categories endpoint with invalid ID
    And Send GET HTTP request
    Then Receive HTTP response code 500