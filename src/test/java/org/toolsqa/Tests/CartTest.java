package org.toolsqa.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.toolsqa.Pages.HomePage;
import org.toolsqa.Pages.LoginPage;

import java.time.Duration;

public class CartTest extends BaseTest{
    @Test
    public void addItemToCartTest() throws InterruptedException {
        // Test logic to add item to cart on SALE and verify


        try{
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[15]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")).click();

            WebElement colorOptions = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("pa_color")));
            colorOptions.click();
            //chooseColor(color);

            driver.findElement(By.xpath( "//*[@id=\"pa_color\"]/option[2]")).click();

            WebElement sizeOptions = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("pa_size")));
            colorOptions.click();
            //chooseColor(color);

            Thread.sleep(2000);
            driver.findElement(By.xpath( "//*[@id=\"pa_size\"]/option[3]")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\\\"product-1225\\\"]/div[1]/div[2]/form/div/div[2]/button")).click();
            driver.get("https://shop.demoqa.com/shop/");


        }
        catch(Exception e){
            e.printStackTrace();
        }
        // Logout and other relevant actions
        try{
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
            Thread.sleep(3000);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        WebElement Logoutlink = driver.findElement(By.linkText("Log out"));
        Logoutlink.click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addItemFromPage3ToCartTest() {
        // Test logic to add item from page 3 to cart and verify
        try{
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/nav/ul/li[3]/a")).click();
            Thread.sleep(3000);

        }catch (Exception e){
            e.printStackTrace();
        }

        try{

            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div[1]/a/img")).click();

            WebElement colorOptions = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("pa_color")));
            colorOptions.click();
            //chooseColor(color);

            driver.findElement(By.xpath( "//*[@id=\"pa_color\"]/option[2]")).click();

            WebElement sizeOptions = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("pa_size")));
            colorOptions.click();
            //chooseColor(color);

            driver.findElement(By.xpath( "//*[@id=\"pa_size\"]/option[4]")).click();

            driver.findElement(By.xpath("//*[@id=\"product-1248\"]/div[1]/div[2]/form/div/div[2]/button")).click();
            driver.get("https://shop.demoqa.com/shop/");
            Thread.sleep(2000);

        }
        catch(Exception e){
            e.printStackTrace();
        }

        // Proceed to checkout, confirm order, logout, and other relevant actions
    }

    @Test
    public void addToCartTest() throws InterruptedException {


        // Login
        HomePage homePage = new HomePage(driver);
        homePage.Dismiss();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.InVlogin("validusername", "validpassword");

        // Add item to cart
        // Verify item in cart
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")).click();
    }
        // Logout
    }

