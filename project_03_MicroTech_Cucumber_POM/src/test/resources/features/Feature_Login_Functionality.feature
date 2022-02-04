#Author: Saadman Chowdhury
#User Story: MNA-7 Login Functionality

Feature: Login fuctionality
  As a user
  I want to login in Microtech
  So that I can see the homepage

  Scenario: Verify Login Functionality 
    Given I am in landing page
    When I click on Login Menu
    Then verify I am in Employee Login Page
    And I enter Login Id
    And I enter Password
    And Click on Login Button
    Then I will be in my Home page