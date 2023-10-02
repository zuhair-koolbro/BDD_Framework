Feature: Login Cases
  Background: User open login page
    Given User open "https://www.saucedemo.com/" page


  Scenario Outline: Verify user can able to login successfully with standard_user account
    And User click on username field
    When User enter username "<username>"
    And User click on password field
    When User enter password "secret_sauce"
    And User click the Login button
    Then User should be on the Products page
    And User close browser
    Examples:
      | username                |
      | standard_user           |
      | problem_user            |
      | performance_glitch_user |

