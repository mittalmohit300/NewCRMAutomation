Feature: Create customer contact

Scenario Outline: To capture customer contact details
#Given user already on Login Page
#When title login page is Free CRM
#Then user should enter "<username>" and "<password>"
#Then user should clicks on login button

Given user on home page
When user mouseover on contacts button
Then user click on new contact button
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:

    | username | password | firstname | lastname | position |
	| batchautomation  | Test@12345 | Tom 	  | Peter    | Manager         |
	| batchautomation  | Test@12345 | Test 	  | User     | Product Manager |
	| batchautomation  | Test@12345 | Mohan   | Kumar    | Senior Manager  |