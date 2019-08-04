Feature: Amazon cart function

Scenario: Validate cart function with payement options

Given Login
Then Validate login
When search tv
And Click tv checkbox
And Sort high to low price
And All tv name
And All tv price
And Find the highest  price
And find out 2nd highest price
And Find the lowest price
And find out 2nd lowest price
And Add one tv to cart
And Procedd for payment
And use invalide card
Then validate payement was failed
