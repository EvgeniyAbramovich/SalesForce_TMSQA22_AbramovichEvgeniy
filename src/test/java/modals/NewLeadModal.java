package modals;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Lead;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NewLeadModal extends BaseModal{


    public void fillform(Lead lead){
        new Input(driver,"First Name").setValue(lead.getFirstName());
        new Input(driver,"Last Name").setValue(lead.getLastName());
        new Input(driver,"Phone").setValue(String.valueOf(lead.getPhone()));
        new Input(driver,"Company").setValue(lead.getCompany());
        new Input(driver,"Email").setValue(lead.getEmail());
        new Input(driver,"Title").setValue(lead.getTitle());
        new Input(driver,"Website").setValue(lead.getWebsite());
        new Input(driver,"City").setValue(lead.getCity());
        new Input(driver,"State/Province").setValue(lead.getState());
        new Input(driver,"Zip/Postal Code").setValue(String.valueOf(lead.getPostalCode()));
        new Input(driver,"Country").setValue(lead.getCountry());
        new Input(driver,"No. of Employees").setValue(String.valueOf(lead.getNoOfEmployees()));
        new Input(driver,"Annual Revenue").setValue(String.valueOf(lead.getAnnualRevenue()));
        new DropDown(driver,"Lead Status").selectValue(lead.getLeadStatus().getName());
        new DropDown(driver,"Rating").selectValue(lead.getRating().getName());
        new DropDown(driver,"Salutation").selectValue(lead.getSalutation().getName());
        new DropDown(driver,"Lead Source").selectValue(lead.getLeadSource().getName());
        new DropDown(driver, "Industry").selectValue(lead.getIndustry().getName());
        new TextArea(driver,"Street").setValue(lead.getStreet());
        new TextArea(driver,"Description").setValue(lead.getDescription());

    }
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }


}
