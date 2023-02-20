$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tradingview.feature");
formatter.feature({
  "line": 1,
  "name": "User can navigate to \u0027Asia\u0027 top menu and can find currency pair",
  "description": "As a user I want to check \u0027Asia\u0027 top menu of tradingview website",
  "id": "user-can-navigate-to-\u0027asia\u0027-top-menu-and-can-find-currency-pair",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10313637701,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "I should navigate successfully from \u0027Asia\u0027 top menu tab",
  "description": "",
  "id": "user-can-navigate-to-\u0027asia\u0027-top-menu-and-can-find-currency-pair;i-should-navigate-successfully-from-\u0027asia\u0027-top-menu-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to \u0027https://www.tradingview.com/markets/currencies/rates-all/\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I accept cookie",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Email link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"email\" into email field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"password\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on SignIn Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should successfully sign in to website",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on \u0027Asia\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on search box",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I search \"FX: GBPJPY\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \u0027See Overview\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should navigated to currency \u0027GBPJPY\u0027 page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TradingViewHomePageSteps.iGoToHttpsWwwTradingviewComMarketsCurrenciesRatesAll()"
});
formatter.result({
  "duration": 114617300,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iAcceptCookie()"
});
formatter.result({
  "duration": 126119001,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnSignIn()"
});
formatter.result({
  "duration": 478184801,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnEmailLink()"
});
formatter.result({
  "duration": 648369799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 9
    }
  ],
  "location": "TradingViewHomePageSteps.iEnterIntoEmailField(String)"
});
formatter.result({
  "duration": 195239500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    }
  ],
  "location": "TradingViewHomePageSteps.iEnterIntoPasswordField(String)"
});
formatter.result({
  "duration": 142474400,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnSignInButton()"
});
formatter.result({
  "duration": 194025100,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iShouldSuccessfullySignInToWebsite()"
});
formatter.result({
  "duration": 73025201,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnAsiaTab()"
});
formatter.result({
  "duration": 191247901,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnSearchBox()"
});
formatter.result({
  "duration": 1048789400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FX: GBPJPY",
      "offset": 10
    }
  ],
  "location": "TradingViewHomePageSteps.iSearch(String)"
});
formatter.result({
  "duration": 747415101,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iClickOnSeeOverview()"
});
formatter.result({
  "duration": 23813798200,
  "status": "passed"
});
formatter.match({
  "location": "TradingViewHomePageSteps.iShouldNavigatedToCurrencyGBPJPYPageSuccessfully()"
});
formatter.result({
  "duration": 71890500,
  "status": "passed"
});
});