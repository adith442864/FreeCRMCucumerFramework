@FunctionalTest
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and password
Given This is a invalid login test

@RegressionTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a tasks
Given This is a tasks test case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given clicking on left panel links

@SmokeTest @RegressionTest
Scenario: Search a deal
Given This is search deal test

@SmokeTest @RegressionTest
Scenario: Search a contact
Given This is search contact test

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is search case test

@SmokeTest @RegressionTest
Scenario: Search a task
Given This is search contact test

@SmokeTest @End2End
Scenario: Search a call
Given This is search call test

@SmokeTest @End2End
Scenario: Search an email
Given This is search email test

@SmokeTest @End2End
Scenario: Search a docs
Given This is search docs test

@SmokeTest @End2End
Scenario: Search a forms
Given This is search forms test

@End2End
Scenario: Validate a report
Given This is a report test

@End2End
Scenario: Application Logout
Given This is a logout test

@SmokeTest
Scenario: browser closed
Given This is close browser test



