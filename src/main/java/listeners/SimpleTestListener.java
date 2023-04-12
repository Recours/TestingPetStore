package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class SimpleTestListener implements ITestListener {
    @Override
    public void onStart(ITestContext arg0) {
        Reporter.log("+Begin test: " + arg0.getName(),true);
    }
    @Override
    public void onTestStart(ITestResult arg0) {
        Reporter.log(" Starting test: " + arg0.getName(),true);
    }
    @Override
    public void onTestSuccess(ITestResult arg0) {
        Reporter.log(" Test passed: " + arg0.getName(),true);
    }

}
