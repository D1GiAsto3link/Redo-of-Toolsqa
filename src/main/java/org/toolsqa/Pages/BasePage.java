package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.toolsqa.utils.ScreenshotUtils;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {

        this.driver = driver;
    }
    // methods for interacting with web elements for pages actions, navigation.
    public void Dissclick() {
        WebElement dismisslink = driver.findElement(By.linkText("Dismiss"));
        dismisslink.click();
    }

    // methods for capturing screenshots
    public String captureScreenshot() {
        try {
            return ScreenshotUtils.captureScreenshot(driver);
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            return "";
        }
    }

}


    // ...
    /*public void sendKeys(WebElement element, String text) {
    //        element.sendKeys(text);
    //    }
    public String getText(WebElement element) {
    //        return element.getText();
    //    }

    */



