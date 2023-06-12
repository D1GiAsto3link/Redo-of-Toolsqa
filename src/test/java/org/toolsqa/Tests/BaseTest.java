package org.toolsqa.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.toolsqa.utils.ExtentManager;
import org.toolsqa.utils.ScreenshotUtils;

import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    protected ExtentManager extentManager;

    WebDriver chrome = new ChromeDriver();
     /*ExtentManager extentManager;*/

    @BeforeMethod
    public void setup() {
        // Initialize WebDriver and extent reports
        // Add code to initialize WebDriver for Chrome or Edge based on parallel execution
        // Initialize WebDriver and Extent Reports
      chrome.get("https://shop.demoqa.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        // Handle test result and cleanup
        // Capture screenshot if the test fails
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshot = ScreenshotUtils.captureScreenshot(driver);
            // Save screenshot as Base64 or any other desired format
        }
        // Close WebDriver and generate extent reports
        chrome.quit();
    }
}
