package org.toolsqa.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverManager Edgedriver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.Edgedriver = WebDriverManager.edgedriver();
    }
    // Add common page elements and methods here
}
