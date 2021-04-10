package homepage;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties


    public static final String deltaTitle="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
    public static final String bookLocator="//*[@id=\"headPrimary1\"]";
    public static final String bookText="//*[@id=\"homepage:banner-promoquilt\"]/div/div[3]/div/div/div/div/div[1]/span/div";
    public static final String loginButton="//button[contains(text(),'Log in')]";
    public static final String loginUserNameBox="#userId";
    public static final String loginPasswordNameBox="//*[@id=\"password\"]";
    public static final String loginButtonClick="/html/body/app-root/login-view/div/div/validate-credentials-view/form/div[2]/button";
    public static final String clickWebsiteFeedback="/html/body/app-root/app-home/ngc-global-footer/footer/div/div/div[4]/div/span/a";
    public static final String mouseOverCheck="//*[@id=\"headSectab1\"]";
    public static final String searchBoxCheck="//header/div[1]/nav[1]/div[1]/div[2]/ngc-search[1]/div[1]/a[1]";
    public static final String travelInfo="#headSectab1";
    public static final String rentACarLocator="//*[@id=\"secondary-static-link-13\"]";
    public static final String searchACarLocator="//input[@id='carPickUpLocation']";
    public static final String searchACarLocatorCity="//*[@id=\"ui-id-53\"]";
    public static final String advancedSearchLocator="//*[@id=\"carAdvancedSearchLink\"]";

    public static final String searchName="Los Angeles";
    public static final String searchBoxLocator="/html/body/app-root/app-home/ngc-global-nav/header/div/nav/div/div[2]/ngc-search/div/a";
    public static final String searchButtonLocator="//input[@id='search_input']";
    public static final String searchTextLocator="/html/body/modal-container/div/div/ngc-flyout-search/div/div/div/div/div[2]/div[1]/form/div/div[2]/div/span/button[2]";
    //Booking
    public static final String fromAirportLocator="//*[@id=\"fromAirportName\"]/span[1]";
    public static final String originLocator="//*[@id=\"search_input\"]";
    public static final String originAirportLocator="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li/a/span[2]";

    public static final String toAirportLocator="//*[@id=\"toAirportName\"]/span[1]";
    public static final String destinationLocator="//*[@id=\"search_input\"]";
    public static final String destinationCityLocator="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li[1]/a/span[2]";

    public static final String roundTripLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[2]/span/span[1]/span[1]";
    public static final String selectRoundTripLocator="//*[@id=\"ui-list-selectTripType0\"]";

    public static final String departLocator="//*[@id=\"calDepartLabelCont\"]/span[2]";
    public static final String monthSelector1Locator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[1]/a[2]/span";
    public static final String monthSelector2Locator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[1]/a[2]/span";
    public static final String departDateLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[5]/td[4]/a";
    public static final String departDateDoneLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[3]/button[2]";

    public static final String returnLocator="//*[@id=\"calReturnLabelCont\"]/span[2]";
    public static final String returnDateLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[6]/td[4]/a";
    public static final String returnDateDoneLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[3]/button[2]";

    public static final String goPassengerLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[4]/span/span[1]/span[1]";
    public static final String selectPassengerLocator="//*[@id=\"ui-list-passengers0\"]";
    //1 passenger
    public static final String bookSubmitButtonLocator="//*[@id=\"btn-book-submit\"]";

    public static final String checkInLocator="CHECK-IN";
    public static final String findYourTripByLocator="//*[@id=\"primaryPanel2\"]/div/form/div[1]/div[1]/span/span[1]/span[1]";
    public static final String confirmationNumberLocator="//*[@id=\"ui-list-searchType0\"]";
    public static final String inputConfirmationNumberLocator="//*[@id=\"confirmationNumber\"]";
    public static final String inputConfirmationNumberPrimaryPanelLocator="//*[@id=\"primaryPanel2\"]/div/form/div[1]/div[2]/a";
    public static final String departureAirportLinkLocator="//*[@id=\"departureAirportLink\"]";
    public static final String searchInputAirportLocator="//*[@id=\"search_input\"]";
    public static final String searchInputAirportPanelLocator="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li[1]/a/span[2]";
    public static final String checkInSubmissionButtonLocator="//*[@id=\"btn-checkin-submit\"]";

    public static final String myTripsLocator="MY TRIPS";
    public static final String hotelReservationLocator="Hotel Reservation";
    public static final String putConfirmationNumberLocator="//*[@id=\"fb-conf-num\"]";
    public static final String putConfirmationLastNameLocator="//*[@id=\"fb-conf-lastname\"]";
    public static final String findBookingButtonLocator="//*[@id=\"confirmation-number\"]/form/button";


    public static final String flightStatusLocator="FLIGHT STATUS";
    public static final String inputDepartureDateLocator="//*[@id=\"input_departureDate_1\"]";
    public static final String putDepartureDateLocator="//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[2]/div[2]/table/tbody/tr[4]/td[5]/a";
    public static final String putDepartureDateDoneLocator="//*[@id=\"primaryPanel4\"]/div/form/div/div[1]/date-selection-view/div/div/div/div/div[4]/div/div[3]/button[2]";
    public static final String putFlightNumberLocator="//*[@id=\"flightNo\"]";
    public static final String fromDepartCityLinkLocator="//*[@id=\"departcitylink\"]/span[2]";
    public static final String fromDepartCityLinkPutCityLocator="//*[@id=\"search_input\"]";
    public static final String fromDepartCityLinkPutCityPickLocator="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li/a/span[2]";
    public static final String toCityLinkPutCityLocator="//*[@id=\"arrivalcitylink\"]/span[2]";
    public static final String toCityLinkPutCityInputLocator="//*[@id=\"search_input\"]";
    public static final String toCityLinkPutCityPickLocator="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li[1]/a/span[2]";
    public static final String flightStatusSubmitButtonLocator="//*[@id=\"btn-flight-sts-submit\"]";

    public static final String skyMilesLocator="#headSectab2";
    public static final String howToEarnMilesLocator="How to Earn Miles";
    public static final String earnMilesTravelLocator="//*[@id=\"maincontent\"]/div/div/div/div/div[1]/div[2]/div/p/a";
    public static final String findHomePageTextLocator="//*[@id=\"homepage:banner-promoquilt\"]/div/div[3]/div/div/div/div/div[1]/span/div";
    public static final String customerCommitmentLocator="//body/app-root[1]/app-home[1]/ngc-global-footer[1]/footer[1]/div[1]/div[1]/div[2]/div[1]/ngc-footer-column[1]/div[1]/div[1]/div[4]/ul[2]/li[1]/a[1]";
    public static final String deltaDiscoverMapLocator="//*[@id=\"homepage:banner-promoquilt\"]/div/div[4]/div/div/div/div[2]/a";
    public static final String vacationDealsLocator="//span[contains(text(),'Vacation Deals')]";
    public static final String needHelpLocator="#headSectab3";
    public static final String refundHelpLocator="Refund Help";
    public static final String skyTeamLocator="body > app-root > app-home > ngc-global-nav > header > div > nav > div > ngc-logo > div > a.mr-0.float-left.ng-star-inserted > img";
    public static final String skyTeamClickLocator="//*[@id=\"extsite-flyout-modal-content\"]/div[2]/a";
    public static final String shopWithMilesLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[2]/ngc-search-options/fieldset/div/div[2]/label";
    public static final String advSearchLocator="//*[@id=\"adv-search\"]";
    public static final String nearByAirportLocator="//label[contains(text(),'Include Nearby Airports')]";
    public static final String dropDownLocator="//*[@id=\"booking\"]/form/div[2]/div/div[1]/div[2]/span/span[1]/span[1]";
    public static final String basicEconomyLocator="//*[@id=\"ui-list-faresFor0\"]";
    public static final String submitButtonLocator="//*[@id=\"btnSubmit\"]";

    public static final String refundableFaresLocator="//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[2]/ngc-search-options/fieldset/div/div[3]/label";
    public static final String mainCabinLocator="//*[@id=\"ui-list-faresFor1\"]";
    public static final String travelAgentLocator="/html/body/app-root/app-home/ngc-global-footer/footer/div/div/div[2]/div/ngc-footer-column/div/div/div[1]/ul[2]/li[6]/a";
    public static final String bookingInformationLocator="Booking Information";
    public static final String informationNavButtonLocator="//*[@id=\"information-nav-item-accordion\"]/li[2]/div[1]/div/a";
    public static final String faresDiscountsLocator="Fares & Discounts";
    public static final String findingLowFareLocator="//*[@id=\"expander-image-heading-tent_parsys_expander_3\"]/a";

















}
