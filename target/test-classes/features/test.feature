Feature: test feature 

Background: 
	Given user is on application home page 
	When  user click on Outbond return Cashletters 
	
 
	 
	
	Scenario: OC0047 
	And  user enter process startdate as "093005" 
	And user click on Cashlettrs
	Then verify "No data in table for date 2005-09-30" items are displyed on screen
	And   user log out of application