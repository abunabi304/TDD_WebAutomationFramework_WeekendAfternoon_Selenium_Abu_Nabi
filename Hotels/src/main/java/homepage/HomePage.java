package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.html.HTMLInputElement;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.CSS, using =globalSitesLocator) public WebElement globalSites;
    @FindBy (how = How.XPATH, using =selectSiteLocator) public WebElement selectSite;
    @FindBy (how = How.LINK_TEXT, using =dealsLocator) public WebElement deals;
    @FindBy (how = How.XPATH, using =hotelDealsLocator) public WebElement hotelDeals;
    @FindBy (how = How.XPATH, using =checkInLocator) public WebElement checkIn;
    @FindBy (how = How.XPATH, using =selectCheckInDateLocator) public WebElement checkInDate;
    @FindBy (how = How.XPATH, using =selectCheckOutLocator) public WebElement checkOut;

    @FindBy (how = How.XPATH, using =selectCheckOutDateLocator) public WebElement checkOutDate;
    @FindBy (how = How.XPATH, using =selectRoomsLocator) public WebElement selectRoom;
    @FindBy (how = How.XPATH, using =selectAdultsLocator) public WebElement selectAdults;
    @FindBy (how = How.XPATH, using =selectChildrenLocator) public WebElement selectChildren;
    @FindBy (how = How.LINK_TEXT, using =showDealsLocator) public WebElement showDeals;
    @FindBy (how = How.LINK_TEXT, using =selectPlaceLocator) public WebElement selectPlace;

    @FindBy (how = How.LINK_TEXT, using =thingsToDoLocator) public WebElement thingsToDo;
    @FindBy (how = How.XPATH, using =searchThingsToDoLocator) public WebElement searchThingsToDo;
    @FindBy (how = How.XPATH, using =searchPlaceLocator) public WebElement searchPlace;
    @FindBy (how = How.XPATH, using =selectCityLocator) public WebElement selectCity;
    @FindBy (how = How.XPATH, using =choseSitePlaceLocator) public WebElement choseSite;
    @FindBy (how = How.LINK_TEXT, using =vacationRentalsLocator) public WebElement vacationRentals;
    @FindBy (how = How.LINK_TEXT, using =carRentalLocator) public WebElement carRental;
    @FindBy (how = How.LINK_TEXT, using =packagesFlightsLocator) public WebElement packagesFlights;
    @FindBy (how = How.LINK_TEXT, using =groupsMeetingsLocator) public WebElement groupsMeetings;
    @FindBy (how = How.LINK_TEXT, using =giftCardsLocator) public WebElement giftCards;
    @FindBy (how = How.LINK_TEXT, using =listYourPropertyLocator) public WebElement listYourProperty;
    @FindBy (how = How.LINK_TEXT, using =hotelsRewardsLocator) public WebElement hotelsRewards;
    @FindBy (how = How.XPATH, using =manageBookingIframeLocator) public WebElement manageBookingIframe;
    @FindBy (how = How.XPATH, using =popUpLocator) public WebElement popUp;

    //SignIn
    @FindBy (how = How.LINK_TEXT, using =signInLocator) public WebElement signIn;
    @FindBy (how = How.CSS, using =emailAddressLocator) public WebElement emailAddress;
    @FindBy (how = How.XPATH, using =passLocator) public WebElement passWord;
    @FindBy (how = How.XPATH, using =signButtonLocator) public WebElement signButton;


    @FindBy (how = How.XPATH, using =helpLocator) public WebElement help;
    @FindBy (how = How.LINK_TEXT, using =changeYourBookingLocator) public WebElement changeYourBooking;



    public void clickDealMenu() throws InterruptedException {
       deals.click();
       sleepFor(3);
    }

    public void hotelDealFinder() throws InterruptedException {
        deals.click();
        sleepFor(3);
        typeByXpath(hotelDealsLocator,"Las");
        sleepFor(3);
        clickByXpath(selectPlaceLocator);
        sleepFor(3);
        clickByXpath(checkInLocator);
        sleepFor(3);
        clickByXpath(checkInNextMonthLocator);
        sleepFor(3);
        clickByXpath(checkInNextMonthLocator1);
        sleepFor(3);
        clickByXpath(selectCheckInDateLocator);
        sleepFor(3);
        clickByXpath(selectCheckOutLocator);
        sleepFor(3);
        clickByXpath(selectCheckOutDateLocator);
        sleepFor(3);
        clickByXpath(selectRoomsLocator);
        sleepFor(3);
        clickByXpath(selectAdultsLocator);
        sleepFor(3);
        //clickByXpath(selectChildrenLocator);
        selectChildren.click();
        sleepFor(3);
        clickByLinkText(showDealsLocator);
        sleepFor(3);

    }

    public void thingsToDo() throws InterruptedException {
        thingsToDo.click();
        sleepFor(3);
    }
    public void searchThingsToDo() throws InterruptedException {
        thingsToDo.click();
        sleepFor(3);
        WebElement popupWindow = null;
        popupWindow.click();
        typeByXpath(searchThingsToDoLocator,"Las");
        sleepFor(3);
        //selectOptionByVisibleText(selectCityLocator,"Las Vegas\n" +
                //"Nevada, United StatesCity");
        clickByXpath(selectCityLocator);
        sleepFor(3);
        //searchPlace.click();
        clickByXpath(fromLocator);
        sleepFor(6);
        clickByXpath(fromDateLocator);
        sleepFor(3);
        clickByXpath(toLocator);
        sleepFor(3);
        clickByXpath(toDateLocator);
        sleepFor(3);
        clickByXpath(submitLocator);
        sleepFor(3);

    }
   public void globalSites() throws InterruptedException {
        clickByCss(globalSitesLocator);
        sleepFor(3);
        globalSites.click();
        sleepFor(3);
        //scrollToBottom();
        choseSite.click();
        //selectOptionByVisibleText(choseSite,"India");
        //clickByXpath(choseSitePlaceLocator);
        sleepFor(3);

   }
    public void vacationRentals() throws InterruptedException {
        vacationRentals.click();
        sleepFor(3);
    }

    public void carRental() throws InterruptedException {
        carRental.click();
        sleepFor(3);
    }

    public void packagesFlights() throws InterruptedException {
        packagesFlights.click();
        sleepFor(3);
    }

    public void groupsMeetings() throws InterruptedException {
        groupsMeetings.click();
        sleepFor(3);
    }

    public void giftCards() throws InterruptedException {
        giftCards.click();
        sleepFor(3);
    }

    public void listYourProperty() throws InterruptedException {
        listYourProperty.click();
        sleepFor(3);
    }

    public void hotelsRewards() throws InterruptedException {
        hotelsRewards.click();
        sleepFor(3);

    }
    public void hotelsCreditCard() throws InterruptedException {
        clickByLinkText(hotelsCreditCardLocator);
        sleepFor(6);
    }

    public void getHomePagePara() throws InterruptedException {
        WebElement popupWindow = null;
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        getTextByCss(getHomePageParaLocator);
        sleepFor(3);
        popupWindow.clear();
    }

    public void getLinkLasVegas() throws InterruptedException {
        scrollToBottom();
        sleepFor(3);
        getLinks(getLinkLasVegasLocator);
        sleepFor(3);
    }

    public void manageBookingIframe() throws InterruptedException {
        iframeHandle(manageBookingIframe);
        sleepFor(3);
    }
    public void getTime() throws InterruptedException {
       getCurrentTime();
       sleepFor(3);
    }
    public void whereTo() throws InterruptedException {
        WebElement popupWindow = null;
        popupWindow.click();
        thingsToDo.click();
        sleepFor(3);
        typeByXpath1(whereToLocator,"New York");
        sleepFor(3);
        popupWindow.click();
    }

    public void findUrl() throws InterruptedException {
        getCurrentUrl();
        sleepFor(3);
    }

    public void selectCurrency() throws InterruptedException {
        WebElement popupWindow = null;
        popupWindow.click();
        assertEqualByXpath(currencyLocator,selectCurrencyLocator);
        sleepFor(3);
    }

    public void clearWhereTo() throws InterruptedException {
        clearField1(clearFieldWhereToLocator);
        sleepFor(3);
    }

    public void clearPopUp() throws InterruptedException {
        WebElement popupWindow = null;
        popupWindow.click();
        driver.quit();
    }

    public void signInCheck() throws InterruptedException {
       clickByLinkText(signInLocator);
       sleepFor(3);
       typeByCss(emailAddressLocator,"abunabi");
       sleepFor(3);
       passWord.sendKeys("12345678");
       clickByXpath(signButtonLocator);
       sleepFor(3);
    }

    public void yourBooking() throws InterruptedException {
        clickByLinkText(yourBookingLocator);
        sleepFor(3);
        typeByCss(emailAddressLocator,"abunabi");
        sleepFor(3);
        passWord.sendKeys("12345678");
        clickByXpath(signButtonLocator);
        sleepFor(3);
    }

    public void helpMenu() throws InterruptedException {
        mouseHoverByXpath(helpLocator);
        sleepFor(3);
        clickByLinkText(changeYourBookingLocator);
        sleepFor(3);

    }








}
