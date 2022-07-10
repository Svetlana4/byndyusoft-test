package com.saburova.byndyusoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseView {
    protected WebDriver driver;
    protected Actions actions;

    public BaseView(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);

        PageFactory.initElements(driver, this);
    }
}
