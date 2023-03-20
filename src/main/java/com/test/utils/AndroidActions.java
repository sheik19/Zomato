package com.test.utils;

import static java.time.Duration.ofMillis;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.google.common.collect.ImmutableMap;
import com.test.utils.GlobalParams;
import com.test.utils.TestUtils;
import com.zomato.pages.Fillo_Manager;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AndroidActions {
	public AndroidDriver driver;
	public static String Item;
	public static String Customer_Name;
	public static String Mob_Number;
	public static Recordset rs;
	public static Connection connection;
    TestUtils utils=new TestUtils();

    public AndroidActions(AndroidDriver driver){
    	
        this.driver = driver;
        //PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getText(By e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

  

   /* public WebElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
        return (WebElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector()."+ childLocAttr +"(\"" + childLocValue + "\"));");
    }*/

    public WebElement iOSScrollToElementUsingMobileScroll(WebElement e) {
        RemoteWebElement element = ((RemoteWebElement) e);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
//	  scrollObject.put("direction", "down");
//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
//	  scrollObject.put("name", "test-ADD TO CART");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        return e;
    }

    public By iOSScrollToElementUsingMobileScrollParent(WebElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement)parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
	  scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = MobileBy.iOSNsPredicateString(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

   /* public WebElement scrollToElement(WebElement element, String direction) throws Exception {
        org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, Duration.ofSeconds(10))) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }*/

    public void scrollToElement() throws Exception {
    	 boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
    	    	    "left", 100, "top", 100, "width", 200, "height", 200,
    	    	    "direction", "down",
    	    	    "percent", 3.0
    	    	));
    }

    public boolean find(final WebElement element, Duration i) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, i);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, Duration timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe() {
    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    	    "left", 100, "top", 100, "width", 200, "height", 200,
    	    "direction", "left",
    	    "percent", 0.75
    	));

    }
    
public static Recordset fillo_Connection() throws FilloException {
		
		
		Fillo fillo=new Fillo();
		connection=fillo.getConnection("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\Excel_data_Provider\\ZomatoOrderDetail.xlsx");
		
		String Query="Select * from Sheet where Test='Test1'";
		rs=connection.executeQuery(Query);
		while(rs.next()) {
			try {
				
				Item=rs.getField("Item").toString();
				Customer_Name=rs.getField("Customer_Name").toString();
				Mob_Number=rs.getField("Mob_Number").toString();
			} catch (FilloException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		
		
		return rs;
		
	}

public void swipeActionGes(WebElement ele, String direction, double percent) {
	
	((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
			"direction","left","percent",0.75));
}

public void scrollAction() {
	((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
}

public void scrollActionGes(String text) {
	
	WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
			+ "scrollIntoView(text(\""+text+"\"));"));
	//waitForVisibility(ele);
	ele.click();
}

public void TakescreenShot() {

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


}


public String getScreenshot(String testCaseName, AppiumDriver driver) throws IOException {

File source = driver.getScreenshotAs(OutputType.FILE);
String destination = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
FileUtils.copyFile(source, new File(destination));
return destination;

}


    
   

}
