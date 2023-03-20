package com.test.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;

public class GetscreenShots {
	
	
	public static String getScreenshot(String testCaseName, AppiumDriver driver) throws IOException {

		File source = driver.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;

		}


}
