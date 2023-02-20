package com.tradingview.utility;

import com.google.common.base.Function;
import com.tradingview.browserfactory.ManageBrowser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class Utility extends ManageBrowser {

    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    //  This method will generate random string to generate random data
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    // click on element method
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //Get text from element metohd
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    // Send text on element method
    public void sendTextToElement(WebElement element, String str) {
        element.clear();
        element.sendKeys(str);
    }

    // To get a list of web elements
    public List<WebElement> webElementList(WebElement element) {
        return webElementList(element);
    }

    //This method will clear previous stored data using keyboard event

    public void clearTextFromField(WebElement element) {
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }




//--------------------------- Alert Methods --------------------------------//

    // Switch to alert method
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    //Accept alert method

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    // Dismiss alert method

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    // Get text from alert method

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    // Send text from alert method
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }


//------------------------- Select Class Methods --------------------------------//

    // Select the option by visible text method

    public void selectByVisibleTextFromDropDown(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }


     // Select the option by value method
    public void selectByValueFromDropDown(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }
    // Select the option by index method
    public void selectByIndexFromDropDown(WebElement element, int index) {
        new Select(element).selectByIndex(index);
    }
    // Select the option by contains text
    public void selectByContainsTextFromDropDown(WebElement element, String text) {
        List<WebElement> allOptions = new Select(element).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }


//---------------------------- Window Handle Methods -------------------------------------//


     // Close all windows method

    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }


     // Switch to parent window method
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }
    //This method will find that we switch to right window

    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Get the right window....");
                return true;
            }
        }
        return false;
    }
//-------------------------- Action Methods -------------------------------------//

    // Mouse hover on element method

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    // Mouse hover on element and click method

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    //----------------------------- Waits Methods -----------------------------------------//


     // Wait until  VisibilityOfElementLocated method

    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }

// ------------------------------ Is Display Methods ---------------------------------------//

     // Element is displayed method

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    // Element text is displayed method


    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    // -------------------------- ScreenShot Methods ---------------------------------- //

    // Take screenshot method

    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/tradingview/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // This path is to check failing test case screenshot of "FailedTestsScreenshots"
        String destination = System.getProperty("user.dir") + "/src/main/java/com/tradingview/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    // Screenshot methods

    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
