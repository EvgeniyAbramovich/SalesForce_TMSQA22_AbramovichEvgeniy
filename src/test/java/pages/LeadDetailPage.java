package pages;

import elements.RecordLayoutItem;
import enums.*;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LeadDetailPage extends HomePage {

    private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']" +
            "/ancestor::button");

    public LeadDetailPage(WebDriver driver) {
        super(driver);
    }

    public Lead getLeadDetails() {
        Lead.LeadBuilder lead = new Lead.LeadBuilder(new RecordLayoutItem(driver, "Name").getValue());

        lead.setPhone(new RecordLayoutItem(driver,"Phone").getValue());
        lead.setCompany(new RecordLayoutItem(driver,"Company").getValue());
        lead.setPhone(new RecordLayoutItem(driver,"Phone").getValue());
        lead.setEmail(new RecordLayoutItem(driver,"Email").getValue());
        lead.setTitle(new RecordLayoutItem(driver,"Title").getValue());
        lead.setWebsite(new RecordLayoutItem(driver,"Website").getValue());
        lead.setNoOfEmployees(new RecordLayoutItem(driver,"No. of Employees").getValue());
        lead.setAnnualRevenue(new RecordLayoutItem(driver,"Annual Revenue").getValue());
        lead.setDescription(new RecordLayoutItem(driver,"Description").getValue());
        lead.setLeadStatus(LeadStatus.valueOf(Rating.fromString("New").getName()));
        lead.setRating(Rating.valueOf(Rating.fromString("Hot").getName()));
        lead.setSalutation(Salutation.valueOf(Salutation.fromString("Mr.").getName()));
        lead.setLeadSource(LeadSource.valueOf(LeadSource.fromString("Advertisement").getName()));
        lead.setIndustry(Industry.valueOf(Industry.fromString("Agriculture").getName()));

        return lead.build();
    }

    public void markStatusAsCompleteButtonClick() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",
                driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON));
    }





}
