package com.zomato.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;
import com.test.utils.AndroidActions;
import com.test.utils.Common_Android_Actions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FoodCheckListitems extends Common_Android_Actions {
	
	public AndroidDriver driver;

	public FoodCheckListitems(AndroidDriver driver) {
    super(driver);
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id ="com.application.zomato:id/next_state")
	private WebElement Add_personal;
	
	@AndroidFindBy(id = "com.application.zomato:id/et_final")
	private WebElement entername;
	
	@AndroidFindBy(id = "com.application.zomato:id/mobile_edit_text")
	private WebElement clickmobilenumber_input;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='078679 47384']")
	private WebElement select_mobile_number;
	
	@AndroidFindBy(id = "com.application.zomato:id/continue_button")
	private WebElement confirmorder;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD']")
	private WebElement Add;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CANCELLATION POLICY']")
	private WebElement Cancellation;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Enter complete address']")
	private WebElement completeAddress;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='College']")
	private WebElement college;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='House number / Block *']")
	private WebElement HouseNo;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Floor *']")
	private WebElement Floor;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Building *']")
	private WebElement Building;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Save address']")
	private WebElement SaveAddress;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Payment Method']")
	private WebElement AddPayment;
	
	
	
	//College
	public void check_the_order_list() throws InterruptedException, FilloException{
		
		Add_personal.click();
		Thread.sleep(3000);
		entername.sendKeys("Sheik");
		clickmobilenumber_input.click();
		select_mobile_number.click();
		Thread.sleep(2000);
		confirmorder.click();
		Thread.sleep(12000);
	}
	
	public void check_the_order_list11() throws InterruptedException, FilloException{
		
	
		Thread.sleep(4000);
		Add_personal.click();
		Thread.sleep(5000);
		entername.click();
		entername.sendKeys("Sheik");
		clickmobilenumber_input.click();
		select_mobile_number.click();
		Thread.sleep(2000);
		confirmorder.click();
		Thread.sleep(12000);
	}
	
public void check_the_order_list1() throws InterruptedException, FilloException{
		
		
		Thread.sleep(4000);
		Add.click();
		Thread.sleep(3000);
		entername.clear();
		//entername.sendKeys(fillo_Connection().getField("Customer_Name"));
		entername.sendKeys("Sheik");
		clickmobilenumber_input.click();
		select_mobile_number.click();
		Thread.sleep(5000);
		confirmorder.click();
		Thread.sleep(3000);
		
		
	}

public void Payment_Method() throws InterruptedException, FilloException{
	
	//waitForVisibility(check_out_items_continue);
	Thread.sleep(3000);
	completeAddress.click();
	Thread.sleep(3000);
	HouseNo.sendKeys("12");
	Thread.sleep(3000);
	Floor.sendKeys("2nd");
	Thread.sleep(3000);
	Building.sendKeys("Amaranth");
	Thread.sleep(3000);
	SaveAddress.click();
	Thread.sleep(5000);
	AddPayment.click();
	Thread.sleep(5000);
}



	
	
	
	
	
	
	
	
	
	
	

}
