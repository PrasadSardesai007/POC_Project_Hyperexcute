Feature: To Test PNC Bank Enrollment Functionality with Invalid details 


@Test
Scenario Outline: 
	Verify Enrollement Functionality with Invalid Credential for SSN and PNC Debit Card fields 
	Given User Launches the PNC Bank application 
	When User clicks on the Sign On button 
	And User clicks on the Enroll In Online Banking button 
	Then Verify that the user is on the enrollment page 
	When User selects the SSN radio button and enters the PAN Account Number "<SSN>" 
	And User enters the PAN Account Number "<PanAccountNumberOPanNumber>" 
	And User selects the PNC Debit Card PIN radio button and enters the PNC debit card pin "<DebitCardPin>" 
	And User clicks on the next button 
	Then Verify that the application shows an appropriate warning message on the UI 
	
	Examples: 
		|SSN|DebitCardPin|PanAccountNumberOPanNumber|
		|123456789|090909|12345678|
		
@Test	
Scenario Outline: 
	Verify Enrollement Functionality with Invalid Credential for SSN and online access Pin 
	Given User Launches the PNC Bank application 
	When User clicks on the Sign On button 
	And User clicks on the Enroll In Online Banking button 
	Then Verify that the user is on the enrollment page 
	When User selects the SSN radio button and enters the PAN Account Number "<SSN>" 
	And User enters the PAN Account Number "<PanAccountNumberOPanNumber>" 
	And User selects the Online Access PIN radio button and enters the online access pin "<OnlineAccessPin>" 
	And User clicks on the next button 
	Then Verify that the application shows an appropriate warning message on the UI 
	
	Examples: 
		|SSN|DebitCardPin|PanAccountNumberOPanNumber|OnlineAccessPin|
		|123456789|090909|12345678|5523|
		
		
	@Test	
Scenario Outline: 
	Verify Enrollement Functionality with Invalid Credential for PNC Online and Voice Banking User ID AND PNC Debit Card Pin 
	Given User Launches the PNC Bank application 
	When User clicks on the Sign On button 
	And User clicks on the Enroll In Online Banking button 
	Then Verify that the user is on the enrollment page 
	When User selects the PNC Online and Voice Banking User ID radio button and enters the PNC Online and voice Banking userid "<PNCVoiceBankId>" 
	And User enters the PAN Account Number "<PanAccountNumberOPanNumber>" 
	And User selects the Online Access PIN radio button and enters the online access pin "<OnlineAccessPin>" 
	And User clicks on the next button 
	Then Verify that the application shows an appropriate warning message on the UI 
	
	Examples: 
		|PNCVoiceBankId|DebitCardPin|PanAccountNumberOPanNumber|OnlineAccessPin|
		|123456789|090909|12345678|5523|
		
		
		
		
@Test 
Scenario Outline: 
	Verify Enrollement Functionality with Invalid Credential for PNC Online and Voice Banking User ID AND PNC Debit Card Pin 
	Given User Launches the PNC Bank application 
	When User clicks on the Sign On button 
	And User clicks on the Enroll In Online Banking button 
	Then Verify that the user is on the enrollment page 
	When User selects the PNC Online and Voice Banking User ID radio button and enters the PNC Online and voice Banking userid "<PNCVoiceBankId>" 
	And User enters the PAN Account Number "<PanAccountNumberOPanNumber>" 
	And User selects the PNC Debit Card PIN radio button and enters the PNC debit card pin "<DebitCardPin>" 
	And User clicks on the next button 
	Then Verify that the application shows an appropriate warning message on the UI 
	
	Examples: 
		|PNCVoiceBankId|DebitCardPin|PanAccountNumberOPanNumber|OnlineAccessPin|
		|123456789|090909|12345678|5523|		