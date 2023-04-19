Feature: Outbond return Cashletters 

Background: 
	Given user is on application home page 
	When  user click on Outbond return Cashletters 
	
Scenario: OC001 
	And  user click on searchAll button 
	Then verify popup alert message as "Process Date is required for all searches." 
	And  user log out of application 
	
Scenario: OC002 
	And user enter max result details as " " 
	And user enter process startdate as "022306" 
	And user click on Cashlettrs 
	Then verify "2" items are displyed on screen 
	And  user log out of application 
	
Scenario: OC003 
	And user enter max result details as "10" 
	And  user enter process startdate as "022306" 
	And user click on Cashlettrs 
	Then verify "2" items are displyed on screen 
	And  user log out of application 
	
Scenario: OC004 
	And user enter max result details as "200" 
	And  user enter process startdate as "022306" 
	And user click on Cashlettrs 
	Then verify "2" items are displyed on screen 
	And  user log out of application 
	
Scenario: OC005 
	And user enter max result details as "200" 
	And  user enter process startdate as "022306" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	And user enter OB Amount as "1436696.06" and "" 
	And user click on Cashlettrs 
	Then verify "1" items are displyed on screen 
	And  user log out of application 
	
	
Scenario Outline: OC006 to IC0036 
	When  user enter startdate as <inputDate> 
	And  user click on Cashlettrs 
	#	And user nevigate to back page 
	Then  verify auto generated date formate as <Date> 
	And   user log out of application 
	
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
		|Oct 23 2008|2008-10-23|
		|10-23-08|2008-10-23|
		|10/23/08|2008-10-23|
		
		
		
Scenario: OC039 
	And  user enter process startdate as "022306" 
	And user enter OB Amount as "900.00" and "1436696.06" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	Then verify Drop down field changes to "range" 
	And   user log out of application 
	
	
Scenario: OC040 
	And  user enter process startdate as "022306" 
	And user enter OB Amount as "900.00" and "1436696.06" 
	And user set the operator field to "=" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	Then verify upper range field of "amountField" is cleared 
	And   user log out of application 
	
Scenario: OC041 
	And user enter process start date as "012306" and end date as "102308" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	Then verify opertor field changes to "range" in process date 
	And   user log out of application 
	
Scenario: OC042 
	And user enter process start date as "012306" and end date as "102308" 
	And user set the operator field to "=" 
	And user click on Cashlettrs 
	And user nevigate to back page 
	Then verify upper range field of processdate "date" is cleared 
	And   user log out of application 
	
	#Unique id issue	
	#	Scenario: OC043 
	#	And  user enter process startdate as "022306" 
	#	And user click on Cashlettrs
	#	Then verify all screens are uniquely titled 
	#	And   user log out of application
	
	
Scenario: OC0044 
	And  user enter process startdate as "022306" 
	And user enter OB Amount as "5000.00" and "1000.00" 
	And user click on Cashlettrs 
	Then verify popup alert message as "The Amount Begin Value must be smaller than the Amount End Value." 
	And   user log out of application 
	
Scenario: OC046 
	And  user enter process startdate as "022306" 
	And user enter OB Endpoint details as "5000.00" and "1000.00" 
	And user click on Cashlettrs 
	Then verify popup alert message as "The Endpoint number Begin Value must be smaller then the Endpoint Number End Value." 
	And   user log out of application 
	
Scenario: OC0047 
	And  user enter process startdate as "093005" 
	And user click on Cashlettrs 
	Then verify "No data in table for date 2005-09-30." items are displyed on screen 
	And   user log out of application 
	