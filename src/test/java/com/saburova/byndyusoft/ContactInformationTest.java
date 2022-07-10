package com.saburova.byndyusoft;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactInformationTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void verificateContactInformation() {
        driver.get("https://google.ru/");
        WindowContactInformation windowContactInformation = new GoogleMainPage(driver)
                .enterRequest("Byndyusoft")
                .openFirstLink()
                .requestPresentation();

        Assertions.assertEquals("8 800 775-15-21", windowContactInformation.getPhone());
        Assertions.assertEquals("sales@byndyusoft.com", windowContactInformation.getEmail());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
