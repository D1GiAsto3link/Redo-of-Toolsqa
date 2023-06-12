package org.toolsqa.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> testThreadLocal = new ThreadLocal<>();

    public static synchronized ExtentReports getExtent() {
        if (extent == null) {
            extent = new ExtentReports();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-reports/index.html");
            extent.attachReporter(htmlReporter);
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
