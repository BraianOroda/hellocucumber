Feature: Everybody wants to bay anything on SwagLabs

  Scenario: Login Standard User
    Given The user do login on the web
    When  The user put the user name and password
    Then  The user will see the items
    And   The user do logout
    # ver driver para las diferentes clases steps