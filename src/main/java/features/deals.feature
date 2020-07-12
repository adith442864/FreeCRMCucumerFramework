Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
	| adithbalaji	| Test@123	|

Then user clicks on login button
Then user is on home page
Then user moves to new deal page

Then user enters deal details
	| deal1 | 2000 | 60 | 20 |
	| deal2 | 3000 | 60 | 30 |
	| deal3 | 4000 | 70 | 40 |
	| deal4 | 5000 | 80 | 50 |
	
Then Close the browser
