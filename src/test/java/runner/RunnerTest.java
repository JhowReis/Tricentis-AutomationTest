package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report-html/index.html", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/java/features"},
        glue = "stepsDefinitions",
        tags  = "@successEmail",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        monochrome = false)

public class RunnerTest {


}

