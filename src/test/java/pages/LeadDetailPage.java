package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailPage extends HomePage {

    private final static By NAME_TEXT = By.xpath("//span[@id='window']");
    private final static By PHONE_NUMBER = By.xpath("(//a[@lightning-formattedphone_formattedphone])[3]");
    private final static By EMAIL = By.xpath("(//a[@data-aura-class='emailuiFormattedEmail'])[2]");
    private final static By COMPANY_NAME = By.xpath("(//lightning-formatted-text[@slot='outputField'])[2]");
    private final static By ADDRESS_NAME = By.xpath("(//a[@target='_blank'])[1]");
    private final static By WEBSITE_NAME = By.xpath("//lightning-formatted-url");
    private final static By NUMBER_OF_EMPLOYEES = By.xpath("//lightning-formatted-number");
    private final static By ANNUAL_REVENUE = By.xpath("(//lightning-formatted-text[@slot='outputField'])[6]");
    private final static By TITLE = By.xpath("(//lightning-formatted-text[@slot='outputField'])[3]");
    private final static By DESCRIPTION = By.xpath("(//lightning-formatted-text[@slot='outputField'])[8]");
    private final static By GREEN_TOAST_MESSAGE = By.cssSelector(".forceVisualMessageQueue");

    public LeadDetailPage(WebDriver driver) {
        super(driver);
    }

    public static String getName() {
        return driver.findElement(NAME_TEXT).getText();
    }

    public static String getPhone() {
        return driver.findElement(PHONE_NUMBER).getText();
    }

    public static String getEmail() {
        return driver.findElement(EMAIL).getText();
    }

    public static String getCompanyName() {
        return driver.findElement(COMPANY_NAME).getText();
    }

    public static String getAddressName() {
        return driver.findElement(ADDRESS_NAME).getText();
    }

    public static String getWebsiteName() {
        return driver.findElement(WEBSITE_NAME).getText();
    }

    public static String getNumberOfEmployees() {
        return driver.findElement(NUMBER_OF_EMPLOYEES).getText();
    }

    public static String getAnnualRevenue() {
        return driver.findElement(ANNUAL_REVENUE).getText();
    }

    public static String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    public static String getDescription() {
        return driver.findElement(DESCRIPTION).getText();
    }

    public boolean greenToastMessageIsPresent () {
        return driver.findElement(GREEN_TOAST_MESSAGE).isDisplayed();
    }



}
