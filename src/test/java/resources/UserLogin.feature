Feature:

  Scenario: User Login
    Given user navigate to login page by opening FireFox
    When user inputs valid username and password
    And user clicks on login button
    Then user is redirected to products page

  Scenario: Buy a Backpack
    Given user navigate to login page by opening FireFox
    When user inputs valid username and password
    And user clicks on login button
    Then user is redirected to products page
    When user clicks on wanted product
    Then user is redirected to wanted product's page
    When user clicks on add to cart button
    And user clicks on cart button
    Then user is redirected to cart's page
    When user clicks on checkout button
    Then user is redirected to checkout page
    When user inputs first name, last name and zip code fields
    And user clicks on continue button
    Then user is redirected to checkout overview page
    When user clicks on finish button
    Then user is redirected to finished order page