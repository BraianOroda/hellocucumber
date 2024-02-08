Feature: Everybody wants to bay anything on SwagLabs

  @login @regression
  Scenario Outline: Login Different Users
    Given The user write the username <USER_NAME> and the password <PASSWORD>
    Then  The user will see screen for the <USER_NAME>
    And   The user do logout

    Examples:
      |         USER_NAME        |    PASSWORD    |
      |  standard_user           |  secret_sauce  |
      |  problem_user            |  secret_sauce  |
      |  performance_glitch_user |  secret_sauce  |

  @login @loginLockerUser @regression
  Scenario: Login Locked User
    Given The user write the username locked_out_user and the password secret_sauce
    Then  The user will see screen for the locked_out_user