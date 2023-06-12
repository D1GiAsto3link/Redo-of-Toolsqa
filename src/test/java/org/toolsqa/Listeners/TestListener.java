package org.toolsqa.Listeners;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        // Initialize extent reports and set up report configurations
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create extent test for each test case
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Log test success and other relevant actions
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log test failure and other relevant actions
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Log test skipped and other relevant actions
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush extent reports and close any open resources
    }
}
