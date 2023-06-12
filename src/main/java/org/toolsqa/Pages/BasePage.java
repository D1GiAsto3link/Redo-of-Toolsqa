package org.toolsqa.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {

        this.driver = driver;
    }
    // Add common page elements and methods here
}
