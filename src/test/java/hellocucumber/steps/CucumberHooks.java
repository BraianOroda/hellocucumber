package hellocucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class CucumberHooks {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    @Before
    public void startChromeDriver() {
        /*Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
//        options.setExperimentalOption("mobileEmulation", mobileEmulation);
//        options.addArguments("--enable-logging=stderr");
//        options.addArguments("-enable-logging=stderr --v=2");
//        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        tlDriver.set(new ChromeDriver(options));
//        tlDriver.set(new ChromeDriver());
//        getDriver().manage().window().maximize();
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
