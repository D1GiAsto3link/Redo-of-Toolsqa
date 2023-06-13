package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void InVlogin(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        // Implement method to get error message element and extract text
        return driver.findElement(By.className("message_error")).getText();
       /* return "";*/
    }


    public void Loginagain() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("Samad-Aziz");

        driver.findElement(By.id("password")).sendKeys("snqA2@Yztz5CxKp");

        driver.findElement(By.name("login")).click();

        Thread.sleep(2500);
        driver.get("https://shop.demoqa.com/shop/");

    }





}
