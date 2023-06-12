package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By loginLink = By.cssSelector(".login");

    public HomePage(WebDriver driver) {

        super(driver);

    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
    // Add more methods specific to the home page if needed



}
