package org.toolsqa.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> testThreadLocal = new ThreadLocal<>();

    public static synchronized ExtentReports getExtent() {
        if (extent == null) {
            extent = new ExtentReports();
           ExtentReporter /*ExtentHtmlReporter*/ htmlReporter = new ExtentReporter() {
           }/*ExtentHtmlReporter("test-output/extent-reports/index.html")*/;
            extent.attachReporter((ExtentObserver) htmlReporter);
        }
        return extent;
    }

    public static synchronized ExtentTest getTest() {
        return testThreadLocal.get();
    }

    public static synchronized void setTest(ExtentTest test) {
        testThreadLocal.set(test);
    }

    public static synchronized void removeTest() {
        testThreadLocal.remove();
    }
}
