Feature: Incoming scenario check 

Background: 
	Given user is on application home page 
	When  user click on incoming field 
	
Scenario: INC001
	And      user click on searchAll button 
	Then verify popup alert message as "Process Date is required for all searches." 
	And      user log out of application 
		
Scenario: INC002 
	And  user enter process date 
	And      user enetr Account number details 
	And      user enetrs Ammount details 
	And      user click on searchAll button 
	Then verify "56" items are displyed on screen 
	And      user log out of application 
	
Scenario: INC003 
	And  user enter process date 
	And user enter Differance Amount details 
	And  user click on searchAll button 
	Then verify "100" items are displyed on screen 
	And user log out of application 
	
Scenario: INC004 
	And  user enter process date 
	And user enter sequence number details 
	And user click on searchAll button 
	Then verify "72" items are displyed on screen 
	And user log out of application 
	
Scenario: INC005 
	And user enter process date 
	And user enter checkno details 
	And user click on searchAll button 
	Then verify "26" items are displyed on screen 
	And user log out of application 
		
Scenario: INC007 
	And user enter process date 
	And user enter routinetransite no from "20742294" to "20742302" 
	And verify operator field changes to "range"
	And user click on searchAll button 
	Then verify "30" items are displyed on screen 
	And user log out of application 
	