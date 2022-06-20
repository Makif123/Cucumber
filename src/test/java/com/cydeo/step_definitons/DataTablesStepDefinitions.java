package com.cydeo.step_definitons;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTablesStepDefinitions {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        DropDownsPage dropDownsPage = new DropDownsPage();

        Select select = new Select(dropDownsPage.dropdown);
       //List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionsWebElement = select.getOptions();
//List of all ACTUAL month <options> as a String
        List<String> actionsOptionsString = new ArrayList<>();

        for (WebElement each : actualOptionsWebElement) {
            actionsOptionsString.add(each.getText());
        }
        Assert.assertEquals(expectedMonths, actionsOptionsString);

        //Assert will check the s ize of the list first. It is matching it will check content 1 by 1.

    }


}
