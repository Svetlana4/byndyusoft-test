package com.saburova.byndyusoft;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage extends BaseView {
    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@title='Поиск']")
    private WebElement search;


    public GooglePage enterRequest(String request) {
        search.sendKeys(request);
        search.sendKeys(Keys.RETURN);
        return new GooglePage(driver);
    }
}
