package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class HomePageTest extends WebAPI {
    // Test class
    HomePage homePage;
    // Registration registration;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        // registration= PageFactory.initElements(driver,Registration.class);
    }

    @Test @Ignore

    public void testGoGetCoverage() throws InterruptedException {
        homePage.goGetCoverage();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title not found");
    }

    @Test @Ignore
    public void testGoLanguage() throws InterruptedException {
        homePage.goLanguage();
        String expectedTitle = "Obtenga ahora la cobertura médica para el 2021. | Mercado de Seguros Médicos | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title not found");

    }

    @Test (enabled = false)
    public void testLogIn() throws InterruptedException {
        homePage.loginCheck();
        String expectedTitle = "Obtenga ahora la cobertura médica para el 2021. | Mercado de Seguros Médicos | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testSeeTopicsMouseOver() throws InterruptedException {
       homePage.seeTopicsMouseOver();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testSeeTopicsDentalCoverage() throws InterruptedException {
        homePage.seeTopicsDentalCoverage();
        String expectedTitle = "Dental Coverage in the Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testPrintDentalCoveragePage() throws InterruptedException {
        homePage.printDentalCoveragePage();
        String expectedTitle = "Dental Coverage in the Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testSearchHealthWord() throws InterruptedException {
        homePage.searchHealthWord();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testCoverageApply() throws InterruptedException {
        homePage.coverageApply();
        String expectedTitle = "Health Insurance Marketplace for Individuals | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testCoverageApplyCreateAccount() throws InterruptedException {
        homePage.coverageApplyCreateAccount();
        String expectedTitle = "Covered California™ | The Official Site of California's Health Insurance Marketplace";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testHomepageScrollDown() throws InterruptedException {
        homePage.homepageScrollDown();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testHomepageScrollUP() throws InterruptedException {
        homePage.homepageScrollUP();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testFindLocalHelp() throws InterruptedException {
        homePage.findLocalHelp();
        String expectedTitle = "Search - Local Assistance for Health Insurance Application";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testGoWhiteHouse() throws InterruptedException {
        homePage.goWhiteHouse();
        String expectedTitle = "The White House";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testGetAnswer() throws InterruptedException {
        homePage.getAnswer();
        String expectedTitle = "Get Health Insurance Answers from Healthcare.gov Marketplace | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testGetAnswer2021Coverage() throws InterruptedException {
        homePage.getAnswer2021Coverage();
        String expectedTitle = "Get Health Insurance Answers from Healthcare.gov Marketplace | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testSignUp() throws InterruptedException {
        homePage.signUp();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test(enabled = false)
    public void testGetAddress() throws InterruptedException {
        homePage.getAddress();
        String expectedTitle = "Contact Us | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testGoUSGovt() throws InterruptedException {
        homePage.goUSGovt();
        String expectedTitle = "Official Guide to Government Information and Services | USAGov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testGoPrintPage() throws InterruptedException {
        homePage.goPrintPage();
        String expectedTitle = "Things to know before picking a health insurance plan | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testGetTips() throws InterruptedException {
        homePage.getTips();
        String expectedTitle = "Official Health Insurance Guide | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test(enabled = false)
    public void testLearnMore() throws InterruptedException {
        homePage.learnMore();
        String expectedTitle = "Marketplace Coverage & Coronavirus | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testLearnMoreEndLink() throws InterruptedException {
        homePage.learnMoreEndLink();
        String expectedTitle = "Health Insurance Marketplace for Individuals | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testHomepageRightClick() throws InterruptedException {
        homePage.homepageRightClick();
        String expectedTitle = "Get 2021 health coverage. Health Insurance Marketplace® | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testHealthCareBlog() throws InterruptedException {
        homePage.healthCareBlog();
        String expectedTitle = "March 2021 | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testLanguageResource() throws InterruptedException {
        homePage.languageResource();
        String expectedTitle = "Other Language Resources | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test
    public void testLanguageResourceClick() throws InterruptedException {
        homePage.languageResourceClick();
        String expectedTitle = "Other Language Resources | HealthCare.gov";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }


}



