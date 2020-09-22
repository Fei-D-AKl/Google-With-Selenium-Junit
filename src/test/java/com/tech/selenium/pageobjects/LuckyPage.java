package com.tech.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Fei Deng on 20/09/20.
 */

public class LuckyPage {
    private WebDriver driver = null;

    public LuckyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
