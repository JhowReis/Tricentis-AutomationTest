package stepsDefinitions;

import core.BaseTest;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AutomobileInsurancePage;
import static core.DriverFactory.getDriver;

public class AutomobileInsuranceSteps extends BaseTest {
    WebDriver driver = getDriver();
    AutomobileInsurancePage automobileInsurancePage = new AutomobileInsurancePage(driver);

    @Given("the Automobile Insurance Page is displayed")
    public void theAutomobileInsurancePageIsDisplayed() {
        driver.get(baseUrl());
    }

    @When("the user fills Enter Vehicle Data tab")
    public void theUserFillsEnterVehicleDataTab() {
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

    }
    @When("the user fills Enter Insurance tab")
    public void theUserFillsEnterInsuranceTab() {
        automobileInsurancePage.setFirsName("Jonathan");
        automobileInsurancePage.setLastName("Reis");
        automobileInsurancePage.setDateBirth();
        automobileInsurancePage.selectGender("Male");
        automobileInsurancePage.setStreetAddress("Avenue");
        automobileInsurancePage.setCountry("Canada");
        automobileInsurancePage.setZipCode(258634);
        automobileInsurancePage.setCity("Toronto");
        automobileInsurancePage.setOccupation("Farmer");
        automobileInsurancePage.setHobbies("Bungee Jumping");
        automobileInsurancePage.setHobbies("Skydiving");
        automobileInsurancePage.setWebsite("www.test");
        Assert.assertEquals("0",automobileInsurancePage.getCountInsurantDate());
        automobileInsurancePage.clickNextPrdDataBtn();
    }
    @When("the user fills Enter Product Data tab")
    public void theUserFillsEnterProductDataTab() {
        automobileInsurancePage.setStartDate();
        automobileInsurancePage.setInsuranceSum(3000000);
        automobileInsurancePage.setMeritRating("Malus 14");
        automobileInsurancePage.setDamageInsurance("No Coverage");
        automobileInsurancePage.setOptionalProducts("Legal Defense Insurance");
        automobileInsurancePage.setCourtesyCar("yes");
        Assert.assertEquals("0",automobileInsurancePage.getCountproductData());
        automobileInsurancePage.clickNetPriceOption();
    }
    @When("the user fills Select Price Options tab")
    public void theUserFillsSelectPriceOptionsTab() {
        automobileInsurancePage.setPriceOption("Gold");
        Assert.assertEquals("0",automobileInsurancePage.getCountPriceOption());
        automobileInsurancePage.clickNextSendQuote();
    }
    @When("the user fills Send Quote tab")
    public void theUserFillsSendQuoteTab() {
        automobileInsurancePage.setEmail("jonathan@test.com");
        automobileInsurancePage.setPhone(98653298);
        automobileInsurancePage.setUserName("Jonathan");
        automobileInsurancePage.setPassword("Test123");
        automobileInsurancePage.setConfirmPassword("Test123");
        automobileInsurancePage.setComments("success email test");

        Assert.assertEquals("0", automobileInsurancePage.getSendQuoteCount());
    }
    @When("the user sends the email")
    public void theUserSendsTheEmail() {
        automobileInsurancePage.clickSend();
    }
    @Then("the success message appears")
    public void theSuccessMessageAppears() {
        Assert.assertEquals("Sending e-mail success!",automobileInsurancePage.getMessage());
    }


}
