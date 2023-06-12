package org.toolsqa.Tests;

import org.testng.annotations.Test;
import org.toolsqa.Pages.CartPage;
import org.toolsqa.Pages.CheckoutPage;
import org.toolsqa.Pages.HomePage;
import org.toolsqa.Pages.LoginPage;

public class CheckoutTest extends BaseTest{
    @Test
    public void addItemsToCartAndCheckoutTest() {
        // Test logic to add multiple items to cart, verify, remove duplicate, proceed to checkout, confirm order, logout, and other relevant actions
    }
}


/*@Test
    public void checkoutTest() {
        // Login
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("validusername", "validpassword");

        // Add item to cart

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.confirmOrder();

        // Logout
    }*/
