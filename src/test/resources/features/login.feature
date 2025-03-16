Feature: Login page Automation of Sauce Demo App
  Scenario Outline:  Check login is successful with valid creds
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the browser
    Examples:
      | username  | password |
      | standard_user | secret_sauce|
     # | locked_out_user | secret_sauce |
     # | problem_user | secret_sauce|
     # | performance_glitch_user | secret_sauce|
     # | error_user | secret_sauce|
     # | visual_user | secret_sauce|