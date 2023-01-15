package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseModal extends BasePage {

    private final static By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");
    private final static By SAVE_AND_NEW_BUTTON = By.xpath("//button[@name='SaveAndNew']");
    private final static By CANCEL_BUTTON = By.xpath("//button[@name='CancelEdit']");


    public BaseModal(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickSaveAndNewButton() {
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
    }

    public void clickCancelButton() {
        driver.findElement(CANCEL_BUTTON).click();
    }


}
