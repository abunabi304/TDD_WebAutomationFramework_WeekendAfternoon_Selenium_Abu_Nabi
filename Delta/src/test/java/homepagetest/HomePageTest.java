package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {
    // Test class
    HomePage homePage;
   // Registration registration;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Test @Ignore
    public void VerifyHomePageTitle() throws InterruptedException {
        //homePage.searchTitle();
        //String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        //String actualTitle = homePage.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }


    @Test(enabled = false)
    public void testSearchBook() throws InterruptedException {
        homePage.searchBook();
        String expectedText= "THE DELTA CUSTOMER EXPERIENCE";
        String actualText = homePage.searchBookText.getText();
        Assert.assertEquals(actualText,expectedText,"Text Not Found");
    }
    @Test @Ignore
    public void testLoginPage() throws InterruptedException {
        homePage.LoginPage();
        String expectedTitle= "Login | Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test(enabled = false)
    public void testWebsiteFeedback() throws InterruptedException {
        homePage.websiteFeedback();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }

    @Test @Ignore
    public void testMouseOverTravelInfo() throws InterruptedException {
        homePage.mouseOverTravelInfo();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }


    @Test @Ignore
    public void testSearchBox() throws InterruptedException {
        homePage.searchBox();
        String expectedText="\"Los Angeles\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
        driver.quit();
    }

    @Test @Ignore
    public void testRentACar() throws InterruptedException, IOException {
       homePage.rentACar();
       String expectedTitle= "Car Search : Delta Air Lines";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSearchACar() throws InterruptedException, IOException {
       homePage.searchACar();
        String expectedTitle= "Car Search : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testBookingAirTicket() throws InterruptedException, IOException {
        homePage.bookingAirTicket();
        String expectedTitle= "Flight Results : Find & Book Airline Tickets : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testCheckIn() throws InterruptedException, IOException {
        homePage.checkIn();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testMyTrips() throws InterruptedException, IOException {
        homePage.myTrips();
        String expectedTitle= "Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testFlightStatus() throws InterruptedException, IOException {
        homePage.flightStatus();
        String expectedTitle= "Flight Schedules : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testSkyMiles() throws InterruptedException, IOException {
        homePage.skyMiles();
        String expectedTitle= "How to Earn Miles";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testHomePageFindText() throws InterruptedException, IOException {
        homePage.homePageFindText();
    }
    @Test(enabled = false)
    public void testCustomerCommitment() throws InterruptedException, IOException {
        homePage.customerCommitment();

    }
    @Test @Ignore
    public void testDeltaDiscoverMap() throws InterruptedException, IOException {
       homePage.deltaDiscoverMap();
    }
    @Test @Ignore
    public void testVacationDeals() throws InterruptedException, IOException {
       homePage.vacationDeals();
    }
    @Test @Ignore
    public void testNeedHelp() throws InterruptedException, IOException {
        homePage.needHelp();
        String expectedTitle= "Delta Cancellation & Refund Policy : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testSkyTeam() throws InterruptedException, IOException {
        homePage.skyTeam();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testShopWithMiles() throws InterruptedException, IOException {
        homePage.shopWithMiles();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }

    @Test @Ignore
    public void testNearByAirport() throws InterruptedException, IOException {
        homePage.nearByAirport();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test(enabled = false)
    public void testRefundableFares() throws InterruptedException, IOException {
        homePage.refundableFares();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");

    }
    @Test @Ignore
    public void testMainCabin() throws InterruptedException, IOException {
        homePage.mainCabin();
        String expectedTitle= "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test(enabled = false)
    public void testTravelAgent() throws InterruptedException, IOException {
        homePage.travelAgent();
        String expectedTitle= "AgencyMap";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test @Ignore
    public void testBookingInformation() throws InterruptedException, IOException {
        homePage.bookingInformation();
        String expectedTitle= "Booking Information : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }
    @Test
    public void testFindingLowFare() throws InterruptedException, IOException {
        homePage.findingLowFare();
        String expectedTitle= "Fares & Discounts : Delta Air Lines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title not found");
    }

}
