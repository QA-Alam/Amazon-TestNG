Feature: Check Amazon login with cart function 


Scenario: Successfully check iphone and cart functionality 
	Given Login 
	Then Validate login 
	When search tv 
	When Click tv checkbox 
	When Sort high to low price 
	When All tv name 
	When All tv price 
	When Find the highest  price 
	When find out 2nd highest price 
	When Find the lowest price 
	When find out 2nd lowest price 
	When Add one tv to cart 
	When Procedd for payment 
	When use invalide card 
	Then validate payement was failed 
