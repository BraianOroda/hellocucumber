package hellocucumber.steps;

import hellocucumber.pageobject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    WebDriver driver = null;
    InventoryPage inventoryPage;
    @Then("The user will see the items")
    public void theUserWillSeeTheItems() {
        inventoryPage = new InventoryPage(driver);
        //inventoryPage.getItems();
    }

    @And("The user do logout")
    public void theUserDoLogout() {
        inventoryPage = new InventoryPage(driver);
        inventoryPage.logOut();
        driver.quit();
    }
}
