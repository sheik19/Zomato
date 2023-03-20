package com.test.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;

public class ExtentUtils {
	
	public static  ExtentReports extent;

	public static ExtentReports getReportObject() {

	//String path = System.getProperty("user.dir")+"//reports//index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\ExtendReport\\report.html");
	reporter.config().setDocumentTitle("Test Results");
	reporter.config().setReportName("Mobile Automation Testing");


	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","QA");
	return extent;
	}
	
	

}
