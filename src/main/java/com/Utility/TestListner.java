package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListner implements ITestListener{
	
	ExtentReports extent=ExtentReportGenrator.getReports();
	
	ThreadLocal<ExtentTest> extentest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extentest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		Library.test.log(Status.PASS, "Test Case Is pass ....");
	}

	public void onTestFailure(ITestResult result) {
		Library.test.log(Status.FAIL, "Test Case Is Fail ....");
	}

	public void onTestSkipped(ITestResult result) {
		Library.test.log(Status.SKIP, "Test Case Is skip ....");
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

	
	
}
