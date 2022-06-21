package com.cydeo.step_definitons;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTablesStepDefinitions {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.usernameInput.sendKeys(string);

    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.passwordInput.sendKeys(string);

    }

    @When("user should see the login button")
    public void user_should_see_the_login_button() {
        webTableLoginPage.loginButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyUrlContains("orders");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.login(username, password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
/*
        webTableLoginPage.usernameInput.sendKeys(credentials.get("username"));
        webTableLoginPage.passwordInput.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();
*/

        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));


    }


}
