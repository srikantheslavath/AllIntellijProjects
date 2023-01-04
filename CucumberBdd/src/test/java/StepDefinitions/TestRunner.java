package StepDefinitions;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/Login.feature"
        ,glue={"StepDefinitions"},
        tags="@smoke",
        plugin = {"pretty","html:target/HtmlReports","json:target/jsonReports","pretty","junit:target/junnitreports" }
)




public class TestRunner {


}
