package pages.automobileInsurancePage;

import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

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
    private By btn_next = By.className("next");
    private By txt_firstName = By.id("firstname");
    private By txt_lastName = By.id("lastname");
    private By date_birthDate = By.id("birthdate");
    private By chk_maleGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
    private By chk_femaleGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
    private By txt_streetAddress = By.id("streetaddress");
    private By txt_zipCode = By.id("zipcode");
    private By txt_city = By.id("city");
    private By chk_speeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
    private By chk_bungeeJumping = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
    private By chk_cliffDiving = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span");
    private By chk_skyDiving = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
    private By chk_other = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");
    private By txt_website = By.id("website");
    private By file_image = By.className("ideal-file-filename");
    private By countInsurantData = By.cssSelector("#enterinsurantdata > span");
    private By countProducData = By.cssSelector("#enterproductdata > span");
    private By btn_nxtProductData = By.id("nextenterproductdata");
    private By btn_nxtPriceOption = By.id("nextselectpriceoption");
    private By btn_nxtSendQuote = By.id("nextsendquote");
    private By date_startDate = By.id("startdate");
    private By chk_euroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
    private By chk_legalDefense = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
    private By chk_yes = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
    private By chk_no = By.xpath("//*[@id=\"courtesycar\"]/option[2]");
    private By chk_silver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
    private By chk_gold = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
    private By chk_platinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
    private By chk_ultimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");

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
        cal.add(Calendar.YEAR, -18);
        date = cal.getTime();
        return dateFormat.format(date);
    }

    public String startDate() {
        Date date = new Date();
        Calendar cale = Calendar.getInstance();
        cale.setTime(date);
        cale.add(Calendar.MONTH, 2);
        date = cale.getTime();
        return dateFormat.format(date);
    }


    public void scroll(){
        new Actions(driver)
                .scrollByAmount(0,600)
                .perform();
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
    public void setOccupation(String occupation){
        driver.findElement(optionValueTag(occupation)).click();
    }
    public void setHobbies(String hobbies){
        String hb = hobbies.toLowerCase();
        if (hb.equals("speeding")){
            driver.findElement(chk_speeding).click();
        }
        else if (hb.equals("bungee jumping")){
            driver.findElement(chk_bungeeJumping).click();
        }
        else if (hb.equals("cliff diving")){
            driver.findElement(chk_cliffDiving).click();
        }
        else if (hb.equals("skydiving")){
            driver.findElement(chk_skyDiving).click();
        }
        else {
            driver.findElement(chk_other).click();
        }
    }
    public void setWebsite(String website){
        driver.findElement(txt_website).sendKeys(website);
    }
    public void sendScreenShot(){
        WebElement arquivo1 = driver.findElement(file_image);
        File file = new File("target/files/image.jpg");
        arquivo1.sendKeys(file.getAbsolutePath());
    }
    public String getCountInsurantDate(){
        return driver.findElement(countInsurantData).getText();
    }
    public void clickNextPrdDataBtn(){
        driver.findElement(btn_nxtProductData).click();
    }

    //  ************** ENTER PRODUCT DATA METHODS ********************

    public void setStartDate(){
        driver.findElement(date_startDate).sendKeys(startDate());
    }
    public void setInsuranceSum(Integer value){
        driver.findElement(optionValueTag(value.toString())).click();
    }
    public void setMeritRating(String merit){
        driver.findElement(optionValueTag(merit)).click();
    }
    public void setDamageInsurance(String damageInsurance){
        driver.findElement(optionValueTag(damageInsurance)).click();
    }

    public void setOptionalProducts(String product){
        String p = product.toLowerCase();
        if (p.equals("euro protection")){
            driver.findElement(chk_euroProtection).click();
        }
        else {
            driver.findElement(chk_legalDefense).click();
        }
    }
    public void setCourtesyCar(String options){
        String op = options.toLowerCase();
        if (op.equals("yes")){
            driver.findElement(chk_yes).click();
        }
        if (op.equals("no")){
            driver.findElement(chk_no).click();
        }
    }

    public void clickNetPriceOption() {
        driver.findElement(btn_nxtPriceOption).click();
    }
    public String getCountproductData(){
        return driver.findElement(countProducData).getText();
    }

    public void setPriceOption(String option){
        String op = option.toLowerCase();
        if (op.equals("silver")){
            driver.findElement(chk_silver).click();
        }
        else if (op.equals("gold")){
            driver.findElement(chk_gold).click();
        }
        else if (op.equals("platinum")){
            driver.findElement(chk_platinum).click();
        }
        else {
            driver.findElement(chk_ultimate).click();
        }
    }
    public void clickNextSendQuote() {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(btn_nxtSendQuote));
        driver.findElement(btn_nxtSendQuote).click();
    }

}





