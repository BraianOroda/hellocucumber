package pageobject;

import constants.HomeContants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By inputUserName = By.xpath(HomeContants.INPUT_USER_NAME);
    By inputPassword = By.xpath(HomeContants.INPUT_PASSWORD);
    By logginButton  = By.xpath(HomeContants.LOGGIN_BUTTOM);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void loginUser() {
        driver.findElement(inputUserName).sendKeys("standard_user");
        driver.findElement(inputPassword).sendKeys("secret_sauce");
        driver.findElement(logginButton).click();
    }
}
