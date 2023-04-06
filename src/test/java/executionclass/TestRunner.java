package executionclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",

        glue = "",

        tags = "@testLoan",
//        tags = "@test1",

        plugin = {
        "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json"
        }

)

public class TestRunner {

}
