package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = "src/test/java/features",
            glue = "stepDefinitions"
    )
    public class test_runner extends AbstractTestNGCucumberTests {
    }

