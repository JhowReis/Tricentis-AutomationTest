package stepsDefinitions.automobileInsuranceSteps;

import core.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static core.DriverFactory.getDriver;

public class AutomobileInsuranceSteps extends BaseTest {

    WebDriver driver = getDriver();
    @Given("I am on Automobile Insurance page")
    public void iAmOnAutomobileInsurancepage() {
        driver.get(baseUrl());
    }


}
