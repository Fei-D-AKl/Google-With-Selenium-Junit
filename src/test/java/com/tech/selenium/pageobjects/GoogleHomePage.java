package com.tech.selenium.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Fei Deng on 20/09/20.
 */

public class GoogleHomePage {

    private WebDriver driver = null;

    @FindBy(name = "q")
    WebElement search;

    @FindBy(xpath = "//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[2]")
    WebElement luckyButton;

    @FindBy(xpath = "//*[@id='gb_70']")
    WebElement logIn;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL() {
        driver.get("https://www.google.com");
    }

    public void doSearch(String searchTerm) throws InterruptedException {

        search.sendKeys(searchTerm + Keys.RETURN);
        search.submit();
        Thread.sleep(3000);
    }

    public void feelLucky() throws InterruptedException {
        luckyButton.click();
        Thread.sleep(3000);
    }

    public void googleSingIn() {
        logIn.click();
    }
}
