package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends BasePage{
    private By logoutButton = By.cssSelector(".logout");

    public ConfirmationPage(WebDriver driver) {
        super(driver);
        // Add methods to verify the confirmation message or any other relevant actions
    }
    public void logout() {
        driver.findElement(logoutButton).click();
    }
}
