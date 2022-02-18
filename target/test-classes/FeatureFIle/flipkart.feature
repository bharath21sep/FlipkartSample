

Feature: To validate the login functionality of flipkart
@sanity
Scenario: validate with valid username and valid password
Given launch the chrome browser
When Enter the URL
And Type the valid username and valid password
And click login button
Then validate username
@sanity
Scenario: Add four products to cart
Given Search first product and add to cart
And Search second product and add to card
And serach third product and add to cart
And Search fourth product and add to cart
@regression
Scenario: login with valid username and valid password
Given launch the chrome browser
When Enter the URL 
And Type the valid username and valid password
And click login button
@regression
Scenario: validate the cart and place order
Given click cart button
And Validate the cart with lowest price
And place order
