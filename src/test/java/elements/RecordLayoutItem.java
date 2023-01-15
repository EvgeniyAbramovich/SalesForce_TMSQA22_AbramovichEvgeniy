package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecordLayoutItem extends BaseElement{

    private final static String DETAILS_LOCATOR = "//*[contains(@class, 'slds-show')]//span[text()='%s']" +
            "/ancestor::records-record-layout-item//*[@data-output-element-id='output-field']";

    public RecordLayoutItem(WebDriver driver, String label) {
        super(driver, label);
        this.label = label;
    }

    public String getValue(){
        WebElement details = driver.findElement(By.xpath(String.format(DETAILS_LOCATOR, this.label)));
        scrollIntoView(details);
        return details.getText();
    }
}
