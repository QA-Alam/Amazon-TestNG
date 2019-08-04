Feature: Login function validation 

Scenario: Successful Login with Valid Credentials 

	Given User able to open any browser 
	And  Put URL and go to login page 
	|URL|
	|http://www.gcrit.com/build3/|
	When User able to click my account 
	And User able to use valid userName 
		|userName|
		|sarowerny@gmail.com|
		|princessgull89@gmail.com|
	And User able to put valid password 
		|password|
		|student|
		|Liton3555|
	And User able to click submit button 
	Then User able to validate Login status 
	And close the browser 
	
	
	
	
	
	
	
	
	