package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static homepage.HomePageWebElement.*;
//import static homepage.HomePageWebElement.findTextLocator;

public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.ID, using =deltaTitle ) public WebElement searchTitle;
    @FindBy (how = How.XPATH, using =bookText) public WebElement searchBookText;
    @FindBy (how = How.XPATH, using =loginPasswordNameBox) public WebElement sendPassword;
    @FindBy (how = How.XPATH, using =mouseOverCheck) public WebElement mouseOverMenu;
    @FindBy (how = How.XPATH, using =searchACarLocatorCity) public WebElement city;

    //@FindBy (how = How.XPATH, using =searchBoxCheck) public WebElement searchBox;

    @FindBy (how = How.XPATH, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;


    // Action Method

    public void searchTitle() throws InterruptedException {
        // Enter productName
        Thread.sleep(3000);
        // Click on searchButton

    }

    public void searchBook() throws InterruptedException {
        clickByXpath(bookLocator);
        sleepFor(3);

    }

    public void LoginPage() throws InterruptedException {
       clickByXpath(loginButton);
       sleepFor(3);
       typeByCss(loginUserNameBox,"abu nabi");
       sleepFor(3);
       sendPassword.sendKeys("123456");
       sleepFor(3);
       clickByXpath(loginButtonClick);
       sleepFor(3);
    }

    public void websiteFeedback() throws InterruptedException {
       scrollToBottom();
       sleepFor(3);
       clickByXpath(clickWebsiteFeedback);
       sleepFor(3);
    }

    public void mouseOverTravelInfo() throws InterruptedException {
        WebElement l=driver.findElement(By.xpath("//a[@id='headSectab1']"));
        Actions a = new Actions(driver);
        sleepFor(3);
        a.moveToElement(mouseOverMenu).perform();
        sleepFor(3);
        System.out.println("Travel Info: "+ mouseOverMenu.getText());
    }

    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(searchName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();
    }

    public void rentACar() throws InterruptedException, IOException {
      mouseHoverByCSS(travelInfo);
      sleepFor(3);
      clickByXpath(rentACarLocator);
      sleepFor(3);
      takeScreenShot();
    }
    public void searchACar() throws InterruptedException, IOException {
        mouseHoverByCSS(travelInfo);
        sleepFor(3);
        clickByXpath(rentACarLocator);
        sleepFor(3);
        clickByXpath(advancedSearchLocator);
        sleepFor(3);
        navigateBack();
        sleepFor(3);
    }

    //Booking Air Ticket
    @FindBy (how = How.XPATH, using =selectRoundTripLocator ) public WebElement selectRoundTrip;
    public void bookingAirTicket() throws InterruptedException, IOException {
        clickByXpath(fromAirportLocator);
        sleepFor(3);
        typeByXpath(originLocator,"LAX");
        sleepFor(3);
        clickByXpath(originAirportLocator);
        sleepFor(3);
        clickByXpath(toAirportLocator);
        sleepFor(3);
        typeByXpath(destinationLocator,"NYC");
        sleepFor(3);
        clickByXpath(destinationCityLocator);
        sleepFor(3);
        clickByXpath(roundTripLocator);
        sleepFor(3);
        clickByXpath(selectRoundTripLocator);
        sleepFor(3);
        clickByXpath(departLocator);
        sleepFor(3);
        clickByXpath(monthSelector1Locator);
        sleepFor(3);
        clickByXpath(monthSelector2Locator);
        sleepFor(3);
        clickByXpath(departDateLocator);
        sleepFor(3);
        clickByXpath(departDateDoneLocator);
        sleepFor(3);
        clickByXpath(returnLocator);
        sleepFor(3);
        clickByXpath(returnDateLocator);
        sleepFor(3);
        clickByXpath(returnDateDoneLocator);
        sleepFor(3);
        clickByXpath(goPassengerLocator);
        sleepFor(3);
        clickByXpath(selectPassengerLocator);
        sleepFor(3);
        clickByXpath(bookSubmitButtonLocator);
        sleepFor(3);
    }
        //checkIn
        @FindBy (how = How.XPATH, using =inputConfirmationNumberLocator) public WebElement inputConfirmationTab;
        @FindBy (how = How.XPATH, using =inputConfirmationNumberPrimaryPanelLocator) public WebElement inputConfirmationNumberPrimaryPanelTab;
    public void checkIn() throws InterruptedException, IOException {
        clickByLinkText(checkInLocator);
        sleepFor(3);
        clickByXpath(findYourTripByLocator);
        sleepFor(3);
        clickByXpath(confirmationNumberLocator);
        sleepFor(3);
        clickByXpath(inputConfirmationNumberLocator);
        sleepFor(3);
        typeByXpath(inputConfirmationNumberLocator,"12345678");
        sleepFor(3);
        inputConfirmationTab.sendKeys(Keys.TAB);
        sleepFor(3);
        inputConfirmationNumberPrimaryPanelTab.sendKeys(Keys.TAB);
        sleepFor(3);
        clickByXpath(departureAirportLinkLocator);
        sleepFor(3);
        typeByXpath(searchInputAirportLocator,"NYC");
        sleepFor(3);
        clickByXpath(searchInputAirportPanelLocator);
        sleepFor(3);
        clickByXpath(checkInSubmissionButtonLocator);
        sleepFor(3);

    }

    public void myTrips() throws InterruptedException, IOException {
        clickByLinkText(myTripsLocator);
        sleepFor(3);
        clickByLinkText(hotelReservationLocator);
        sleepFor(3);
        typeByXpath(putConfirmationNumberLocator,"12345678");
        sleepFor(3);
        typeByXpath(putConfirmationLastNameLocator,"Nabi");
        sleepFor(3);
        clickByXpath(findBookingButtonLocator);
        sleepFor(3);

    }

    @FindBy (how = How.XPATH, using =putFlightNumberLocator) public WebElement flightNumberTab;
    public void flightStatus() throws InterruptedException, IOException {
        clickByLinkText(flightStatusLocator);
        sleepFor(3);
        clickByXpath(inputDepartureDateLocator);
        sleepFor(3);
        clickByXpath(putDepartureDateLocator);
        sleepFor(3);
        clickByXpath(putDepartureDateDoneLocator);
        sleepFor(3);
        typeByXpath(putFlightNumberLocator,"1049");
        flightNumberTab.sendKeys(Keys.TAB);
        sleepFor(3);
        clickByXpath(fromDepartCityLinkLocator);
        sleepFor(3);
        typeByXpath(fromDepartCityLinkPutCityLocator,"LAX");
        clickByXpath(fromDepartCityLinkPutCityPickLocator);
        sleepFor(3);
        clickByXpath(toCityLinkPutCityLocator);
        sleepFor(3);
        typeByXpath(toCityLinkPutCityInputLocator,"NYC");
        sleepFor(3);
        clickByXpath(toCityLinkPutCityPickLocator);
        sleepFor(3);
        clickByXpath(flightStatusSubmitButtonLocator);
        sleepFor(3);
    }

    public void skyMiles() throws InterruptedException, IOException {
        mouseHoverByCSS(skyMilesLocator);
        sleepFor(3);
        clickByLinkText(howToEarnMilesLocator);
        sleepFor(3);
        clickByXpath(earnMilesTravelLocator);
        sleepFor(3);

    }
    @FindBy (how = How.XPATH, using =findHomePageTextLocator) public WebElement homePageText;
    public void homePageFindText() throws InterruptedException, IOException {
        clickByXpath(findHomePageTextLocator);
        sleepFor(3);
        System.out.println("Found Text  :"+homePageText.getText());
        sleepFor(3);
    }

    public void customerCommitment() throws InterruptedException, IOException {
        scrollToBottom();
        clickByXpath(customerCommitmentLocator);
        sleepFor(3);

    }
    public void deltaDiscoverMap() throws InterruptedException, IOException {
        clickByXpath(deltaDiscoverMapLocator);
        sleepFor(3);
    }

    public void vacationDeals() throws InterruptedException, IOException {
        clickByXpath(vacationDealsLocator);
        sleepFor(3);
    }
    public void needHelp() throws InterruptedException, IOException {
        mouseHoverByCSS(needHelpLocator);
        sleepFor(3);
        clickByLinkText(refundHelpLocator);
        sleepFor(3);
    }

    public void skyTeam() throws InterruptedException, IOException {
       clickByCss(skyTeamLocator);
       sleepFor(3);
       clickByXpath(skyTeamClickLocator);
       sleepFor(3);
    }
    public void shopWithMiles() throws InterruptedException, IOException {
        clickByXpath(shopWithMilesLocator);
        sleepFor(3);
        clickByXpath(advSearchLocator);
        sleepFor(3);
    }

    public void nearByAirport() throws InterruptedException, IOException {
        shopWithMiles();
        clickByXpath(nearByAirportLocator);
        sleepFor(3);
        clickByXpath(dropDownLocator);
        sleepFor(3);
        clickByXpath(basicEconomyLocator);
        sleepFor(3);
        clickByXpath(submitButtonLocator);
        sleepFor(3);

    }
    public void refundableFares() throws InterruptedException, IOException {
        clickByXpath(refundableFaresLocator);
        sleepFor(3);
        clickByXpath(advSearchLocator);
        sleepFor(3);
    }
    public void mainCabin() throws InterruptedException, IOException {
        refundableFares();
        clickByXpath(nearByAirportLocator);
        sleepFor(3);
        clickByXpath(dropDownLocator);
        sleepFor(3);
        clickByXpath(mainCabinLocator);
        sleepFor(3);
        clickByXpath(submitButtonLocator);
        sleepFor(3);
    }
    public void travelAgent() throws InterruptedException, IOException {
       scrollToBottom();
       sleepFor(3);
       clickByXpath(travelAgentLocator);
       sleepFor(3);
    }
    public void bookingInformation() throws InterruptedException, IOException {
        scrollToBottom();
        sleepFor(3);
        clickByLinkText(bookingInformationLocator);
        sleepFor(3);
        clickByXpath(informationNavButtonLocator);
        sleepFor(3);

    }
    public void findingLowFare() throws InterruptedException, IOException {
        bookingInformation();
        clickByLinkText(faresDiscountsLocator);
        sleepFor(3);
        clickByXpath(findingLowFareLocator);
        sleepFor(3);
    }



}
