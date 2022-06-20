package com.cydeo.utilities;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int time) {
        time *= 1000;

        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }

    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles();
        for (String each : allWindowsHandle) {
            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    /**
     * This method will verify if the current URL contains expected value
     *
     * @param expectedInUrl
     */
    public static void verifyUrlContains(String expectedInUrl) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));
    }

    /**
     * This method will accept a dropdown as a WebElement and return all of this options
     * in a list of the String
     * @param dropdownElement
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);
        //List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionsWebElement = select.getOptions();
//List of all ACTUAL month <options> as a String
        List<String> actionsOptionsString = new ArrayList<>();

        for (WebElement each : actualOptionsWebElement) {
            actionsOptionsString.add(each.getText());
        }
        return actionsOptionsString;
    }

}
