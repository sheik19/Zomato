package com.test.org.com.test.org;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.codoid.products.exception.FilloException;
import com.test.Utils.GetscreenShots;
import com.zomato.pages.FoodCheckListitems;
import com.zomato.pages.LoginPage;
import com.zomato.pages.SearchOrder;



public class FoodOrderinZomato extends Zomatobase {
	
	@Test(priority = 4)
	public void Launch_App_without_Credential() throws FilloException, InterruptedException{
		try {
		
		test=reports.createTest("Launch_App_without_Credential").assignAuthor("Sheik")
				.assignCategory("POC").assignDevice("ANDROID");
		
		LoginPage loginpageobj = new LoginPage(driver);
		test.log(Status.INFO,"Launching the Zomato_App without Credential");
		loginpageobj.login();
		test.log(Status.PASS,"Zomato App Launched Successfully");
		
		}
		catch(Exception e) {
		
		System.out.println(e);
		test.log(Status.FAIL,"due to "+e);
		TakescreenShot("OrderFood_without_Credential");
		
		
		}
		
	}
	

	
	@Test(priority=1)
	public void Launch_App_with_Mob_Num_Credential() throws FilloException, InterruptedException{
		
		try {
		test=reports.createTest("Launch_App_with_Mob_Num_Credential").assignAuthor("Sheik")
				.assignCategory("POC").assignDevice("ANDROID");
		
		
		
		LoginPage loginpageobj = new LoginPage(driver);
		test.log(Status.INFO,"launching the Zomato_App with Credential");
		loginpageobj.loginwithmobile();
		test.log(Status.PASS, "Zomato App Launched Successfully with Mobile Number");
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			test.log(Status.FAIL,"due to "+e);
			TakescreenShot("OrderFood_without_Credential");
			
		}
		
	
		
	}
	
	
	

	@Test(priority=0)
	public void OrderFood_without_Credential() throws FilloException, InterruptedException{
		try {
		
		test=reports.createTest("OrderFood_without_Credential").assignAuthor("Sheik")
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
		test.log(Status.INFO,"Verify the order details");
		checklistobj.check_the_order_list();
		test.log(Status.INFO,"Enter the Delivery Address and Choose Payment Method");
		checklistobj.Payment_Method();
		test.log(Status.PASS,"Ready to pay the Order Amount");
		}
		catch(Exception e) {
			System.out.println(e);
			test.log(Status.FAIL,"due to "+e);
			TakescreenShot("OrderFood_without_Credential");
			
		}
		
		
		
		
	}
	
/*@Test(priority=3)
	
	public void Order_with_Mob_Num_Credential() throws FilloException, InterruptedException{
	ExtentTest test=reports.createTest("Order_with_Mob_Num_Credential").assignAuthor("Sheik")
			.assignCategory("POC").assignDevice("ANDROID");
	
	
		
		LoginPage loginpageobj = new LoginPage(driver);
		SearchOrder searchpageobj = new SearchOrder(driver);
		FoodCheckListitems checklistobj = new FoodCheckListitems(driver);
		test.log(Status.INFO,"Launching the Zomato_App with Credential");
		loginpageobj.loginwithmobile();
		test.log(Status.PASS,"Launched Zomato with Mobile Number");
		test.log(Status.INFO,"Search and order the Food");
		searchpageobj.searchFood_withCredentials();
		test.log(Status.FAIL,"Oder is cancelled");
		
		
		
	
	
}
*/
	@Test(priority=2)

	public void OrderFood_without_Credential_outsidethe_delivery_location() throws FilloException, InterruptedException{
		try {
		
		test=reports.createTest("OrderFood_without_Credential_outsidethe_delivery_location").assignAuthor("Sheik")
				.assignCategory("POC").assignDevice("ANDROID");
		
		LoginPage loginpageobj = new LoginPage(driver);
		SearchOrder searchpageobj = new SearchOrder(driver);
		FoodCheckListitems checklistobj = new FoodCheckListitems(driver);
		test.log(Status.INFO,"Launching the Zomato_App without Credential");
		//loginpageobj.login();
		loginpageobj.orderFood_outside();
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
	
     catch(Exception e) {
		
		System.out.println(e);
		test.log(Status.FAIL,"due to "+e);
		TakescreenShot("OrderFood_without_Credential_outsidethe_delivery_location");
		
		
		
     }

	}
	
	
}


