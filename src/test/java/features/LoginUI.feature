Feature: Login

  Background:
    Given I navigate to the login page
    When I enter the username and password for login

  @test1
  Scenario: Login to login page
    Given I click on submit for "Narayana"
    Then login user should match with name "Narayana"
