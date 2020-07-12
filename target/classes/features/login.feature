Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "adithbalaji" and "Test@123"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser 

#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username 		| password |
	| adithbalaji  	| Test@123 |
#	|  tom     		| test456  | 	
