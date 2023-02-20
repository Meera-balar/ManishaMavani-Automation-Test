package com.tradingview.cucumber.steps;

import com.tradingview.pages.TradingViewPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TradingViewHomePageSteps {
    @Given("^I go to 'https://www\\.tradingview\\.com/markets/currencies/rates-all/'$")
    public void iGoToHttpsWwwTradingviewComMarketsCurrenciesRatesAll() {
    }
    @And("^I accept cookie$")
    public void iAcceptCookie() {
        new TradingViewPage().acceptCookies();
    }

    @When("^I click on SignIn link$")
    public void iClickOnSignIn() {
        new TradingViewPage().clickOnSignIn();
        new TradingViewPage().clickOnSignInLink();
    }

    @And("^I click on Email link$")
    public void iClickOnEmailLink() {
        new TradingViewPage().clickOnEmailLink();
    }

    @And("^I enter \"([^\"]*)\" into email field$")
    public void iEnterIntoEmailField(String arg0){
        new TradingViewPage().enterEmailToEmailField("pmeera902@gmail.com");
    }

    @And("^I enter \"([^\"]*)\" into password field$")
    public void iEnterIntoPasswordField(String arg0){
        new TradingViewPage().enterPasswordToPasswordField("abc123456");
    }

    @And("^I click on SignIn Button$")
    public void iClickOnSignInButton() {
        new TradingViewPage().clickOnSignInButton();
    }

    @Then("^I should successfully sign in to website$")
    public void iShouldSuccessfullySignInToWebsite() {
        Assert.assertEquals("User not sign in successfully", "FOREX MARKET",new TradingViewPage().getTextFromPage());
    }

    @When("^I click on 'Asia' tab$")
    public void iClickOnAsiaTab() {
        new TradingViewPage().clickOnAsiaTab();
    }

    @And("^I click on search box$")
    public void iClickOnSearchBox() throws InterruptedException {
        Thread.sleep(500);
        new TradingViewPage().clickOnSearchField();
    }

    @And("^I search \"([^\"]*)\"$")
    public void iSearch(String text){
        new TradingViewPage().enterTextForSearch("FX: GBPJPY");

    }

    @And("^I click on 'See Overview'$")
    public void iClickOnSeeOverview() throws InterruptedException{
        Thread.sleep(500);
        new TradingViewPage().clickOnSeeOverview();
    }

    @Then("^I should navigated to currency 'GBPJPY' page successfully$")
    public void iShouldNavigatedToCurrencyGBPJPYPageSuccessfully() {
        Assert.assertEquals("User not navigated to currency pair page successfully","GBPJPY chart",new TradingViewPage().getTextGBPJPYChartFromPage());
    }



}
