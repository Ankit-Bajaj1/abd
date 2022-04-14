Feature: Amazon Website
Scenario: Verify Amazon best seller page

Given Launch Amazon website
When Verify that signIn button is displayed
And click on Menu Icon
And click on Best Sellers
Then Verify best sellers header

