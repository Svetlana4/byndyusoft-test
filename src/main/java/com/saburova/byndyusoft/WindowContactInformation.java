package com.saburova.byndyusoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowContactInformation extends BaseView {
    public WindowContactInformation(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='popup-callback__content']//a[starts-with(@href,'tel:')]")
    private WebElement phone;

    @FindBy(xpath = "//div[@class=\"popup-callback__content\"]//a[starts-with(@href,'mailto:')]")
    private WebElement email;

    public String getPhone() {
        return phone.getText();
    }

    public String getEmail() {
        return email.getText();
    }

}
