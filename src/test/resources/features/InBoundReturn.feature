Feature: InBoundReturn scenario check 

Background: 
	Given user is on application home page 
	When  user click on InBoundReturn 
	
	
Scenario: IR001 
	And  user enter process startdate as "10/23/2008" 
	And user enter RBamount as "20.00" and "5000.00" 
	And user click on Cashlettrs 
	Then verify "100" items are displyed on screen 
	And  user log out of application 
	
Scenario: IR002 
	And  user enter process startdate as "10/23/2008" 
	And user enter RBamount as "002000" and "00500000" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	And  user log out of application 
	
Scenario Outline: IR006 to IR0036 
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