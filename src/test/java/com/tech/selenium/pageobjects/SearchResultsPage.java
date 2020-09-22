package com.tech.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Fei Deng on 20/09/20.
 */
public class SearchResultsPage {

    private WebDriver driver = null;

    @FindBy(partialLinkText = "NBA.com")
    public WebElement lnkNBA;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
