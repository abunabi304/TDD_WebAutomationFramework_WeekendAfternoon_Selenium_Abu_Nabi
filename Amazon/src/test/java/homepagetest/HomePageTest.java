package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {
    // Test class
    HomePage homePage;
   // Registration registration;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
       // registration= PageFactory.initElements(driver,Registration.class);
    }

    //@Ignore
    @Test @Ignore
    public void testSearchBox() throws InterruptedException {
        //getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        // Verify expected vs Actual
        String expectedText="\"Mask\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
        driver.quit();
    }

    @Test @Ignore
    public void testSearchBox1() throws InterruptedException {
        homePage.searchBox();
        sleepFor(3);
        String expectedText="\"Mask1\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }
    @Test(enabled = false)
    public void testNewRelease() throws InterruptedException {
        homePage.newRelease();
        String expectedTitle= "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testFindText() throws InterruptedException {
        homePage.findText();
        String expectedTitle= "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testLinkText() throws InterruptedException {
        homePage.linkText();
        String expectedTitle= "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testLinkTextClick() throws InterruptedException {
        homePage.linkTextClick();
        String expectedTitle= "Amazon.com New Releases: The best-selling new & future releases in Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testSelectBookHowToDoTheWork() throws InterruptedException {
        homePage.selectBookHowToDoTheWork();
        String expectedTitle= "How to Do the Work: Recognize Your Patterns, Heal from Your Past, and Create Your Self: LePera, Dr. Nicole: 9780063012097: Amazon.com: Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testLookInsideBook() throws InterruptedException {
        homePage.lookInsideBook();
        String expectedTitle= "How to Do the Work: Recognize Your Patterns, Heal from Your Past, and Create Your Self: LePera, Dr. Nicole: 9780063012097: Amazon.com: Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testRightPageTurner() throws InterruptedException {
        homePage.rightPageTurner();
        String expectedTitle= "How to Do the Work: Recognize Your Patterns, Heal from Your Past, and Create Your Self: LePera, Dr. Nicole: 9780063012097: Amazon.com: Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testAgainRightPageTurner() throws InterruptedException {
        homePage.againRightPageTurner();
        String expectedTitle= "How to Do the Work: Recognize Your Patterns, Heal from Your Past, and Create Your Self: LePera, Dr. Nicole: 9780063012097: Amazon.com: Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testReadingBookScreenShot() throws InterruptedException, IOException {
        homePage.readingBookScreenShot();
        String expectedTitle= "How to Do the Work: Recognize Your Patterns, Heal from Your Past, and Create Your Self: LePera, Dr. Nicole: 9780063012097: Amazon.com: Books";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testFooterLink() throws InterruptedException, IOException {
        homePage.footerLink();
        String expectedTitle= "Amazon.com Help: Conditions of Use";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testSearchPrivacy() throws InterruptedException, IOException {
        homePage.searchPrivacy();
        String expectedTitle= "Amazon.com Help: Conditions of Use";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testPrivacyTerms() throws InterruptedException, IOException {
        homePage.privacyTerms();
        String expectedTitle= "Amazon.com Help: Privacy Terms";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testLanguageChange() throws InterruptedException, IOException {
        homePage.languageChange();
        String expectedTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testReturnsOrders() throws InterruptedException, IOException {
        homePage.returnsOrders();
        String expectedTitle= "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testGiftCards() throws InterruptedException, IOException {
        homePage.giftCards();
        String expectedTitle= "Amazon.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testBestSeller() throws InterruptedException, IOException {
        homePage.bestSeller();
        String expectedTitle= "Amazon Best Sellers: Best Birthday";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testHappyBirthday() throws InterruptedException, IOException {
        homePage.happyBirthday();
        String expectedTitle= "Amazon.com: Amazon eGift Card - Birthday Cupcakes: Gift Cards";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testUploadImage() throws InterruptedException, IOException {
        homePage.uploadImage();
        String expectedTitle= "Amazon.com: Amazon eGift Card - Birthday Cupcakes: Gift Cards";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testCustomerService() throws InterruptedException {
        homePage.customerService();

    }
    @Test @Ignore
    public void testFashion() throws InterruptedException {
        homePage.fashion();
        String expectedTitle= "Amazon Fashion - Amazon.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testFashionMen() throws InterruptedException {
        homePage.fashionMen();
        String expectedTitle= "Amazon Fashion - Amazon.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test  @Ignore
    public void testFashionRed() throws InterruptedException, IOException {
       homePage.fashionRed();

    }
    @Test @Ignore
    public void helloSignIn() throws InterruptedException, IOException {
       homePage.helloSignIn();
       String expectedTitle= "Amazon Sign-In";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle,expectedTitle, "Page Title not found");

    }
    @Test
    public void testFashionRed1() throws InterruptedException, IOException {
       homePage.fashionRed1();

    }










}
