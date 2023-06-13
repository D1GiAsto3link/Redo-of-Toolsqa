package org.toolsqa.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CartPage extends BasePage {
    private final By cartItems = By.cssSelector(".cart_item");
    private final By checkoutButton = By.cssSelector(".checkout_button");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getItemCount() {

        return driver.findElements(cartItems).size();
    }

    public void clickCheckoutButton() {

        driver.findElement(checkoutButton).click();

    // Add more methods specific to the cart page if needed


}
}







