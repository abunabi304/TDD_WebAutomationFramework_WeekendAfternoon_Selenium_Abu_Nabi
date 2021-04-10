package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static homepage.HomePageWebElement.*;

public class LoginTest extends WebAPI {
    HomePage homePage;
    WebDriver driver;
    @BeforeMethod
    public void getInit(){
        //public static void getInit(){
//        public void setUp(){
//            System.setProperty("webdriver.chrome.driver", "/Users/abunabi/IdeaProjects/TDD_WebAutomationFramework_WeekendAfternoon_Selenium_Abu_Nabi/Generic/BrowserDriver");
//            driver = new ChromeDriver(); // launch browser
//            driver.manage().deleteAllCookies();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            driver.get("https://www.delta.com/");
//        }

        homePage = PageFactory.initElements(driver, HomePage.class);
        }


    @DataProvider
    public Object[][] getLoginData() throws IOException {
        Object[][] data;
        data = TestUtil.getTestData("login");
        return data;
    }

    @FindBy(how = How.XPATH, using =loginPasswordNameBox) public WebElement sendPassword;

    @Test(dataProvider = "getLoginData")
    public void loginTest(String username, String password) throws InterruptedException, IOException {
        clickByXpath(loginButton);
        sleepFor(3);
        typeByCss(loginUserNameBox,username);
        sleepFor(3);
        sendPassword.sendKeys(password);
        sleepFor(3);
        clickByXpath(loginButtonClick);
        sleepFor(3);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
