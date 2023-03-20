package com.test.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import com.google.common.collect.ImmutableMap;

public class Common_Android_Actions {


public AndroidDriver driver;

public Common_Android_Actions(AndroidDriver driver) {
	this.driver=driver;
	
}
	
   public void waitForVisibility(WebElement e) {
	   
    WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
    wait.until(ExpectedConditions.visibilityOf(e));
    
   }

   public void waitForVisibility(By e) {
	   
    WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
    wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    
   }
	
	public void scrollActionGes(String text) {
		
		WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(text(\""+text+"\"))"));
		ele.click();
	}
	
    public void scrollActionGes1(String text) {
		
		WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(text(\""+text+"\"))"));
		
		
		//ele.click();
	}
	
	public void swipeActionGes(WebElement ele, String direction, double percent) {
		
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
				"direction",direction,"percent",0.75));
	}

	public void longPressActionGes(WebElement ele, int duration) {
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",duration));
	}
	
	public void dragAndDropActionGes(WebElement ele, int xCor, int yCor) {
		
		driver.executeScript("mobile: dragGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),"endX", xCor, "endY", yCor));
	}
  
	
public void scrollActionGes(WebElement element) {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(text(\""+element+"\"));"));
		//element.click();
	}

public void TakescreenShot(String fileName) {

try {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\screenshots\\" + fileName +".png");
	FileUtils.copyFile(scrFile,DestFile);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}

	











}
