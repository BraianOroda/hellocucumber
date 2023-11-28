package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;


class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class StepDefinitions {
    WebDriver driver;
    private String today;
    private String actualAnswer;


    public void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    }

    ///////////////////////////////////////////////////////////////

    @Given("I am on the Google search page")
    public void I_visit_google() {
        //startChromeDriver();
    }

    /*
    @When("I search for {string}")
    public void search_for(String query) {
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys(query);
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String titleStartsWith) {
        // Google's search is rendered dynamically with JavaScript
        // Wait for the page to load timeout after ten seconds
        new WebDriverWait(driver,10L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(titleStartsWith);
            }
        });
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

     */

    ///////////////////////////////////////////////////////

    @Given("The user do login on the web")
    public void theUserDoLoginOnTheWeb() {
        startChromeDriver();
    }

    @When("The user put the user name and password")
    public void theUserPutTheUserNameAndPassword() {
        WebElement a = driver.findElement(By.xpath("//input[@data-test='username']"));
        a.sendKeys("dfsaffadfaq");
    }

    @Then("The user will see the items")
    public void theUserWillSeeTheItems() {

    }

    @And("The user do logout")
    public void theUserDoLogout() {
    }
}
