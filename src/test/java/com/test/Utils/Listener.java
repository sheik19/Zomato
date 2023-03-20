package com.test.Utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Listener extends AndroidActions implements ITestListener {
	
	
	

	public Listener(AndroidDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	ExtentTest test;
	ExtentReports extent = ExtentUtils.getReportObject();
	public AppiumDriver driver;

	public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub

	extent.flush();

	}

	public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub



	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub

	try {
	driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
	.get(result.getInstance());
	} catch (IllegalArgumentException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (NoSuchFieldException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}



	test.fail(result.getThrowable());
	try {
	test.addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName(), driver),result.getMethod().getMethodName());
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}

	public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub

	test=extent.createTest(result.getMethod().getMethodName());


	}

	public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub

	test.log(Status.PASS, "Test Passed");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
