 @smo @FIDEX10-477
Feature: Logout Functionality

  Background: User on the User Page
    Given User is on the User page as a salesManager
    And User is on the User page as a posManager


@FIDEX10-474
  Scenario:User can logout to login page
    When user click top bar name on right corner
    And user click log out button
    Then user should back to the login page


@FIDEX10-475
  Scenario: User can not back to homepage after logout
    When user click top bar name on right corner
    And user click log out button
    And user should back to the login page
    And user click step back button on the browser
    Then user can not back to the homepage