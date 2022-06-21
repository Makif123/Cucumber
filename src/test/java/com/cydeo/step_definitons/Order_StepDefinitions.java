package com.cydeo.step_definitons;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {// Write code here that turns the phrase above into concrete actionsthrow new io.cucumber.java.PendingException();
//Getting the page using the URL from configuration properties.
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        //Calling our login method to log in to web table app
        webTableLoginPage.login();
        //Clicking to "order" link to go order page
        basePage.order.click();
    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {// Write code here that turns the phrase above into concrete actionsthrow new io.cucumber.java.PendingException();

    }


    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {// Write code here that turns the phrase above into concrete actionsthrow new io.cucumber.java.PendingException();
    }

    @When("user enter costumer name {string}")
    public void user_enter_costumer_name(String string) {// Write code here that turns the phrase above into concrete actionsthrow new io.cucumber.java.PendingException();

    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {

    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {

    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {

    }

    @When("user enters zipcode\"{int}\"")
    public void user_enters_zipcode(Integer int1) {
    }

    @When("user enters credit card type {string}")
    public void user_enters_credit_card_type(String string) {
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
    }


}
