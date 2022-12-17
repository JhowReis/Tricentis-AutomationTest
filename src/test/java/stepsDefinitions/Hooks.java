package stepsDefinitions;

import core.Properties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class Hooks {


//    Taking a screenshot and closing the driver after the scenario
    @After
    public void end(Scenario scenario) {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(arquivo, new File("target/screenshots/" + scenario.getName() + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Properties.CLOSE_BROWSER) {
                killDriver();
            }
        }
    }
}
