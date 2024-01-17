package hellocucumber.steps;

import hellocucumber.pageobject.CartPage;
import hellocucumber.pageobject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    WebDriver driver = CucumberHooks.getDriver();
    CartPage cartPage = new CartPage(driver);
}
