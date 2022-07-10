package com.saburova.byndyusoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ByndyusoftPage extends BaseView {
    public ByndyusoftPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='know-more__container']//span")
    public WebElement requestPresentationButton;

    public WindowContactInformation requestPresentation() {
        requestPresentationButton.click();
        return new WindowContactInformation(driver);
    }
}
