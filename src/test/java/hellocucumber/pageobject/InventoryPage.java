package hellocucumber.pageobject;

import hellocucumber.constants.InventoryConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static hellocucumber.steps.CucumberHooks.getDriver;

public class InventoryPage {
    WebDriver driver;
    By listItems = By.xpath(InventoryConstants.LIST_ITEMS);
    By burgerMenu = By.xpath(InventoryConstants.BURGER_MENU);
    By logoutLink = By.xpath(InventoryConstants.LOGOUT_LINK);

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getItems() {
        List<WebElement> listaItems = driver.findElements(listItems);
        assert listaItems.size() > 0;
        System.out.println("La cantidad de items obtenida es: " + listaItems.size());
    }

    public void logOut(){
        driver.findElement(burgerMenu).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        driver.findElement(logoutLink).click();
    }
}
