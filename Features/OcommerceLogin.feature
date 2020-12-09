Feature: Login to OsCommerce

Scenario Outline: valid User Login

Given I am on OsCommerce homepage
When I click on log yourself in link
And I enter valid "<email>" 
And I enter correct "<password>"
Then I click on Sign in button
And I am on my OsCommerce page

Examples:

|email|password|
|nabila87bd@yahoo.com|12345|