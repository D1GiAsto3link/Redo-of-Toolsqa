package org.toolsqa.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.toolsqa.Pages.CartPage;
import org.toolsqa.Pages.CheckoutPage;
import org.toolsqa.Pages.HomePage;
import org.toolsqa.Pages.LoginPage;

import java.time.Duration;

public class CheckoutTest extends BaseTest{
    @Test
    public void addItemsToCartAndCheckoutTest() throws InterruptedException {
        // Test logic to add multiple items to cart, verify, remove duplicate, proceed to checkout, confirm order, logout, and other relevant actions
        WebElement Countryselect = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("select2-billing_country-container")));
        Countryselect.click();
        //countryselection(color);
        driver.findElement(By.xpath( "//*[@id=\"select2-billing_country-result-bu8m-MA\"]")).click();

        driver.findElement(By.id("billing_address_1")).sendKeys("69 Highland way, velvedera, Cocomatin");
        Thread.sleep(1000);

        driver.findElement(By.id("billing_city")).sendKeys("pazact");
        Thread.sleep(1000);

        driver.findElement(By.id("billing_state")).sendKeys("Morocco");
        Thread.sleep(1000);


        driver.findElement(By.id("billing_postcode")).sendKeys("4896");
        Thread.sleep(1000);


        driver.findElement(By.id("billing_phone")).sendKeys("+9544920556");
        Thread.sleep(1000);

        driver.findElement(By.id("billing_email")).sendKeys("Sgb@hotmail.com");
        Thread.sleep(1000);


        driver.findElement(By.id("order_comments")).sendKeys("This was really fun.");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
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
