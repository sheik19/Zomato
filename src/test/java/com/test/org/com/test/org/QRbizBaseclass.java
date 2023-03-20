package com.test.org.com.test.org;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.test.utils.AndroidActions;
import com.zomato.pages.LoginPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

//import io.appium.java_client.android.options.UiAutomator2Options;

public class QRbizBaseclass{
	
	//public AppiumDriverLocalService service;
	public AndroidDriver driver;
	public static ExtentSparkReporter htmlreport;
	public static ExtentReports reports;
	public ExtentTest test;
	
	

	@BeforeSuite
	public void configuration() throws InterruptedException, MalformedURLException {
		reports = new ExtentReports();
		htmlreport = new ExtentSparkReporter("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\ExtendReport\\NewRegister"+".html");
		reports.attachReporter(htmlreport);
		htmlreport.config().setReportName("QRbiz_Merchant");
		htmlreport.config().setDocumentTitle("QRbiz_Merchant");
		htmlreport.config().setTheme(Theme.STANDARD);
		
		
		
		
		
	}
	
	@BeforeMethod
	public void server_manager() throws MalformedURLException {
		
		UiAutomator2Options caps=new UiAutomator2Options();
		caps.setDeviceName("1374697221000FG");
		caps.setPlatformName("Android");
		caps.setPlatformVersion("13");
		caps.setAppPackage("com.maybank.quickmerchant");
		caps.setAppActivity("com.maybank.quickmerchant.MainActivity");
		driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Initiated");
		
	}
	@AfterMethod
	public void generate_report() {
		reports.flush();
	
	
	}
	
	@AfterSuite
	public void tearDown() {
		
		//AndroidActions.rs.close();
		//AndroidActions.connection.close();
		driver.quit();
		//service.stop();
	}
	
    public void scrollActionGes(String text) {
		
		WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(text(\""+text+"\"))"));
		ele.click();
	}
	
	public void TakescreenShot(String fileName) {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, 
					new File("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\com.test.org\\screenshots\\" + fileName +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}	
