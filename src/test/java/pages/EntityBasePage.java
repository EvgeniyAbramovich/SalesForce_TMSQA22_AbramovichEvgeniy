package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EntityBasePage extends HomePage{
    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");


    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    public void clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();

    }
}
