package com.tradingview.pages;

import com.tradingview.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradingViewPage extends Utility {

    private static final Logger log = LogManager.getLogger(TradingViewPage.class.getName());

    public TradingViewPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='actionBtn-WvyPjcpY']/button[2]")
    WebElement cookies;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'tv-header__area tv-header__area--user']//button[1]")
    WebElement signIn;

    @CacheLookup
    @FindBy(xpath = "//button[@data-name = 'header-user-menu-sign-in']//span[@class='labelRow-RhC5uhZw labelRow-TZ2SJ2fG']")
    WebElement signInLink;

    @CacheLookup
    @FindBy(id = "step-one__footer-link__212d1b9a-1956-4788-a631-203ab2f09de5")
    WebElement signUpLink;


    @CacheLookup
    @FindBy(xpath = "//span[@class = 'tv-signin-dialog__social tv-signin-dialog__toggle-email js-show-email']")
    WebElement emailLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//span[@class = 'tv-button__loader']")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Forex Market')]")
    WebElement getText;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Asia')]")
    WebElement asiaTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='tv-header-search-container']")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//input[@name='query']")
    WebElement searchText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'group-nfAwWSqk']//div[2]//button")
    WebElement overview;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'British Pound/Japanese Yen')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'tv-feed-widget-chart__title']")
    WebElement getGBPJPYText;


    public void acceptCookies(){
        log.info("Click on the accept cookie " + cookies.toString());
        clickOnElement(cookies);
    }

    public void clickOnSignIn(){
        log.info("Click on the Sing in " + signIn.toString());
        mouseHoverToElementAndClick(signIn);
    }
    public void clickOnSignInLink(){
        log.info("Click on the Sing in link " + signInLink.toString());
        mouseHoverToElementAndClick(signInLink);
    }

    public void clickOnEmailLink(){
        log.info("Click on the email in link " + emailLink.toString());
        mouseHoverToElementAndClick(emailLink);
    }

    public void enterEmailToEmailField(String text){
        log.info("Enter email to email field " + enterEmail.toString());
        clickOnElement(enterEmail);
        sendTextToElement(enterEmail,text);
    }
    public void enterPasswordToPasswordField(String text){
        log.info("Enter password to password field " + enterPassword.toString());
        clickOnElement(enterPassword);
        sendTextToElement(enterPassword,text);
    }
    public void clickOnSignInButton(){
        log.info("Click on the sign in button " + signInButton.toString());
        mouseHoverToElementAndClick(signInButton);
    }
    public String getTextFromPage(){
        log.info("Verify the text from page " + getText.toString());
        return getTextFromElement(getText);
    }
    public void clickOnAsiaTab(){
        log.info("Click on the asia tab from top menu " + asiaTab.toString());
        mouseHoverToElementAndClick(asiaTab);
    }
    public void clickOnSearchField(){
        log.info("Click on the search field " + search.toString());
        clickOnElement(search);
    }
    public void enterTextForSearch(String text){
        log.info("Enter text to search for  " + searchText.toString());
        sendTextToElement(searchText,text);
    }
    public void clickOnSeeOverview(){
        log.info("Click on the see overview button " + overview.toString());
        mouseHoverToElement(text);
        clickOnElement(overview);
    }
    public String getTextGBPJPYChartFromPage(){
        log.info("Verify the text from the currancy pair page " + getGBPJPYText.toString());
        return getTextFromElement(getGBPJPYText);
    }







}
