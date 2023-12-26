package hellocucumber.steps;

import hellocucumber.pageobject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    WebDriver driver = CucumberHooks.getDriver();
    InventoryPage inventoryPage = new InventoryPage(driver);
     @Then("The user will see the items")
    public void theUserWillSeeTheItems() {
        inventoryPage.getItems();
    }
    @And("The user do logout")
    public void theUserDoLogout(){
        inventoryPage.logOut();
    }
}
