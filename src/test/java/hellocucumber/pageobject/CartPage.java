package hellocucumber.pageobject;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    @And("The user will see the cart screen with their items")
    public void theUserWillSeeTheCartScreenWithTheirItems() {
    }
}
