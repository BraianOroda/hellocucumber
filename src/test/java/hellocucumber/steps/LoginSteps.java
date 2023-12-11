package hellocucumber.steps;

import hellocucumber.pageobject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import hellocucumber.pageobject.LoginPage;

import java.util.List;

public class LoginSteps {
    WebDriver driver = null;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    public void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @Given("The user do login on the web")
    public void theUserDoLoginOnTheWeb() {
        startChromeDriver();
    }

    @When("The user put the user name and password")
    public void theUserPutTheUserNameAndPassword() {
        loginPage = new LoginPage(driver);
        loginPage.loginUser();
    }


}
