package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;


    private DriverFactory() {}


    public static WebDriver getDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }




}
