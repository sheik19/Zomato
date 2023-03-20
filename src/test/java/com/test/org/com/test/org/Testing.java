package com.test.org.com.test.org;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;
import com.codoid.products.exception.FilloException;
import com.zomato.pages.FoodCheckListitems;
import com.zomato.pages.LoginPage;
import com.zomato.pages.SearchOrder;

import io.appium.java_client.android.AndroidDriver;



public class Testing extends Zomatobase {
	
	
	@Test(priority=0)
	public void OrderFood_without_Credential_outsidethe_delivery_location() throws FilloException, InterruptedException{
		ExtentTest test=reports.createTest("Launch_App_without_Credential_orderFood").assignAuthor("Sheik")
				.assignCategory("POC").assignDevice("ANDROID");
		
		LoginPage loginpageobj = new LoginPage(driver);
		SearchOrder searchpageobj = new SearchOrder(driver);
		FoodCheckListitems checklistobj = new FoodCheckListitems(driver);
		test.log(Status.INFO,"Launching the Zomato_App without Credential");
		loginpageobj.login();
		//loginpageobj.orderFood_outside();
		test.log(Status.PASS,"Zomato App Launched Successfully");
		test.log(Status.INFO,"Searching the Food and select the Food for Order ");
		searchpageobj.searchFood();
		
		test.log(Status.PASS,"Custmer Search the Food and ordering");
		test.log(Status.INFO,"Check the Order Details");
		checklistobj.check_the_order_list();
		test.log(Status.PASS,"Oder_details verified successfully");
		test.log(Status.INFO,"Enter the Delivery Address and Choose Payment Method");
		checklistobj.Payment_Method();
		test.log(Status.PASS,"Ready to pay the Order Amount");
		
		
	}
	
	
	
	
	
	
	
	
	
}
