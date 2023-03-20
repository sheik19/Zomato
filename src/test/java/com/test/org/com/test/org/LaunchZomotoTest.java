package com.test.org.com.test.org;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.test.utils.Common_Android_Actions;
import com.zomato.pages.FoodCheckListitems;
import com.zomato.pages.LoginPage;
import com.zomato.pages.SearchOrder;

import io.appium.java_client.android.AndroidDriver;


public class LaunchZomotoTest extends Zomatobase{
	
	
	
	

	@Test
	public void ZomotoOrderTest() throws InterruptedException, MalformedURLException {
		try {
			
			test=reports.createTest("Order Coffee by Zomata Application").assignAuthor("Sheik")
					.assignCategory("POC").assignDevice("ANDROID");
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(1000);  
		driver.findElement(By.id("com.application.zomato:id/skip_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.application.zomato:id/search_bar_view_flipper")).click();
		Thread.sleep(2000); 
		driver.findElement(By.id("com.application.zomato:id/edittext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.application.zomato:id/edittext")).sendKeys("coffee");
		Thread.sleep(2000);
		test.info("Ordering Coffee");
        driver.findElement(By.id("com.application.zomato:id/auto_suggest_view_pager")).click();
		Thread.sleep(3000);  //com.application.zomato:id/top_right_lottie
		driver.findElement(By.id("com.application.zomato:id/top_right_lottie")).click();
		Thread.sleep(1000); 
		driver.findElement(By.id("com.application.zomato:id/skip_button")).click();
		Thread.sleep(1000);
		scrollActionGes("Kaapiyumm");
		Thread.sleep(2000); 
		test.info("Kaapiyumm Restaurent is chosen");
		//driver.findElement(By.id("com.application.zomato:id/imageOverlay")).click();
		//Thread.sleep(1000);   
		driver.findElement(By.id("com.application.zomato:id/ll_root")).click();
		Thread.sleep(2000);  
		driver.findElement(By.id("com.application.zomato:id/checkout_button_bg")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.application.zomato:id/next_state")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.application.zomato:id/et_final")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.application.zomato:id/et_final")).sendKeys("Sheik");
		Thread.sleep(2000); 
		driver.findElement(By.id("com.application.zomato:id/mobile_edit_text")).click();
		Thread.sleep(4000);
		/*driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='078679 47384']")).click();
		Thread.sleep(5000);
		test.info("Successfully Verified the Mobile Number with OTP generation");
		test.log(Status.PASS, "OTP Verified Successfully");
		driver.findElement(By.id("com.application.zomato:id/continue_button")).click();
		Thread.sleep(5000);
		test.log(Status.PASS, "Food Order is successfully done");
		driver.findElement(By.xpath("//android.widget.Button[@text='Enter complete address']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='House number / Block *']")).sendKeys("12");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Floor *']")).sendKeys("2nd");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Building *']")).sendKeys("Amaranth");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Save address']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add Payment Method']")).click();
		Thread.sleep(4000);*/
		test.info("Choose the payment Method");
		test.log(Status.PASS, "Customer is ready to Pay");
		
		}
		
		catch(Exception e) {
			System.out.println(e);
			test.log(Status.FAIL, "Order Food by Zomata Application is failed due to "+e);
			TakescreenShot("Order Food by Zomata Application is failed due to " +e);
		}
		
		


		// TODO Auto-generated method stub

	}

}
