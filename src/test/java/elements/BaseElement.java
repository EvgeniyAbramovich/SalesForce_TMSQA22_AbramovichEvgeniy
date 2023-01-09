package elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
    protected static WebDriver driver;

    protected BaseElement(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
    }


}
