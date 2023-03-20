package com.zomato.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Test;

//import com.aventstack.extentreports.util.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LoginPage{
	
	public AndroidDriver driver;

	public LoginPage(AndroidDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	
	@AndroidFindBy(id = "com.application.zomato:id/bg_image")
	WebElement ZomataAppImage;
	
	@AndroidFindBy(id = "com.application.zomato:id/skip_button")
	WebElement skipthelogin;
	
	//com.android.permissioncontroller:id/permission_allow_foreground_only_button
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	WebElement allowdeviceLocation;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text ='078679 47384']")
	WebElement enterMobilenum;
	
	@AndroidFindBy(id = "com.application.zomato:id/fw_mobile_edit_text")
	WebElement clickMobilenum;
	
	@AndroidFindBy(id = "com.application.zomato:id/search_bar_view_flipper")
	private WebElement searchbar;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Search for area, street name…']")
	private WebElement enterloc;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	private WebElement selectloc;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm location']")
	private WebElement entercomplete;
	
	@AndroidFindBy(id = "com.application.zomato:id/left_action_image_view")
	private WebElement clickmap;

	public void login() throws InterruptedException {
		Thread.sleep(3000);
		allowdeviceLocation.click();
		skipthelogin.click();
		Thread.sleep(3000);
		
		
	
	}
	
    public void loginwithmobile() throws InterruptedException {
		
		allowdeviceLocation.click();
		clickMobilenum.click();
		enterMobilenum.click();
		Thread.sleep(10000);
		//skipthelogin.click();
	
	}
    
    public void orderFood_outside() throws InterruptedException {
    	
    	Thread.sleep(3000);
		allowdeviceLocation.click();
		skipthelogin.click();
		Thread.sleep(3000);
    	clickmap.click();
    	Thread.sleep(4000);
    	enterloc.sendKeys("Taramani");
    	Thread.sleep(4000);
    	selectloc.click();
    	Thread.sleep(3000);
    	entercomplete.click();
    	Thread.sleep(4000);
    	
    	
    }



}