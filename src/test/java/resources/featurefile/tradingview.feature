Feature: User can navigate to 'Asia' top menu and can find currency pair
  As a user I want to check 'Asia' top menu of tradingview website

  Scenario: I should navigate successfully from 'Asia' top menu tab
    Given I go to 'https://www.tradingview.com/markets/currencies/rates-all/'
    And I accept cookie
    When I click on SignIn link
    And I click on Email link
    And I enter "email" into email field
    And I enter "password" into password field
    And I click on SignIn Button
    Then I should successfully sign in to website
    When I click on 'Asia' tab
    And I click on search box
    And I search "FX: GBPJPY"
    And I click on 'See Overview'
    Then I should navigated to currency 'GBPJPY' page successfully

