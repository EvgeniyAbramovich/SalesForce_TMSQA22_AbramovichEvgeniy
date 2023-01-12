package modals;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Lead;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NewLeadModal extends BaseModal{

    public void fillform(Lead lead){
        new Input(driver,"firstName").setValue(lead.getFirstName());
        new Input(driver,"lastName").setValue(lead.getLastName());
        new Input(driver,"Phone").setValue(String.valueOf(lead.getPhone()));
        new Input(driver,"Company").setValue(lead.getCompany());
        new Input(driver,"Email").setValue(lead.getEmail());
        new Input(driver,"Title").setValue(lead.getTitle());
        new Input(driver,"Website").setValue(lead.getWebsite());
        new Input(driver,"city").setValue(lead.getCity());
        new Input(driver,"state").setValue(lead.getState());
        new Input(driver,"postalCode").setValue(String.valueOf(lead.getPostalCode()));
        new Input(driver,"country").setValue(lead.getCountry());
        new Input(driver,"NumberOfEmployees").setValue(String.valueOf(lead.getNoOfEmployees()));
        new Input(driver,"AnnualRevenue").setValue(String.valueOf(lead.getAnnualRevenue()));
        new DropDown(driver,"Lead Status").selectValue("New");
        new DropDown(driver,"Rating").selectValue("Hot");
        new DropDown(driver,"Lead Source").selectValue("Advertisement");
        new DropDown(driver, "Industry").selectValue("Agriculture");
        new TextArea(driver,"Street").setValue(lead.getStreet());
        new TextArea(driver,"Description").setValue(lead.getDescription());






    }
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }


}
