package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.ID, using =capitalOneTitle) public WebElement searchTitle;
    @FindBy (how = How.LINK_TEXT, using =checkCreditCards) public WebElement ccMenu;

    @FindBy (how = How.CSS, using =checkCreditCards1) public WebElement ccMenu1;
    @FindBy (how = How.XPATH, using =clickApplyCredit) public WebElement applyCredit;
    @FindBy (how = How.CSS, using =checkingSavingsLocator) public WebElement checkingSavings;
    @FindBy (how = How.CSS, using =inputPasswordLocator) public WebElement inputPassword;
    @FindBy (how = How.XPATH, using =homepageTextLocator) public WebElement homepageText;
    @FindBy (how = How.CSS, using =searchLocator) public WebElement search;
    @FindBy (how = How.XPATH, using =searchBoxLocator) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchBoxTextLocator) public WebElement searchBoxText;



    //@FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    //@FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

    // Action Method

    public String searchTitle() throws InterruptedException {
        String gt= driver.getTitle();
        sleepFor(3);
        System.out.println(gt);
        sleepFor(3);
        return gt;
    }

    public void creditCardsMenu() throws InterruptedException {
        ccMenu.click();
        sleepFor(3);
    }

    public void clickApplyCredit() throws InterruptedException {
        ccMenu.click();
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
        //applyCredit.click();
        clickByXpath(clickApplyCredit);
    }
    public void creditCardsHover() throws InterruptedException {
       mouseHoverByCSS(checkCreditCards1);
       sleepFor(3);
    }
    public void checkingSavings() throws InterruptedException {
        mouseHoverByCSS(checkingSavingsLocator);
        sleepFor(3);
    }

    public void inputBoxCheck() throws InterruptedException {
        typeByXpath(inputUserNameLocator,"abunabi");
        sleepFor(3);
        inputPassword.sendKeys("123456");
        sleepFor(3);
        clickByXpath(signInSubmitLocator);
        sleepFor(3);

    }
    public void findHomepageText() throws InterruptedException {
        getTextByXpath(homepageTextLocator);
        sleepFor(3);
        System.out.println("Expected Text  :"+homepageText.getText());
    }

    public void searchBox() throws InterruptedException {
        clickByCss(searchLocator);
        sleepFor(3);
        searchBox.sendKeys("Auto Loan");
        sleepFor(3);
        //searchBox.click();
        sleepFor(6);
    }
    public void searchBoxText() throws InterruptedException {
        searchBox();
        searchBox.sendKeys(Keys.ENTER);
        sleepFor(3);
        searchBoxText.click();
        sleepFor(3);
    }
    public void business() throws InterruptedException {
       clickByXpath(businessLocator);
       sleepFor(3);
    }

    public void commercialMenu() throws InterruptedException {
        mouseHoverByXpath(commercialLocator);
        sleepFor(3);
    }

    public void signInMenu() throws InterruptedException {
        clickByXpath(signInLocator);
        sleepFor(3);
    }
    public void signInClick() throws InterruptedException {
        signInMenu();
        sleepFor(3);
        typeByXpath(usernameLocator,"abunabi");
        sleepFor(3);
        typeByXpath(passwordLocator,"123456");
        sleepFor(3);
        clickByXpath(signInButtonLocator);
        sleepFor(3);
    }
    public void signInRememberMe() throws InterruptedException {
        signInMenu();
        sleepFor(3);
        typeByXpath(usernameLocator,"abunabi");
        sleepFor(3);
        typeByXpath(passwordLocator,"123456");
        sleepFor(3);
        clickByXpath(rememberMeLocator);
        sleepFor(3);
        clickByXpath(signInButtonLocator);
        sleepFor(3);
    }
    public void supportClick() throws InterruptedException {
       clickByXpath(supportLocator);
       sleepFor(3);
       typeByXpath(searchSupportLocator,"credit card support");
       sleepFor(2);
       clickByXpath(searchSupportTextLocator);
       sleepFor(3);
    }

    public void searchLocation() throws InterruptedException, IOException {
        clickByCss(searchLocationLocator);
        sleepFor(3);
        typeByXpath(findLocationLocator,"Reseda");
        sleepFor(3);
        clickByXpath(findLocationClickLocator);
        sleepFor(3);
        takeScreenShot();
    }

    public void learnGrow() throws InterruptedException, IOException {
       clickByLinkText(learnGrowLocator);
       sleepFor(3);
       scrollToBottom();
       clickByXpath(fdicLocator);
       sleepFor(3);
    }
    public void autoLoan() throws InterruptedException, IOException {
        clickByLinkText(autoLoanLocator);
        sleepFor(3);
        clickByXpath(autoLoanCalLocator);
        sleepFor(3);
    }
    @FindBy (how = How.XPATH, using =loanTermLocator) public WebElement loanTerm;

    public void autoLoanCal() throws InterruptedException, IOException {
        autoLoan();
        sleepFor(3);
        typeByXpath(loanAmountLocator,"10000");
        sleepFor(3);
        typeByXpath(interestRateLocator,"4");
        sleepFor(3);
        clickByXpath(loanTermLocator);
        sleepFor(3);
        selectOptionByVisibleText(loanTerm,"60");
        sleepFor(3);
        clickByXpath(monthlyPaymentLocator);
        sleepFor(3);
        takeScreenShot();
        sleepFor(3);

    }
    public void footerTwit() throws InterruptedException, IOException {
        scrollToBottom();
        clickByCss(footerTwitterLocator);
        sleepFor(3);
    }
    public void footerContact() throws InterruptedException, IOException {
        scrollToBottom();
        clickByLinkText(footerContactLocator);
        sleepFor(3);
    }
    public void footerContactTwoLinks() throws InterruptedException, IOException {
        footerContact();
        clickByLinkText(footerContactPCALocator);
        sleepFor(3);
        clickByLinkText(footerContactSPBMLocator);
        sleepFor(3);
    }
    public void onlineAccess() throws InterruptedException, IOException {
       clickByLinkText(onlineAccessLocator);
       sleepFor(3);
    }
    public void needHelp() throws InterruptedException, IOException {
        onlineAccess();
        sleepFor(3);
        clickByXpath(needHelpLocator);
        sleepFor(3);
    }
    public void chattingForm() throws InterruptedException, IOException {
        needHelp();
        sleepFor(3);
        clickByXpath(enrollACCLocator);
        sleepFor(3);
        clickByXpath(startChattingLocator);
        sleepFor(3);
    }
    @FindBy (how = How.XPATH, using =selectButtonLocator) public WebElement selectOption;
    public void selectOption() throws InterruptedException, IOException {
        clickByXpath(selectButtonLocator);
        sleepFor(3);
        selectOptionByVisibleText(selectOption,"prevent fraud");
        sleepFor(3);
    }
    public void privacyLink() throws InterruptedException, IOException {
        scrollToBottom();
        clickByXpath(privacyLocator);
        sleepFor(3);

    }
    @FindBy (how = How.XPATH, using =findTextLocator) public WebElement findText;
    public void findText() throws InterruptedException, IOException {
        clickByXpath(findTextLocator);
        sleepFor(3);
        System.out.println("Found Text  :"+findText.getText());
        sleepFor(3);
    }








}
