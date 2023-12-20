Feature: Login page Automation of sauce demo app

Scenario: Check login is succesful credentials
	Given User is on login page
	When User enter valid user name and password
	And Click on login Button
	Then User is navigated to Home page
	And close the browser

Scenario: Check login is unsuccesful credentials
	Given User is on login page
	When User enter invalid user name and password
	And Click on login Button
	Then Login should fail
	And close the browser