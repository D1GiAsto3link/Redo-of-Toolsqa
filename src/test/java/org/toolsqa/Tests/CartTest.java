package org.toolsqa.Tests;

import org.testng.annotations.Test;
import org.toolsqa.Pages.HomePage;
import org.toolsqa.Pages.LoginPage;

public class CartTest extends BaseTest{
    @Test
    public void addItemToCartTest() {
        // Test logic to add item to cart on SALE and verify
        // Logout and other relevant actions
    }

    @Test
    public void addItemFromPage3ToCartTest() {
        // Test logic to add item from page 3 to cart and verify
        // Proceed to checkout, confirm order, logout, and other relevant actions
    }

    @Test
    public void addToCartTest() {


        // Login
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("validusername", "validpassword");

        // Add item to cart
        // Verify item in cart

        // Logout
    }
}
