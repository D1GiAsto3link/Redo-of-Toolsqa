package org.toolsqa.Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.toolsqa.utils.ScreenshotUtils;
import java.io.File;
import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;

    WebDriver chrome = new ChromeDriver();
     /*ExtentManager extentManager;*/



    public static String CaptureScreenshot(WebDriver driver) throws IOException {
        String FileSeparator = System.getProperty("file.separator");
        String Extent_report_path = "."+FileSeparator+"Reports";
        String ScreenshotPath = Extent_report_path+FileSeparator+"screenshots";

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String screenshotName = "screenshot"+Math.random()+".png";
        String screenshotpath = ScreenshotPath+FileSeparator+screenshotName;

        FileUtils.copyFile(src,new File(screenshotpath));
        return "."+FileSeparator+"screenshots"+FileSeparator+screenshotName;


    }

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
