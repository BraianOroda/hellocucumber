package hellocucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHooks {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    @Before
    public void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        tlDriver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().get("https://www.saucedemo.com/v1/");
    }
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
    @After
    public void closeBrowser(){
        getDriver().quit();
    }
}
