Feature: Everybody wants to bay anything on SwagLabs

  @inventory @regression
  Scenario: Inventory - Buy All Products
    Given The user write the username standard_user and the password secret_sauce
    And   The user will see screen for the standard_user
    And   The user select the product Sauce Labs Backpack
    And   The user do click on shopping cart
    And   The user will see the cart screen with their items