package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final static By USER_ICON = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Leads']");
    private final static By ACCOUNTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Accounts']");
    private final static By CONTACTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Contacts']");
    private final static By OPPORTUNITIES_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Opportunities']");
    private final static By CASES_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Cases']");
    private final static By TASKS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Tasks']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_MENU_TAB_LOCATOR));
    }

    public void openAccountsTab() {
        jsClick(driver.findElement(ACCOUNTS_MENU_TAB_LOCATOR));
    }

    public void openContactsTab() {
        jsClick(driver.findElement(CONTACTS_MENU_TAB_LOCATOR));
    }

    public void openOpportunitiesTab() {
        jsClick(driver.findElement(OPPORTUNITIES_MENU_TAB_LOCATOR));
    }

    public void openCasesTab() {
        jsClick(driver.findElement(CASES_MENU_TAB_LOCATOR));
    }

    public void openTasksTab() {
        jsClick(driver.findElement(TASKS_MENU_TAB_LOCATOR));
    }

    public void waitForUserAvatarDisplayed() {
        waitForElementDisplayed(USER_ICON);

    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON).isDisplayed();
    }
}
