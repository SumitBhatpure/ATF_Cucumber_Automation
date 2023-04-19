Feature: InReturn Cashletters scenario check 

Background: 
	Given user is on application home page 
	When  user click on InreturnCashletters 
	
	
Scenario: IC001 
	And user click on Cashlettrs 
	Then popup alert check "Process Date is required for all searches." 
	And  user log out of application 
	
Scenario: IC002 
	And user enter max result details as " " 
	And  user enter process startdate as "10/23/2008"
	And user click on Cashlettrs 
	Then verify "50" items are displyed on screen 
	And  user log out of application 
	
Scenario: IC003 
	And user enter max result details as "10" 
	And  user enter process startdate as "10/23/2008" 
	And user click on Cashlettrs 
	Then verify "10" items are displyed on screen 
	And  user log out of application 
	
Scenario: IC004 IC005 
	And user enter max result details as "50" 
	And  user enter process startdate as "10/23/2008" 
	And user click on Cashlettrs 
	Then verify "50" items are displyed on screen 
	And user nevigate to back page 
	And user enter amount as "500.00" and "" 
	And user click on Cashlettrs 
	Then verify "1" items are displyed on screen 
	And  user log out of application 
	
Scenario: IC0033 
	And user enter max result details as "50" 
	And  user enter process startdate as "10/23/2008" 
	And user click on Cashlettrs 
	Then verify "50" items are displyed on screen 
	And verify result list is scrollable 
	And  user log out of application 
	
Scenario: IC0034 
	And user enter max result details as "50" 
	And  user enter process startdate as "10/23/2008" 
	And user click on Cashlettrs 
	Then verify coloum heading should scroll with the items by pages
	And  user log out of application  

Scenario: IC0035 
	And user enter max result details as "50" 
	And  user enter process startdate as "10/23/2008" 
	And user click on Cashlettrs 	
#	Then Check the additional buttons available outside the result screen
	And  user log out of application 
	
#	Scenario: IC0036 
#	And user enter max result details as "200" 
#	And  user enter process startdate as "10/23/2008" 
#	And user click on Cashlettrs 	
#	Then verify selected item remain highlighted as user move from view to view
#	And  user log out of application 
	
Scenario: IC038 
	When user enter process date from "10/23/2008" to "10/24/2008" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	Then opertaor field changes to "range" 
	And  user log out of application 
	
Scenario Outline: IC006 to IC0036 
	When user enter startdate as <inputDate> 
	And user click on Cashlettrs 
	#	And user nevigate to back page 
	Then verify auto generated date formate as <Date> 
	And  user log out of application 
	
	Examples: 
		|inputDate|Date|
		|2008-10-23|2008-10-23| 
		|2008/10/23|2008-10-23|
		|2008.10.23|2008-10-23| 
		|2008 10 23|2008-10-23|
		|2008 Oct 23|2008-10-23|
		|10-23-2008|2008-10-23|
		|10.23.2008|2008-10-23|
		|10 23 2008|2008-10-23|
		|Oct 23 2008|2008-10-23|
		|10-23-08|2008-10-23|
		|10/23/08|2008-10-23|
		|10.23.08|2008-10-23|
		|Oct 23 08|2008-10-23|
		|10 23 2008|2008-10-23|
		|10 23 08|2008-10-23|
		|10-23-2008|2008-10-23|
		|10/23/2008|2008-10-23|
		|10.23.2008|2008-10-23|
		|10.23.2008|2008-10-23|
		|10 23 2008|2008-10-23|
		|10.23.08|2008-10-23|
		|Oct 23 08|2008-10-23|
		|Oct 23 08|2008-10-23|
		|10 23 2008|2008-10-23|
		|10 23 08|2008-10-23|
		|10-23-2008|2008-10-23|
		
	