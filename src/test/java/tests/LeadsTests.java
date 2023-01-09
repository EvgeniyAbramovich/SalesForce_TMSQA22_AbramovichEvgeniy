package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest {

    @Test
    public void positiveLeadsTest() {
        String name = "Evgeniy Abramovich";
        int phone = +375-29-596-60-99;
        String companyName = "QA22";
        String email = "tinkerbox@yandex.by";
        String title = "engineer";
        String website = "salesforce.com";
        String addressName = "Novopolotsk, Vitebsk 211446 Belarus";
        int numberOfEmployees = 10;
        String annualRevenue = "$10,000";


        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.openLeadsTab();
        leadsPage.clickNewButton();

        newLeadModal.fillform("Evgeniy","Abramovich",+375-29-596-60-99,"QA22",
                "tinkerbox@yandex.by","engineer","salesforce.com","Novopolotsk",
                "Vitebsk",211446,"Belarus",10,10000);
        newLeadModal.clickSaveButton();
        Assert.assertTrue(leadDetailPage.greenToastMessageIsPresent());
        Assert.assertEquals(leadDetailPage.getName(), name);
        Assert.assertEquals(leadDetailPage.getPhone(), phone);
        Assert.assertEquals(leadDetailPage.getCompanyName(), companyName);
        Assert.assertEquals(leadDetailPage.getEmail(), email);
        Assert.assertEquals(leadDetailPage.getTitle(), title);
        Assert.assertEquals(leadDetailPage.getWebsiteName(), website);
        Assert.assertEquals(leadDetailPage.getAddressName(), addressName);
        Assert.assertEquals(leadDetailPage.getNumberOfEmployees(), numberOfEmployees);
        Assert.assertEquals(leadDetailPage.getAnnualRevenue(), annualRevenue);

    }
}
