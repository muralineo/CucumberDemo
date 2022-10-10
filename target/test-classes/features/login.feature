Feature: To test login functionality

	Scenario: To verify the user is able to login
		Given The user opens the webpage
		And The user clicks Sign In button
		And The user enters username and password
		When The user clicks the Sign in button
		Then Verify the title of the page