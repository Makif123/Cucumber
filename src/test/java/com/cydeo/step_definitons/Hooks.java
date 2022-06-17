package com.cydeo.step_definitons;
    /*
    In the class we will be able to pass pre- & post- conditions to
    each scenario and each step
    */


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    // we import from io.cucumber.java not from junit
    @Before
    public void setupScenario() {
        System.out.println("======Setting up browser using cucumber @Before");

    }
    @Before("@login")
    public void setupScenarioLogins() {
        System.out.println("======this will only apply to scenarios with @login tag");

    }

    @Before("@db")
    public void setupForDataBaseScenarios() {
        System.out.println("======this will only apply to scenarios with @db tag");

    }

    @After
    public void teardownScenario() {
        System.out.println("========Closing browser using cucumber @After");
        System.out.println("=====Scenario ended/ Take screen schoot");
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("--------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------------> applying tearDown using @AfterStep");
    }

}
