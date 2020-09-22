package com.tech.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Fei Deng on 20/09/20.
 */

public class SignInPage {
    private WebDriver driver = null;
    @FindBy(id = "identifierId")
    WebElement userId;

    @FindBy(xpath = "//*[@id='identifierNext']/div/button/div[2]")
    WebElement nextButton;

    @FindBy(id ="password")
    public WebElement passWord;

    @FindBy(xpath = "//*[@id='headingText']/span")
   // @FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[2]")
    public WebElement reject;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendToNext(String id) throws InterruptedException {
        userId.sendKeys(id);
        Thread.sleep(2000);
        nextButton.click();
    }
}
