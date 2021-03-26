Feature: Application Login

Scenario: Login to webpage

Given User is on landing page
When User enters username "hitaishee" and password "password@123"
Then Homepage should be displayed
And title should be displayed