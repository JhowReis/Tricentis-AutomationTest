package stepsDefinitions.automobileInsuranceSteps;

import core.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static core.DriverFactory.getDriver;

public class AutomobileInsuranceSteps extends BaseTest {

    WebDriver driver = getDriver();

    @Given("the Automobile Insurance is displayed")
    public void theAutomobileInsuranceIsDisplayed() {
        driver.get(baseUrl());
    }
    @When("the user fills in all tabs correctly")
    public void theUserFillsInAllTabsCorrectly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user sends the email")
    public void theUserSendsTheEmail() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the success message appears")
    public void theSuccessMessageAppears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
