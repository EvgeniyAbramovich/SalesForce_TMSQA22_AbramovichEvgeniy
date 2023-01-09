package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseElement{

    private String name;
    private final static String INPUT_LOCATOR = "//input[@name='%s']";


    protected DropDown(WebDriver driver) {
        super(driver);
    }
}
