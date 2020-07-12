Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

Given user is already on Login Page 
When title of login page is Free CRM 
Then user enters username and password 
	| username		| password	|
	| adithbalaji	| Test@123	|
		
Then user clicks on login button 
Then user is on home page 
Then moves to new deal page 
Then user enters deal details 
	| title		 | amount | probability | commission |
	| deal2		 | 4000   |  40 		| 40 		 |
	| deal3	  	 | 5000   |  50    		| 50 		 |
	| deal4	 	 | 3000   |  70         | 30         |	
Then Close the browser 
