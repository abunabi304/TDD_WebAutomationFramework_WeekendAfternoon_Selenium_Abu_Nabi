package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import homepage.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import homepage.Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static homepage.HomePageWebElement.*;
import static homepage.HomePageWebElement.signInSubmitLocator;

public class HomePageTest extends WebAPI {
    // Test class
    HomePage homePage;
   // Registration registration;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
       // registration= PageFactory.initElements(driver,Registration.class);
    }
    @Test @Ignore
    public void VerifyHomePageTitle() throws InterruptedException {
        String expectedTitle= homePage.getTitle();
        String actualTitle = homePage.searchTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }

    @Test(enabled = false)
    public void testCreditCardsMenu() throws InterruptedException {
        homePage.creditCardsMenu();
        String expectedTitle= "Explore Credit Cards & Apply Online | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testClickApplyCredit() throws InterruptedException {
        homePage.clickApplyCredit();
        String expectedTitle= "Apply for a Capital One Card";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test(enabled = false)
    public void testCreditCardsHover() throws InterruptedException {
        homePage.creditCardsHover();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testCheckingSavings() throws InterruptedException {
        homePage.checkingSavings();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test(enabled = false)
    public void testInputBoxCheck() throws InterruptedException {
       homePage.inputBoxCheck();
        String expectedTitle= "Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test(enabled = false)
    public void testFindHomepageText() throws InterruptedException {
        homePage.findHomepageText();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSearchBox() throws InterruptedException {
        homePage.searchBox();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testSearchBoxText() throws InterruptedException {
        homePage.searchBoxText();
        String expectedTitle= "Search Results | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }

    @Test @Ignore
    public void testBusiness() throws InterruptedException {
        homePage.business();
        String expectedTitle= "Small Business Banking | Open a Business Bank Account";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testCommercialMenu() throws InterruptedException {
        homePage.commercialMenu();
        String expectedTitle= "Capital One Commercial Banking, Finance, and Investments";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testSignInMenu() throws InterruptedException {
        homePage.signInMenu();
        String expectedTitle= "Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testSignInClick() throws InterruptedException {
        homePage.signInClick();
        String expectedTitle= "Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSignInRememberMe() throws InterruptedException {
        homePage.signInRememberMe();
        String expectedTitle= "Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSupportClick() throws InterruptedException {
        homePage.supportClick();
        String expectedTitle= "Support Center Search Results";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSearchLocation() throws InterruptedException, IOException {
        homePage.searchLocation();
        String expectedTitle= "Capital One Locations Finder | Atms, Branches, Cafes";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testLearnGrow() throws InterruptedException, IOException {
        homePage.learnGrow();
        String expectedTitle= "Learn & Grow | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testAutoLoan() throws InterruptedException, IOException {
        homePage.autoLoan();
        String expectedTitle= "Auto Loan Calculator - Estimate Your Payments | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testAutoLoanCal() throws InterruptedException, IOException {
        homePage.autoLoanCal();
        String expectedTitle= "Auto Loan Calculator - Estimate Your Payments | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testFooterTwit() throws InterruptedException, IOException {
        homePage.footerTwit();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testFooterContact() throws InterruptedException, IOException {
        homePage.footerContact();
        String expectedTitle= "Contact Us | Support Center";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testFooterContactTwoLinks() throws InterruptedException, IOException {
        homePage.footerContactTwoLinks();
        String expectedTitle= "Mail Credit Card Payment | Support Center";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testOnlineAccess() throws InterruptedException, IOException {
        homePage.onlineAccess();
        String expectedTitle= "Capital One Enrollment";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testNeedHelp() throws InterruptedException, IOException {
        homePage.needHelp();
        String expectedTitle= "Capital One Enrollment";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testChattingForm() throws InterruptedException, IOException {
        homePage.chattingForm();
    }
    @Test(enabled = false)
    public void testSelectOption() throws InterruptedException, IOException {
        homePage.selectOption();

    }
    @Test(enabled = false)
    public void testPrivacyLink() throws InterruptedException, IOException {
        homePage.privacyLink();
        String expectedTitle= "Privacy Protections | Capital One";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testFindText() throws InterruptedException, IOException {
        homePage.findText();
        String expectedTitle= "Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
//    @Test @Ignore
//    public class LoginTest  {
//    Login.login();
//        String expectedTitle= "Sign In";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
//
//    }

}
