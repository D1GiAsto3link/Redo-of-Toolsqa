package org.toolsqa.Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.TestNG;
import org.toolsqa.Listeners.TestListener;

public class TestRunner {
    public static void main(String[] args) {

        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {
                LoginTest.class, CartTest.class,
                CheckoutTest.class
        });

        testng.addListener(new TestListener());
        testng.setParallel("tests");
        testng.setThreadCount(2);
        testng.setOutputDirectory("test-output");
        testng.run();

    }
}
/*TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {LoginTest.class, CartTest.class, CheckoutTest.class});
        testng.setParallel("tests");
        testng.setThreadCount(2);
        testng.run();


        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        extent.createTest("MyFirstTest")
                .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
        extent.flush();



        ExtentTest test = extent.createTest("MyFirstTest");

// reference image saved to disk
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

// base64
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
*/