package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    /**
     * No parameters.
     * When we call this method, it will directly login using
     * Username= Test
     * Password: Tester
     */


    public void login() {
        this.usernameInput.sendKeys("Test");
        this.passwordInput.sendKeys("Tester");
        this.loginButton.click();

    }


    /**
     * This method will accept two arguments and login.
     *
     * @param username
     * @param password
     */

    public void login(String username, String password) {
        this.usernameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        this.loginButton.click();

    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginConfigurationProperties() {
        usernameInput.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }




}
