Feature: Test Facebook Smoke Scenario
Scenario: Test login with valid crendentials
Given Open Firefox and start application
When I enter valid "username" and "password"
Then user  should be login success
