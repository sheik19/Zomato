package com.test.org.com.test.org;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Order_outerboundary extends Zomatobase{
	
	
	@Test
	public void ZomotoOrderTest() throws InterruptedException, MalformedURLException {
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(1000);  
		driver.findElement(By.id("com.application.zomato:id/skip_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.application.zomato:id/left_action_image_view")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.application.zomato:id/edittext")).sendKeys("Taramani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("//com.application.zomato:id/button_save_address")).click();
		Thread.sleep(1000);
	}
		
	
	

}
