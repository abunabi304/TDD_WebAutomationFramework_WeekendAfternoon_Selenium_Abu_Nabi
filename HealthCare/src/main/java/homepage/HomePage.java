package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Sleeper;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
    // Action Method class

    @FindBy (how = How.LINK_TEXT, using =getLinkText) public WebElement linkText;
    @FindBy (how = How.XPATH, using =popupWindowLocator) public WebElement popupWindow;
    @FindBy (how = How.LINK_TEXT, using =loginLocator) public WebElement login;
    @FindBy (how = How.CSS, using =loginUserLocator) public WebElement loginUser;
    @FindBy (how = How.XPATH, using =loginPassLocator) public WebElement loginPass;
    @FindBy (how = How.XPATH, using =loginButtonLocator) public WebElement loginButton;
    @FindBy (how = How.XPATH, using =seeTopicLocator) public WebElement seeTopic;
    @FindBy (how = How.XPATH, using =dentalCoverageLocator) public WebElement dentalCoverage;
    @FindBy (how = How.XPATH, using =printDentalCoveragePageLocator) public WebElement printDentalCoverage;
    @FindBy (how = How.CLASS_NAME, using =searchWordButton) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =applyButtonLocator) public WebElement applyButton;
    @FindBy (how = How.XPATH, using =applyButtonCreateAccountLocator) public WebElement createAccount;
    @FindBy (how = How.XPATH, using =applyCreateAccountButtonLocator) public WebElement HitAccountButton;
    @FindBy (how = How.CSS, using =homepageBottomLocator) public WebElement homepageBottom;
    @FindBy (how = How.XPATH, using =homepageUpLocator) public WebElement homepageUp;
    @FindBy (how = How.XPATH, using =whiteHouseLocator) public WebElement whiteHouse;
    @FindBy (how = How.LINK_TEXT, using =getAnswerLocator) public WebElement getAnswer;
    @FindBy (how = How.XPATH, using =get2021Locator) public WebElement get2021;
    @FindBy (how = How.XPATH, using =signupSelectLocator) public WebElement pickState;
    @FindBy (how = How.ID, using =checkboxIDLocator) public WebElement checkboxID;
    @FindBy (how = How.LINK_TEXT, using =contactUsLocator) public WebElement contactUS;
    @FindBy (how = How.XPATH, using =contactUsAddressSelectionLocator) public WebElement contactUSAddressSelect;
    @FindBy (how = How.XPATH, using =seeTopicsLocator) public WebElement seeTopics;
    @FindBy (how = How.LINK_TEXT, using =pickPlanLocator) public WebElement pickPlan;
    @FindBy (how = How.XPATH, using =usGovtLocator) public WebElement usGOVT;
    @FindBy (how = How.XPATH, using =getTipsLocator) public WebElement getTips;
    @FindBy (how = How.XPATH, using =getTipsPrintLocator) public WebElement getTipsPrints;
    @FindBy (how = How.LINK_TEXT, using =keepORUpdateLocator) public WebElement keepORUpdate;
    @FindBy (how = How.XPATH, using =learnMoreLocator) public WebElement learnMore;
    @FindBy (how = How.XPATH, using =searchBoxRightClickLocator) public WebElement rightClick;
    @FindBy (how = How.LINK_TEXT, using =healthCareLocator) public WebElement healthCare;
    @FindBy (how = How.XPATH, using =languageResourceLocator) public WebElement languageResource;



    // Action Method

    public void goGetCoverage() throws InterruptedException {
        linkText.click();
        sleepFor(6);
    }
    public void goLanguage() throws InterruptedException {
        popupWindow.click();
        clickByCss(languageLocator);
        sleepFor(100);
        popupWindow.click();

    }

    public void loginCheck() throws InterruptedException {
        popupWindow.click();
        clickByLinkText(loginLocator);
        sleepFor(3);
        typeByCss(loginUserLocator,"abunabi");
        sleepFor(3);
        loginPass.sendKeys("113456");
        clickByXpath(loginButtonLocator);
        sleepFor(3);
    }

    public void seeTopicsMouseOver() throws InterruptedException {
        popupWindow.click();
        mouseHoverByXpath(seeTopicLocator);
        sleepFor(3);
    }

    public void seeTopicsDentalCoverage() throws InterruptedException {
        popupWindow.click();
        mouseHoverByXpath(seeTopicLocator);
        clickByXpath(dentalCoverageLocator);
        sleepFor(6);
    }
    public void printDentalCoveragePage() throws InterruptedException {
        popupWindow.click();
        mouseHoverByXpath(seeTopicLocator);
        clickByXpath(dentalCoverageLocator);
        sleepFor(3);
        popupWindow.click();
        clickByXpath(printDentalCoveragePageLocator);
        sleepFor(3);
    }
    public void searchHealthWord() throws InterruptedException {
        popupWindow.click();
        typeByXpath(searchWordLocator,"Diabetics");
        sleepFor(3);
        searchButton.click();
        sleepFor(3);

    }
    public void coverageApply() throws InterruptedException {
        popupWindow.click();
        clickByXpath(applyButtonLocator);
        sleepFor(3);
    }

    public void coverageApplyCreateAccount() throws InterruptedException {
        popupWindow.click();
        clickByXpath(applyButtonLocator);
        sleepFor(3);
        //clickByXpath(applyButtonCreateAccountLocator);
        createAccount.click();
        selectOptionByVisibleText(createAccount,"California");
        sleepFor(3);
        clickByXpath(applyCreateAccountButtonLocator);
        sleepFor(3);
    }
    public void homepageScrollDown() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        clickByCss(homepageBottomLocator);
        sleepFor(4);
    }
    public void homepageScrollUP() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        homepageUp.click();
        sleepFor(4);
    }
    public void findLocalHelp() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        clickByXpath(findLocalHelp);
        sleepFor(3);
    }
    public void goWhiteHouse() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        whiteHouse.click();
        sleepFor(3);
    }

    public void getAnswer() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        getAnswer.click();
        sleepFor(3);
        clickByXpath(getQALocator);
        sleepFor(3);

    }
    public void getAnswer2021Coverage() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        getAnswer.click();
        sleepFor(3);
        clickByXpath(get2021Locator);
        sleepFor(3);
        get2021.click();
    }

    public void signUp() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
        clickByCss(signupLocator);
        sleepFor(3);
        clickByXpath(signupSelectLocator);
        sleepFor(3);
        selectOptionByVisibleText(pickState,"California");
        sleepFor(3);
        typeByCss(signupEmailLocator,"abu1234@gmail.com");
        sleepFor(3);
        typeByXpath(signupPhoneLocator,"8182225431");
        sleepFor(3);
        clickByXpath(signupClickLocator);
        sleepFor(3);
        clickById(checkboxIDLocator);
        sleepFor(3);
        clickByXpath(continueButtonLocator);
        sleepFor(3);
    }

    public void getAddress() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        contactUS.click();
        sleepFor(3);
        clickByXpath(contactUsAddressSelectionLocator);

    }
    public void goUSGovt() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        usGOVT.click();
        sleepFor(3);
    }

    public void goPrintPage() throws InterruptedException {
        popupWindow.click();
        mouseHoverByXpath(seeTopicLocator);
        sleepFor(3);
        pickPlan.click();
        sleepFor(3);
        clickByXpath(printLocator);
        sleepFor(3);
    }
    public void getTips() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        getTips.click();
        sleepFor(3);
        clickByXpath(getTipsPrintLocator);
        sleepFor(3);
    }

    public void learnMore() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        keepORUpdate.click();
        sleepFor(3);
        clickByXpath(learnMoreLocator);
        sleepFor(3);
        clickByLinkText("coronavirus disease 2019 (COVID-19) emergency");
        sleepFor(3);

    }
    public void learnMoreEndLink() throws InterruptedException {
        popupWindow.click();
        scrollToBottom();
        sleepFor(3);
        keepORUpdate.click();
        sleepFor(3);
        clickByXpath(learnMoreLocator);
        sleepFor(3);
        clickByLinkText("coronavirus disease 2019 (COVID-19) emergency");
        sleepFor(3);
        clickByLinkText("New, lower costs on Marketplace coverage starting April 1");
        sleepFor(3);
        clickByLinkText("Start a Marketplace application");
        sleepFor(3);
    }
    public void homepageRightClick() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        Actions a = new Actions(driver);
        a.moveToElement(rightClick);
        sleepFor(3);
    }
    public void healthCareBlog() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        healthCare.click();
        clickOnLink("March 2021");
        sleepFor(3);

    }
    public void languageResource() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        scrollToBottom();
        languageResource.isSelected();
        sleepFor(3);
    }
    public void languageResourceClick() throws InterruptedException {
        popupWindow.click();
        sleepFor(3);
        scrollToBottom();
        languageResource.click();
        sleepFor(3);
    }
}
