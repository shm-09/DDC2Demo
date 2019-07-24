Feature: My validation on American Express

@Regression
Scenario: I want to login
Given I have account 
And I will provide the data
Then My login success

@Regression, @Sanity
Scenario: I want to view my membership
Given I have logged in
Then I click on reward points
And I will check for MyRewards


@Smoke
Scenario: I want to refer my friend
Given I am offered with referal bonus
When I share the link with friend
Then I will get some zeta points
And I will enjoy my friday party 