package hellocucumber.steps;

import hellocucumber.pageobject.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    WebDriver driver = CucumberHooks.getDriver();
    InventoryPage inventoryPage = new InventoryPage(driver);
     @Then("^The user will see screen for the (.*)")
    public void theUserWillSeeTheItems(String username) {
         inventoryPage.validateScrenUsername(username);

    }
    @And("The user do logout")
    public void theUserDoLogout(){
        inventoryPage.logOut();
    }

    @And("^The user select the product (.*)$")
    public void theUserSelectTheProductPRODUCT(String product) {
        inventoryPage.selectProduct(product);
    }

    @And("The user do click on shopping cart")
    public void theUserDoClickOnShoppingCart() {
        inventoryPage.selectShoppingCart();
    }
}
