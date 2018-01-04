Feature: Test Login Functionality for users

Scenario: Test Login functionality for a valid user
Given User launches ClientSite in browser
When User enters valid username and password
	And hits enter
Then user is navigated to clientsite home page.


Scenario: Test Login functionality for an invalid user

Given User launches ClientSite in browser
When User enters invalid username and password
	And hits enter
Then user recieved an error.

Scenario Outline: Test Login functionality for multiple users

Given User launches ClientSite in browser
When User enters username <username>
And User enters password <password>
	And hits enter
Then user is navigated to clientsite home page.

Examples:

|	username	|	password	|
|	6777	|	gedi back door	|
|	5656	|	gedi back door	|
	



#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
#	I want to use this template for my feature file

#@tag1
#Scenario: Title of your scenario
#Given I want to write a step with precondition
#	And some other precondition
#When I complete action
#	And some other action
#	And yet another action
#Then I validate the outcomes
#	And check more outcomes

#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step

#Examples:
#    | name  |value | status |
#    | name1 |  5   | success|
#   | name2 |  7   | Fail   |
