@demo
Feature: Demo - loading Google home page
    As a user
    I want to load Google home page

  Background: user should be on dsi home page
    Given user has launched a browser

  Scenario: Login with correct username and password
    When user wants to load Google home page
    Then the Google home page should be loaded
   
    
