package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void clickLoginButton() {

        driver.findElement(LOGIN_BUTTON).click();
    }

    public void setUsername (String username) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
    }

    public void setPassword (String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }



}
