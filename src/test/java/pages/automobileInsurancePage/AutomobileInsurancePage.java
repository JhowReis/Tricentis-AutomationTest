package pages.automobileInsurancePage;

import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AutomobileInsurancePage  {

//    EVERY LOCATOR SHOULD BE HERE

    WebDriver driver;
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();
//    ********** SELECTORS **********
    private By txt_cylinder = By.id("cylindercapacity");
    private By txt_engine = By.id("engineperformance");
    private By date_manufacture = By.id("dateofmanufacture");
    private By chk_rightHandDriveYes = By.cssSelector("p > label:nth-child(1) > span");
    private By chk_rightHandDriveNo = By.cssSelector("p > label:nth-child(2) > span");
    private By txt_payload = By.id("payload");
    private By txt_totalWeight = By.id("totalweight");
    private By txt_listPrice = By.id("listprice");
    private By txt_licensePlateNumber = By.id("licenseplatenumber");
    private By txt_annualMileage = By.id("annualmileage");
    private By btn_next = By.id("nextenterinsurantdata");
    private By txt_firstName = By.id("firstname");
    private By txt_lastName = By.id("lastname");
    private By date_birthDate = By.id("birthdate");
    private By chk_maleGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
    private By chk_femaleGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
    private By txt_streetAddress = By.id("streetaddress");
    private By txt_zipCode = By.id("zipcode");
    private By txt_city = By.id("city");


    public AutomobileInsurancePage(WebDriver driver){
        this.driver = driver;
    }

    //  **********************   METHODS  ********************************
    public By optionValueTag(String value){
        return By.xpath("//*[@value='"+value+"']");
    }
    public void waitingElement(By locator){
        WebElement presence = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println("elemento é presente na pagina" + presence);
    }

    //  **********************  DATE METHODS  ********************************
    private String getDateTime() {
        return dateFormat.format(date);
    }

    public String setDateBirthDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -20);
        date = cal.getTime();
        return dateFormat.format(date);

    }


    //  ************** ENTER VEHICLE DATA METHODS ********************

    public void selectMake(String makeOption){
        driver.findElement(optionValueTag(makeOption)).click();
    }
    public void selectModel(String modelOption){
        driver.findElement(optionValueTag(modelOption)).click();
    }
    public void setCylinderValue(Integer ccm){
        driver.findElement(txt_cylinder).sendKeys(ccm.toString());
    }
    public void setEngineValue(Integer kw){
        driver.findElement(txt_engine).sendKeys(kw.toString());
    }
    public void setDateManufacture(){
        driver.findElement(date_manufacture).sendKeys(getDateTime());
    }
    public void setNumberSeats(Integer seatNumber){
        driver.findElement(optionValueTag(seatNumber.toString())).click();
    }
    public void selectRightHand(String option){
        option.toLowerCase();
        if (option.equals("yes")){
            driver.findElement(chk_rightHandDriveYes).click();
        } else {
            driver.findElement(chk_rightHandDriveNo).click();
        }
    }
    public void selectNumberSeatsMotorcycle(Integer seatMotNumber){
        By drp_seatNumber = By.cssSelector("#numberofseatsmotorcycle > option:nth-child("+(seatMotNumber + 1)+")");
        driver.findElement(drp_seatNumber).click();
    }
    public void selectFuelType(String fuelType){
        driver.findElement(optionValueTag(fuelType)).click();
    }
    public void setPayload(Integer kg){
        driver.findElement(txt_payload).sendKeys(kg.toString());
    }
    public void setTotalWeight(Integer kg){
        driver.findElement(txt_totalWeight).sendKeys(kg.toString());
    }
    public void setListPrice(Integer price){
        driver.findElement(txt_listPrice).sendKeys(price.toString());
    }
    public void setLicensePlateNumber(String license){
        driver.findElement(txt_licensePlateNumber).sendKeys(license);
    }
    public void setAnnualMileage(Integer mi){
        driver.findElement(txt_annualMileage).sendKeys(mi.toString());
    }
    public void clickNext(){
        driver.findElement(btn_next).click();
    }
    public String counterZero (){
            return driver.findElement(By.className("zero")).getText();
    }

    //  ************** ENTER INSURANT DATA METHODS ********************
    public void setFirsName(String firstName){
        driver.findElement(txt_firstName).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(txt_lastName).sendKeys(lastName);
    }
    public void setDateBirth(){
        driver.findElement(date_birthDate).sendKeys(setDateBirthDate().toString());

    }
    public void selectGender(String gender)  {
        if (gender.equals("Male")){
            driver.findElement(chk_maleGender).click();
        } else {
            driver.findElement(chk_femaleGender).click();
        }
    }
    public void setStreetAddress(String address){
        driver.findElement(txt_streetAddress).sendKeys(address);
    }
    public void setCountry(String country){
        driver.findElement(optionValueTag(country)).click();
    }
    public void setZipCode(Integer zipCode){
        driver.findElement(txt_zipCode).sendKeys(zipCode.toString());
    }
    public void setCity(String city){
        driver.findElement(txt_city).sendKeys(city);
    }



















}

