package hellocucumber.pageobject;

import hellocucumber.constants.CartConstants;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By lista_items_cart = By.xpath(CartConstants.LISTA_ITEMS_CART);

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateCartPage() {
        Assertions.assertTrue(driver.findElement(lista_items_cart).isDisplayed());
    }
}
