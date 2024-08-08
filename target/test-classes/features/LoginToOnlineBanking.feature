Feature: To Test PNC Bank Login Functionality 

@Test
Scenario: Verify Login Functionality with Invalid Credential 
	Given User Launches the PNC Bank application
	When User clicks on the Sign On button
	And User enters username and password
	And User clicks on login button 
	Then Shows warning or error on UI