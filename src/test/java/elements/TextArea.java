package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElement {
    private String name;
    private final static String TEXT_AREA_LOCATOR = "//label[text()='%s']//following-sibling::div";


    public TextArea(WebDriver driver, String name) {
        super(driver);
        this.name = name;
    }

    public void setValue(String value) {
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXT_AREA_LOCATOR, this.name)));
        scrollIntoView(textArea);
        textArea.sendKeys(value);
    }
}
