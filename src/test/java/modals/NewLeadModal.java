package modals;

import elements.Input;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NewLeadModal extends BaseModal{

    public void fillform(String firstName, String lastName, int phone, String companyName, String email, String title,
                         String website, String cityName, String stateName, int postalCode, String countryName,
                         int numberOfEmployees, int annualRevenue){
        new Input(driver,"firstName").setValue(firstName);
        new Input(driver,"lastName").setValue(lastName);
        new Input(driver,"Phone").setValue(String.valueOf(phone));
        new Input(driver,"Company").setValue(companyName);
        new Input(driver,"Email").setValue(email);
        new Input(driver,"Title").setValue(title);
        new Input(driver,"Website").setValue(website);
        new Input(driver,"city").setValue(cityName);
        new Input(driver,"province").setValue(stateName);
        new Input(driver,"postalCode").setValue(String.valueOf(postalCode));
        new Input(driver,"country").setValue(countryName);
        new Input(driver,"NumberOfEmployees").setValue(String.valueOf(numberOfEmployees));
        new Input(driver,"AnnualRevenue").setValue(String.valueOf(annualRevenue));

    }
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }


}
