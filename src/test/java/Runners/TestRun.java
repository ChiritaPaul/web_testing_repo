package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"StepDefinitions"},
        tags = "@Paul"
)
public class TestRun extends AbstractTestNGCucumberTests {
}
