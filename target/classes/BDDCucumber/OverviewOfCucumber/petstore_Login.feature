Feature: PetStore Assignment

@login
Scenario Outline: Login with valid data
Given launch the application
When I click on Enter the store
When I click on sign In
When I entered the username "<username>"
And  I entered the password "<password>"
And  I clicked on login button
Then I verified that the user loggedin successfully
Then I closed the application


Examples:
|username|password|
|whistler@123|j2ee|
#|weaver@123|123456789|
#|j2ee|j2ee|


@Fish
Scenario: Fish
Given Login and find Fish button
When I clicked on Fish
And I clicked on FI-SW-01
And I clicked on EST-1
And I clicked on Add to Cart
And I clicked on Proceed to Checkout
And I clicked on Continue
And I clicked on Confirm
Then I closed the Fish_application

@Bird
Scenario: Bird
Given Login and find Birds button
When I clicked on Birds
And I clicked on AV-CB-01
And I clicked on EST_Eighteen
And I clicked on Add to Cart for birds
And I clicked on Proceed to Checkout for birds
And I clicked on Continue for birds
And I clicked on Confirm  for birds
Then I closed the Birds_application

