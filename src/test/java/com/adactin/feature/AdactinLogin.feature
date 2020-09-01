Feature: Testing of booking functionality in adcatin application 

Background:
Given user launch the adactin application
When user log into the application

Scenario: verify the user is able to login the application 
	Given User launches the application 
	When user enters the valid username in username field 
	And user enters the valid password in password field 
	And user clicks the login button 
	Then user verify the home page navigates to the search hotel page 
	
Scenario: verify the user is in Search hotel page 
	When user selects the location in the location field 
	And user selects the hotel in select hotel field 
	And user selects the room type in select room type field 
	And user selects the number of rooms 
	And user selects the checkin date 
	And user selects the checkout date 
	And user selects the adults per room 
	And user selects the children per room 
	And user clicks on search button to search the details 
	Then user verify the search hotel page to booking page 
	
Scenario: verify the user is in BookingPage 
	When user clicks on the selected radio button 
	And user clicks on continue button 
	Then user verify the booking page navigates to hotel confirmation page 
	
Scenario: verify user is in hotel confirmation page 
	When user enter Firstname 
	And user enter Lastname 
	And user enter Address 
	And user enter Cardno 
	And user enter Cardtype 
	And user enter Expirymonth 
	And user enter Expiryyear 
	And user enter Cvvnumber 
	And user enter Booknow 
	Then user click logout in the confirmationpage 
