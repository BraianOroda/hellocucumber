package hellocucumber.pageobject;

import hellocucumber.constants.LoginContants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    By inputUserName = By.xpath(LoginContants.INPUT_USER_NAME);
    By inputPassword = By.xpath(LoginContants.INPUT_PASSWORD);
    By logginButton  = By.xpath(LoginContants.LOGGIN_BUTTOM);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void loginUser() {
        driver.findElement(inputUserName).sendKeys("standard_user");
        driver.findElement(inputPassword).sendKeys("secret_sauce");
        driver.findElement(logginButton).click();
    }
}
