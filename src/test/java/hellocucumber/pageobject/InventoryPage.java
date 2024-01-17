package hellocucumber.pageobject;

import hellocucumber.constants.InventoryConstants;
import hellocucumber.constants.LoginContants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.junit.jupiter.api.Assertions;

import static hellocucumber.steps.CucumberHooks.getDriver;

public class InventoryPage {
    WebDriver driver;
    By listItems = By.xpath(InventoryConstants.LIST_ITEMS);
    By burgerMenu = By.xpath(InventoryConstants.BURGER_MENU);
    By logoutLink = By.xpath(InventoryConstants.LOGOUT_LINK);
    By error_title_locked_user = By.xpath(LoginContants.ERROR_TITLE_LOCKED_USER);
    By list_inventory_items = By.xpath(InventoryConstants.LIST_INVENTORY_ITEMS);
    By button_add_to_cart = By.xpath(InventoryConstants.BUTTON_ADD_TO_CART);
    By shopping_cart = By.xpath(InventoryConstants.SHOPPING_CART_CONTAINER);

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getItems() {
        List<WebElement> listaItems = driver.findElements(listItems);
        Assertions.assertNotEquals(0, listaItems.size());
        System.out.println("La cantidad de items obtenida es: " + listaItems.size());
    }

    public void validateScrenUsername(String username) {
        if (username.equalsIgnoreCase("locked_out_user")) {
            String errorTitleStr = driver.findElement(error_title_locked_user).getText();
            Assertions.assertTrue(errorTitleStr.contains(LoginContants.STRING_ERROR_TITLE_LOCKED_USER));
        } else {
            getItems();
        }
    }

    public void logOut(){
        driver.findElement(burgerMenu).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        driver.findElement(logoutLink).click();
    }

    public void selectProduct(String product) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(shopping_cart));
        List<WebElement> item_list = driver.findElements(list_inventory_items);
        for (WebElement item : item_list) {
            WebElement itemName = item.findElement(By.className("inventory_item_name"));
            if(product.equalsIgnoreCase(itemName.getText())) {
                System.out.println("El nombre del item es: " + itemName.getText());
                WebElement addCartButton = item.findElement(By.tagName("button"));
                addCartButton.click();
            }
        }
    }

    public void selectShoppingCart() {
        driver.findElement(shopping_cart).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("cart"));
    }
}
