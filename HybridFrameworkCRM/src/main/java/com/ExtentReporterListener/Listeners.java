package com.ExtentReporterListener;

import com.BasePackage.BasePageClass;
import com.UtilityPackage.UtilityClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BasePageClass implements ITestListener {

    public Listeners() throws IOException {
        super();
    }
    ExtentReports extent = ExtentReporterNG.getReportObject();
    ExtentTest test;
    public static Logger Log = LogManager.getLogger(Listeners.class);

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());  //this returns the name of the method which is going to be tested
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.generateLog(Status.PASS,"Test Passed");
        Log.info("Successfully passed testcase:" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        try {
            UtilityClass.takeScreenshotAtEndOfTest();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("failed the execution");
        System.out.println("test case failed at: "+result.getName());
        test.fail(result.getThrowable());
        Log.error("failed testcase:" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped the execution");
        System.out.println("test case skipped at: "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush(); //to remove previous reports
    }
}


