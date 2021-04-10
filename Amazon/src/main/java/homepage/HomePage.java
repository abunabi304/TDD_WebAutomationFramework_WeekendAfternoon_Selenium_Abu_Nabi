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
    @FindBy (how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

    @FindBy (how = How.LINK_TEXT, using =newReleaseLocator ) public WebElement newRelease;
    @FindBy (how = How.CSS, using =findTextLocator ) public WebElement findText;
    @FindBy (how = How.XPATH, using =linkTextLocator) public WebElement linkText;

    @FindBy (how = How.XPATH, using =searchPrivacyLocator) public WebElement searchPrivacy;
    @FindBy (how = How.XPATH, using =privacyTermsLocator) public WebElement privacyTerms;
    @FindBy (how = How.XPATH, using =languageChangeLocator) public WebElement languageChange;
    @FindBy (how = How.XPATH, using =languageSpanishLocator) public WebElement languageSpanish;
    @FindBy (how = How.CLASS_NAME, using =returnsOrdersLocator) public WebElement returnsOrders;
    @FindBy (how = How.XPATH, using =browseButtonLocator) public WebElement browseButton;
    @FindBy (how = How.XPATH, using =byOccasionLocator) public WebElement byOccasion;

    // Action Method
    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();
    }

public void searchBox1(){
    typeOnElement(searchBoxLocator,"Hand Sanitizer");
    clickOnElement(searchButtonLocator);
}
    //New Release Suite Testing

    public void newRelease() throws InterruptedException {
       clickByLinkText(newReleaseLocator);
       sleepFor(3);
    }

    public void findText() throws InterruptedException {
        newRelease();
        getTextByCss(findTextLocator);
        sleepFor(3);
        System.out.println("Expected Text  :"+findText.getText());
    }

    public void linkText() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        System.out.println("Expected Text  :"+linkText.getText());
    }

    public void linkTextClick() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
    }
    public void selectBookHowToDoTheWork() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
        clickByXpath(selectBookLocator);
        sleepFor(3);

    }
    public void lookInsideBook() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
        clickByXpath(selectBookLocator);
        sleepFor(3);
        clickByCss(lookInsideBookLocator);
        sleepFor(3);

    }
    public void rightPageTurner() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
        clickByXpath(selectBookLocator);
        sleepFor(3);
        clickByCss(lookInsideBookLocator);
        sleepFor(3);
        clickByXpath(rightPageTurnerLocator);
        sleepFor(3);
    }
    public void againRightPageTurner() throws InterruptedException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
        clickByXpath(selectBookLocator);
        sleepFor(3);
        clickByCss(lookInsideBookLocator);
        sleepFor(3);
        clickByXpath(rightPageTurnerLocator);
        sleepFor(3);
        clickByCss(againRightPageTurnerLocator);
        sleepFor(3);
    }
    public void readingBookScreenShot() throws InterruptedException, IOException {
        newRelease();
        getTextByXpath(linkTextLocator);
        sleepFor(3);
        linkText.click();
        sleepFor(3);
        clickByXpath(selectBookLocator);
        sleepFor(3);
        clickByCss(lookInsideBookLocator);
        sleepFor(3);
        clickByXpath(rightPageTurnerLocator);
        sleepFor(3);
        clickByCss(againRightPageTurnerLocator);
        sleepFor(3);
        takeScreenShot();
    }

    //Footer menus Testing

    public void footerLink() throws InterruptedException, IOException {
        scrollToBottom();
        clickByLinkText(footerLinkLocator);
        sleepFor(3);

    }
    public void searchPrivacy() throws InterruptedException, IOException {
       footerLink();
       searchPrivacy.sendKeys("Privacy");
       searchPrivacy.sendKeys(Keys.ENTER);
       sleepFor(3);

    }
    public void privacyTerms() throws InterruptedException, IOException {
        searchPrivacy();
        clickByXpath(privacyTermsLocator);
        sleepFor(3);
    }

    public void languageChange() throws InterruptedException, IOException {
        mouseHoverByXpath(languageChangeLocator);
        sleepFor(3);
        driver.navigate().refresh();
        languageSpanish.getClass();
        int a = 0;
        for(int i = 1; i<=a; i++)
        {
            driver.findElements(By.xpath("languageSpanish")).get(1).click();
        }
        sleepFor(3);
    }

    public void returnsOrders() throws InterruptedException, IOException {
        clickByXpath(returnsOrdersLocator);
        sleepFor(6);
        typeByCss(signInEmailLocator,"abunabi");
        clickByXpath(continueLocator);
        sleepFor(3);
    }

    public void giftCards() throws InterruptedException, IOException {
        clickByLinkText(giftCardsLocator);
        sleepFor(3);
        clickByXpath(eventsLocator);
        sleepFor(3);
        clickByLinkText(birthdaysLocator);
        sleepFor(3);
        clickByXpath(eGiftCardLocator);
        sleepFor(3);
    }
    public void bestSeller() throws InterruptedException, IOException {
        giftCards();
        clickByXpath(bestSellerLocator);
        sleepFor(3);
    }
    public void happyBirthday() throws InterruptedException, IOException {
        bestSeller();
        clickByXpath(happyBirthdayLocator);
        sleepFor(3);
        clickByXpath(yourPhotoUploadButtonLocator);
        sleepFor(3);
        clickByXpath(browseButtonLocator);
        sleepFor(3);
    }

    public void uploadImage() throws InterruptedException, IOException {
        happyBirthday();
        browseButton.sendKeys("c:\\Users\\abunabi\\Downloads\\3D-array.jpeg");
        sleepFor(3);
    }

    public void byOccasion() throws InterruptedException, IOException {
        clickByXpath(byOccasionLocator);
        sleepFor(3);

    }


    @FindBy (how = How.LINK_TEXT, using =customerServiceLocator) public WebElement customerService;

    public void customerService() throws InterruptedException {
        clickByLinkText(customerServiceLocator);
        sleepFor(3);

    }

    public void fashion() throws InterruptedException {
      clickByXpath(fashionLocator);
      sleepFor(3);

    }

    public void fashionMen() throws InterruptedException {
        fashion();
        clickByXpath(fashionImageLocator);
        sleepFor(3);

    }
    @FindBy (how = How.XPATH, using =fashionLocator) public WebElement fashionImage;

    public void fashionRed() throws InterruptedException, IOException {
        fashionMen();
        sleepFor(3);
        takeScreenShot();

    }
    public void fashionRed1() throws InterruptedException, IOException {
        fashionImage.click();
        sleepFor(3);
        //takeScreenShot();

    }

    public void helloSignIn() throws InterruptedException, IOException {
       mouseHoverByXpath(helloSignInLocator);
       sleepFor(3);
       clickByXpath(signInButtonLocator);
       sleepFor(2);
       typeByXpath(emailLocator,"abunabi@gmail.com");
       sleepFor(3);
       clickByXpath(continueButtonLocator);
       sleepFor(3);
       typeByXpath(passwordLocator,"123456");
       sleepFor(3);
       clickByXpath(signInSubmitLocator);
       sleepFor(3);
    }































}
