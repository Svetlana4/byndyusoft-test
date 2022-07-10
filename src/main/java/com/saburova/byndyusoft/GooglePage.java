package com.saburova.byndyusoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GooglePage extends BaseView {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@id='rso']/*[1]//a)[1]")
    private WebElement firstLink;

    public ByndyusoftPage openFirstLink() {
        firstLink.click();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        return new ByndyusoftPage(driver);
    }
}

