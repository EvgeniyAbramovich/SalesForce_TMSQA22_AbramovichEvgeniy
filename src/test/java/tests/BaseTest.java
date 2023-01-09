package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import modals.NewLeadModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected final static String BASE_URL = "https://qa22-c.lightning.force.com/";
    protected final static String USERNAME = "tinkerbox-wt58@force.com";
    protected final static String PASSWORD = "Tinker89Ggg123";

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadDetailPage leadDetailPage;
    protected NewLeadModal newLeadModal;
    protected EntityBasePage entityBasePage;

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadDetailPage = new LeadDetailPage(driver);
        newLeadModal = new NewLeadModal(driver);
        entityBasePage = new EntityBasePage(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

