package hellocucumber.steps;

import hellocucumber.pageobject.CartPage;
import hellocucumber.pageobject.InventoryPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    WebDriver driver = CucumberHooks.getDriver();
    CartPage cartPage = new CartPage(driver);

    @And("The user will see the cart screen with their items")
    public void theUserWillSeeTheCartScreenWithTheirItems() {
        cartPage.validateCartPage();
    }
}
