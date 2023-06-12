package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    }
    // Add more methods specific to the cart page if needed

}







