package org.toolsqa.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.toolsqa.Pages.HomePage;
import org.toolsqa.Pages.LoginPage;
import org.toolsqa.utils.ExcelUtils;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class LoginTest extends BaseTest{
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        // Read login data from Excel using ExcelUtils class
        try {
            return /*ExcelUtils*/ExcelUtils.getLoginData("TestData.xlsx", "LoginData")/*getTestData()*/;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(dataProvider = "loginData")
    public void invalidLoginTest(String username, String password) {
        // Test logic for invalid login
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Invalid username/password error message");
    }



    @Test
    public void invalidLoginTest() throws InterruptedException {
        //HomePage = new HomePage(chrome);
        LoginPage loginPage = new LoginPage(chrome);
        chrome.manage().window().maximize();
        WebElement dismisslink = chrome.findElement(By.linkText("Dismiss"));
        dismisslink.click();
        try{
            chrome.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
            sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        chrome.findElement(By.id("username")).sendKeys("Jason");

        chrome.findElement(By.id("password")).sendKeys("compuyz5CxKp");

        chrome.findElement(By.name("login")).click();

      /*  String errorMessage;
        errorMessage = loginPage.getErrorMessage();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage, "Invalid username/password");
    */}
}


/*chrome.findElement(By.id("username")).sendKeys("Samad-Aziz");

        chrome.findElement(By.id("password")).sendKeys("snqA2@Yztz5CxKp");

        chrome.findElement(By.name("login")).click();

        chrome.get("https://shop.demoqa.com/shop/");*/