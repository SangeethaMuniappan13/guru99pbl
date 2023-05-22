Feature: Login Feature

Scenario: Login with valid data
Given launch the application
When I entered the username
And  I entered the password
And  I clicked on login button
Then I verified that the user loggedin successfully
