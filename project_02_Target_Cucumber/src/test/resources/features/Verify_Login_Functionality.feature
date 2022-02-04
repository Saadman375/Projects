@Smoke
Feature: Login Functionality
As a user
I want to login in target
So that I can see my homepage

#Test Case
Scenario: Verify Login Functionality

#Test Step
Given I am in target website
When I click downwards arrow sign for schrolling Sign in option down
Then I click on Sign in option
And I can see target login page
Then I enter my login email and password
And I click on login button