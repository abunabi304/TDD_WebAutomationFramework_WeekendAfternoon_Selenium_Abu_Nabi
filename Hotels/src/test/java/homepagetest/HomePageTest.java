package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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

    //public void VerifyHomePageTitle() throws InterruptedException {

        //String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        //String actualTitle = driver.getTitle();
        //String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    //}
    @Test(enabled = false)
    public void testClickDealMenu() throws InterruptedException {
        homePage.clickDealMenu();
        String expectedTitle = "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }

    @Test @Ignore
    public void hotelDealFinder() throws InterruptedException {
        homePage.hotelDealFinder();
        String expectedTitle = "Hotels.com - hotels in Las Vegas, Nevada, United States of America";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testThingsToDo() throws InterruptedException {
        homePage.thingsToDo();
        String expectedTitle = "Vacation Packages: Find Cheap Trips, Deals & Vacations | Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testSearchThingsToDo() throws InterruptedException {
        homePage.searchThingsToDo();
        String expectedTitle = "Vacation Packages: Find Cheap Trips, Deals & Vacations | Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testGlobalSites() throws InterruptedException {
        homePage.globalSites();
        String expectedTitle = "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }

    @Test @Ignore
    public void testVacationRentals() throws InterruptedException {
        homePage.vacationRentals();
        String expectedTitle = "Vacation rentals: Condos, Apartments, Cabins & more - Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test @Ignore
    public void testCarRental() throws InterruptedException {
        homePage.carRental();
        String expectedTitle = "Car Hire | Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test(enabled = false)
    public void testPackagesFlights() throws InterruptedException {
        homePage.packagesFlights();
        String expectedTitle = "Vacation Packages: Find Cheap Trips, Deals & Vacations | Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test(enabled = false)
    public void testGroupsMeetings() throws InterruptedException {
        homePage.groupsMeetings();
        String expectedTitle = "Group Hotel Quote Request";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }

    @Test @Ignore
    public void testGiftCards() throws InterruptedException {
        homePage.giftCards();
        String expectedTitle = "Hotels.com - Buy Hotel Gift Cards Online!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testListYourProperty() throws InterruptedException {
        homePage.listYourProperty();
        String expectedTitle = "How to list your property on Hotels.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }

    @Test @Ignore
    public void testHotelsRewards() throws InterruptedException {
        homePage.hotelsRewards();
        String expectedTitle = "Hotels.com® Rewards – Get Free* Nights & Secret Prices";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }
    @Test(enabled = false)
    public void testHotelsCreditCard() throws InterruptedException {
        homePage.hotelsCreditCard();
        String expectedTitle = "Hotels.com rewards credit card – Unlock way more nights!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test @Ignore
    public void testGetHomePagePara() throws InterruptedException {
        homePage.getHomePagePara();
    }
    @Test @Ignore
    public void testGetLinkLasVegas() throws InterruptedException {
       homePage.getLinkLasVegas();
    }

    @Test(enabled = false)
    public void testManageBookingIframe() throws InterruptedException {
        homePage.manageBookingIframe();
    }
    @Test @Ignore
    public void testGetTime() throws InterruptedException {
        homePage.getTime();
    }

    @Test @Ignore
    public void testWhereTo() throws InterruptedException {
        homePage.whereTo();
    }
    @Test(enabled = false)
    public void testFindUrl() throws InterruptedException {
        homePage.findUrl();
    }
    @Test @Ignore
    public void testSelectCurrency() throws InterruptedException {
        homePage.selectCurrency();
    }

    @Test @Ignore
    public void testClearWhereTo() throws InterruptedException {
        homePage.clearWhereTo();
    }

    @Test(enabled = false)
    public void testClearPopUp() throws InterruptedException {
       homePage.clearPopUp();
    }
    @Test @Ignore
    public void testSignInCheck() throws InterruptedException {
       homePage.signInCheck();
        String expectedTitle = "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test(enabled = false)
    public void testYourBooking() throws InterruptedException {
        homePage.yourBooking();
        String expectedTitle = "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");
    }
    @Test
    public void testHelpMenu() throws InterruptedException {
        homePage.helpMenu();
        homePage.yourBooking();
        String expectedTitle = "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page Title not found");

    }

}
