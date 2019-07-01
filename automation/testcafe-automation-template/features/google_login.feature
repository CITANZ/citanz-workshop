@google
Feature: Login Google
    As a user
    I want to login the Google
    So that I can visit the Sign in page
    Background:
        Given user is on the login page
    
    Scenario:verify Google sign in page could be loaded
        When user wants to login
        Then user should be on sign in page