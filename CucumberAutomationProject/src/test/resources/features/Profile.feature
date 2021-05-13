@regression @firefox  @chrome
Feature: Testing Profile Functionality

@important @firefox @chrome
Scenario: Test update the profile details with valid details
    Given open the browser and load the wordpress
    When click on login link
    Then login page should be displayed
    When enter user name "sudheerkumar.gv@gmail.com"
    When click on continue button
    When enter password "kumar@123"
    And  click on login button
    Then dashboard page should be displayed
    When click on profile icon
    Then profile page should display
    When enter first name "sudheer"
    When enter last name "kumar"
    When enter display name "sudheerkumar"
    When enter about me "trainer"
    When click on save profile button
    Then profile page should be successfully saved