package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{

    private By confirmOrderButton = By.cssSelector(".confirm-order");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void confirmOrder() {
        driver.findElement(confirmOrderButton).click();
        // Add more methods specific to the checkout page if needed
    }



}
