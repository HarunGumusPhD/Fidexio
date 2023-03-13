#Execution
Feature: Login Functionality

  Background: Login page
    Given User is on the login page



  #Test Case 1
  Scenario Outline: User should Login with valid credentials
    When User enters email "<username>" in username area
    And User enters password "<password>" password area
    And User clicks login button
    Then User should be on the homepage

    Examples: username and Password
      | username                | password     |
      | salesmanager6@info.com  | salesmanager |
      | salesmanager99@info.com | salesmanager |
      | posmanager33@info.com   | posmanager   |
      | posmanager105@info.com  | posmanager   |


  #Test Case 2
  Scenario Outline: User can not login with invalid credentials
    When User enters email "<username>" in username area
    And User enters password "<password>" password area
    And User clicks login button
    Then User should see the error message "Wrong login/password"

    Examples: Email and Password
      | username                        | password     |
      | salesmanageE46@info.com  | salesmanager |
      | salesmanager100@info.com | salesmanagEC |
      | posmanager1@info.com     | posmanager   |
      | posmanager100@info.com   | WEWQDQ32S    |


#Test Case 3
  @wip
  Scenario Outline: User should see validation message when using empty credentials
    When User enters email "<username>" in username area
    And User enters password "<password>" password area
    And User clicks login button
    Then user should see validation message  "Please fill out this field."
    Examples: Email and Password
      | username                | password     |
      | salesmanager98@info.com |              |
      |                         | salesmanager |
      |                         |              |

  #Test Case 4

  Scenario Outline: User should see the bullet signs when type the password
    When User enters password "aacew4eg" password area
    Then  user should see bullet sign


  #Test Case 5
  Scenario Outline:Verify "Enter" key is working on keyboard like Login Button funciaonality
    When User enters email "<username>" in username area
    And User enters password "<password>" password area
    And User clicks enter key on keyboard
    Then user should login User Page
    Examples: username and Password
      | username               | password     |
      | salesmanager6@info.com | salesmanager |
      | posmanager33@info.com  | posmanager   |