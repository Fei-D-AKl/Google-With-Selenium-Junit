package com.tech.selenium.tests;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleHomePage;
import com.tech.selenium.pageobjects.LuckyPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import com.tech.selenium.pageobjects.SignInPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by Fei Deng on 20/09/20.
 */

public class RunTest {

    private WebDriver driver;
    GoogleHomePage googleHomePage;
    SearchResultsPage searchResultsPage;
    LuckyPage luckyPage;
    SignInPage signInPage;

    @Before
    public void setUp(){
        driver = DriverFactory.getBrowser();
        googleHomePage = new GoogleHomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        luckyPage = new LuckyPage(driver);
        signInPage = new SignInPage(driver);
    }

    @Test
    public void searchFunction() throws InterruptedException {
        //Write your test here
        googleHomePage.openURL();
        googleHomePage.doSearch ("NBA");
        Assert.assertTrue(searchResultsPage.lnkNBA.isDisplayed());
    }


    @Test
    public void luckyButton() throws InterruptedException {
        googleHomePage.openURL();
        googleHomePage.feelLucky();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.google.com/doodles/");
    }

    @Test
    public void SignIn() throws InterruptedException {
        googleHomePage.openURL();
        googleHomePage.googleSingIn();
        signInPage.sendToNext("FakeID");
        Assert.assertTrue(signInPage.reject.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
