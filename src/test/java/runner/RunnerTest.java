package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",  "json:target/cucumber-report/cucumber.json",
}, features = {"src/test/java/features"},
        glue = "stepsDefinitions",
        tags  = "@success",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        monochrome = false)

public class RunnerTest {

}
