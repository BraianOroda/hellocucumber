package hellocucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.HomePage;

import java.util.List;

public class StepDefinitions{
    WebDriver driver = null;
    HomePage homePage;

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

    /*
    @When("The user put the user name and password")
    public void theUserPutTheUserNameAndPassword() {
        WebElement inputUserName = driver.findElement(By.xpath("//input[@data-test='username']"));
        inputUserName.sendKeys("standard_user");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@data-test='password']"));
        inputPassword.sendKeys("secret_sauce");
        WebElement logginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        logginButton.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(inputUserName));
    }
    */

    @When("The user put the user name and password")
    public void theUserPutTheUserNameAndPassword() {
        homePage = new HomePage(driver);
        homePage.loginUser();
    }

    @Then("The user will see the items")
    public void theUserWillSeeTheItems() {
        List<WebElement> listaItems = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        assert listaItems.size() > 0;
    }

    @And("The user do logout")
    public void theUserDoLogout() {
        driver.quit();
    }
}
