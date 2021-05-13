@sanity @firefox  @chrome
Feature: Testing Login Functionality

Background: open the url and navigate to login page
    Given open the browser and load the wordpress
    When click on login link
    Then login page should be displayed

@important   
Scenario: Test with valid credentials
    When enter user name "sudheerkumar.gv@gmail.com"
    When click on continue button
    When enter password "kumar@123"
    And  click on login button
    Then dashboard page should be displayed
    
 
@non-important  
Scenario: Test with invalid credentials
    When enter user name "invalidxyz"
    When click on continue button
    Then userName error message should appear
    
@non-important    
Scenario Outline: login with invalid data 
	When enter user name "<username>" 
	When click on continue button
	When enter password "<password>"
	And  click on login button
	Then Login should be failed
	
	Examples: 
		|username						 |password | 
		| sudheerkumar.gv@gmail.com 	 | ABC 	   |
		| sudheerkumar.gv@gmail.com  	 | #@$@$   |
    