package com.cydeo.step_definitons;

import com.cydeo.pages.WebTableLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTablesStepDefinitions {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }


}
