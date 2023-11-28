Feature: Everybody wants to bay anything on SwagLabs

  Scenario: Login user
    Given The user do login on the web
    When  The user put the user name and password
    Then  The user will see the items
    And   The user do logout