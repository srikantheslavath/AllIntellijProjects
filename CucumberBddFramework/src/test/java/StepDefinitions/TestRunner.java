package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Features/Login.feature",glue ={"StepDefinitions"},
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty","html:target/HtmlReports","json:target/jsonReports","pretty","junit:target/junitReports"}

)



public class TestRunner {



}
