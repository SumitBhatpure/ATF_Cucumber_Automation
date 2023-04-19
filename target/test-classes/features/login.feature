Feature: ATF login check 

Scenario: valid login check 
	Given user is on ATF login Page 
	When user enter valid username as "manager" and password "P@ssw0rd" 
	Then user nevigate to home page 
	And  user log out of application 
	
Scenario Outline: invalid user check 
	Given user is on ATF login Page 
	When user enter Invalid username  <xyz> and password  <abc> 
	Then error msg occurs on login page 
	
	
	Examples: 
		|xyz|abc|
		|user|password|
		|username|user|