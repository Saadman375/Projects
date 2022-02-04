#@Smoke
Feature: Perform Amazon Steps and Verify
As a User
I want to perform some steps and complete validation
So that I can observe webpage functionality

Scenario: 
Given I am in Amazon webpage
When I click on search box for finding a product named "Blenders"
Then I choose one item and click over 
And I tried to add the item in cart 
Then I click the cart for seeing the added product
And I verify the cart have added only one item
Then I remove the item from cart 