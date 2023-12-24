package hellocucumber.steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import hellocucumber.pageobject.LoginPage;

public class LoginSteps {
    WebDriver driver = CucumberHooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @When("The user put the user name and password")
    public void theUserPutTheUserNameAndPassword() {
        loginPage.loginUser();
    }
}
