package com.cydeo.step_definitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");

    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");

    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("user enter admin password");

    }
}
