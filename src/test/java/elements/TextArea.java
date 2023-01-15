package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElement{

    private final static String TEXTAREA_LOCATOR = "//label[text()='%s']//following-sibling::div";


    public TextArea(WebDriver driver, String label) {
        super(driver, label);
        this.label = label;

    }
    public void setValue(String value) {
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.label)));
        scrollIntoView(textArea);
        textArea.sendKeys(value);
    }
}
