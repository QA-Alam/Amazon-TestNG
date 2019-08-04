Feature: Check Amazon login with cart function


Scenario: Successfully check iphone and cart functionality 
	Given Check login
	Then Validate  login
	When Search iphone 
	And select iphone band check box
	And Sort High to Low price 
	And Find all iphone and total iphone number in 1st page 

	

	
	
	
	
	