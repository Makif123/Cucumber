package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitons",
        dryRun = false, // true means that do not run my step definitions but only check if any step is missing snippet.
        tags = "@employee and not @admin"

)
public class CukesRunner {

}
