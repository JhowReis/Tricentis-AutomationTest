package stepsDefinitions.automobileInsuranceSteps;

import com.beust.ah.A;
import core.BaseTest;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.automobileInsurancePage.AutomobileInsurancePage;

import static core.DriverFactory.getDriver;

public class AutomobileInsuranceSteps extends BaseTest {
    WebDriver driver = getDriver();
    AutomobileInsurancePage automobileInsurancePage = new AutomobileInsurancePage(driver);






    @Given("the Automobile Insurance is displayed")
    public void theAutomobileInsuranceIsDisplayed() {
        driver.get(baseUrl());
    }
    @When("the user fills in all tabs correctly")
    public void theUserFillsInAllTabsCorrectly() {

//        Enter Insurante Data
       automobileInsurancePage.selectMake("Volvo");
       automobileInsurancePage.selectModel("Three-Wheeler");
       automobileInsurancePage.setCylinderValue(152);
       automobileInsurancePage.setEngineValue(221);
       automobileInsurancePage.setDateManufacture();
       automobileInsurancePage.setNumberSeats(2);
       automobileInsurancePage.selectRightHand("NO");
       automobileInsurancePage.selectNumberSeatsMotorcycle(1);
       automobileInsurancePage.selectFuelType("Gas");
       automobileInsurancePage.setPayload(980);
       automobileInsurancePage.setTotalWeight(558);
       automobileInsurancePage.setListPrice(20000);
       automobileInsurancePage.setLicensePlateNumber("kjl123");
       automobileInsurancePage.setAnnualMileage(350);
       Assert.assertEquals("0",automobileInsurancePage.counterZero());
       automobileInsurancePage.clickNext();

//       **********    ENTER INSURANT DATA **************

        automobileInsurancePage.setFirsName("Jonathan");
        automobileInsurancePage.setLastName("Reis");
        automobileInsurancePage.setDateBirth();
        automobileInsurancePage.selectGender("Male");
        automobileInsurancePage.setStreetAddress("Avenida");
        automobileInsurancePage.setCountry("Brazil");
        automobileInsurancePage.setZipCode(258634);
        automobileInsurancePage.setCity("Recife");




    }

//    @When("the user sends the email")
//    public void theUserSendsTheEmail() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the success message appears")
//    public void theSuccessMessageAppears() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}

//    @After
//    public void exitDriver(){
//        killDriver();
//    }
