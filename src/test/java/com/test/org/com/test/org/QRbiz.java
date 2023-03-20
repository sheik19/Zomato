package com.test.org.com.test.org;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class QRbiz extends QRbizBaseclass {
	
	
@Test	
public void QRbiz_NewRegister() {	
	try {
		test=reports.createTest("Launching QRbiz App and Register a Account").assignAuthor("Sheik")
				.assignCategory("POC").assignDevice("ANDROID");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
		Thread.sleep(1000); //android.widget.TextView
		driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Business Registration No.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Business Registration No.']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Business Registration No.']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
		Thread.sleep(1000);
		test.info("Customer Trying to create new Register in QRbiz");
		test.log(Status.PASS, "Customer is Ready to Register");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		test.log(Status.FAIL,"due to "+e);
		
	}


}


	
	
	
	
	
	
	
	
	
	

}
