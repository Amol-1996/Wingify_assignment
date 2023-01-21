Feature: Verify login functionality
Verify the login functionality of Demo Application




@DemoTest
Scenario: verify that user is able to login in Demo application
Given user is on login page
When user enters usernmae and password
When user clicks on login button
When user click the AMOUNT header
Then transaction table values are sorted