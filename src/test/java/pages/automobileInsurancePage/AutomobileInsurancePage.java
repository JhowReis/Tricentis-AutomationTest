package pages.automobileInsurancePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class AutomobileInsurancePage  {

//    EVERY LOCATOR SHOULD BE HERE

    WebDriver driver;
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


    public AutomobileInsurancePage(WebDriver driver){
        this.driver = driver;
    }

    //  **********************   METHODS  ********************************
    public By optionValueTag(String value){
        return By.xpath("//*[@value='"+value+"']");
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
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














}

