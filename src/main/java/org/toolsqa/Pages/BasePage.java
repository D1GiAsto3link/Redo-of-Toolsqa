package org.toolsqa.Pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.toolsqa.utils.ScreenshotUtils;



public class BasePage {

    protected WebDriver driver;
    ExtentReports extent = null;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }
    // methods for interacting with web elements for pages actions, navigation.
    public void Dissclick() {
        WebElement dismisslink = driver.findElement(By.linkText("Dismiss"));
        dismisslink.click();
    }

    // methods for capturing screenshots
    public void Screenshots(){

        ExtentTest test = extent.createTest("MyFirstTest");
// reference image saved to disk
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
// base64
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
    }


    public String captureScreenshot() {
        try {
            return ScreenshotUtils.captureScreenshot(driver);
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            return "";
        }
    }

    // methods for capturing Logs
    public void Logs(){
        ExtentTest test = extent.createTest("MyFirstTest");
        test.pass("Text details");
        test.log(Status.PASS, "Text details");

    }


    public void Exceptions(){
        Throwable t = new RuntimeException("A runtime exception");
        ExtentTest test = extent.createTest("MyFirstTest");
        test.fail(t);
        test.log(Status.FAIL, t);

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



