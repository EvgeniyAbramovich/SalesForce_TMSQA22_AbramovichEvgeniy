package tests;

import enums.*;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest {

    @Test
    public void positiveLeadsTest() {


        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.openLeadsTab();
        leadsPage.clickNewButton();

        Lead testLead = new Lead.LeadBuilder("Evgeniy Abramovich").setCompany("QA22").
                setPhone("+37529596099").setEmail("tinkerbox@yandex.by").setTitle("engineer").setStreet("Molodezhnaya").
                setWebsite("salesforce.com").setCity("Novopolotsk").setState("Vitebsk").setPostalCode("211446").
                setCountry("Belarus").setNoOfEmployees("10").setAnnualRevenue("10000").setDescription("OK").
                setLeadStatus(LeadStatus.NEW).setRating(Rating.HOT).setSalutation(Salutation.MR).
                setLeadSource(LeadSource.ADVERTISEMENT).setIndustry(Industry.AGRICULTURE).build();
        newLeadModal.fillform(testLead);
        newLeadModal.clickSaveButton();
        Assert.assertEquals(leadDetailPage.getLeadDetails(), testLead);

    }
}
