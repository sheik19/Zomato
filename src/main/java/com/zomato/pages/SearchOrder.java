package com.zomato.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.View;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;
import com.test.utils.AndroidActions;
import com.test.utils.Common_Android_Actions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchOrder extends Common_Android_Actions {
	
	public AndroidDriver driver;

	public SearchOrder(AndroidDriver driver) {
    super(driver);
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(id = "com.application.zomato:id/search_bar_view_flipper")
	private WebElement searchbar;
	
	@AndroidFindBy(id = "com.application.zomato:id/edittext")
	private WebElement searchfood;
	
	@AndroidFindBy(id = "com.application.zomato:id/auto_suggest_view_pager")
	private WebElement foodlist;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout")
	private WebElement Foodlist;
	
	
	@AndroidFindBy(id = "com.application.zomato:id/top_right_lottie")
	private WebElement givelike;
	
	@AndroidFindBy(id = "com.application.zomato:id/imageOverlay")
	private WebElement selectthefood;
	
	@AndroidFindBy(id = "com.application.zomato:id/ll_root")
	private WebElement addthefood;
	
	@AndroidFindBy(id = "com.application.zomato:id/next_state")
	private WebElement check_out_price_continue;
	
	@AndroidFindBy(id = "com.application.zomato:id/skip_button")
	private WebElement skip;
	
	@AndroidFindBy(id = "com.application.zomato:id/leftIcon")
	private WebElement leftback;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Biryani']")
	private WebElement Biryani;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD']")
	private WebElement Add;
	
	@AndroidFindBy(id = "com.application.zomato:id/next_state")
	private WebElement Addaddress;
	
	@AndroidFindBy(id = "com.application.zomato:id/next_state")
	private WebElement Addpersonal;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Payment Method']")
	private WebElement PaymentMethod;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Dining']")
	private WebElement Dining;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Plain Dosa']")
	private WebElement PlainDosa;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Similar Restaurants']")
	private WebElement Zomatologo;
	
	//
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hotel Saravana Bhavan']")
	private WebElement swipeHotchips;
	
	
	
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.view.ViewGroup/android.widget.FrameLayout/"
			+ "androidx.recyclerview.widget.RecyclerView/"
			+ "android.widget.LinearLayout[4]/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/"
			+ "android.widget.CheckBox")
	private WebElement Addon1;
	
	
	@AndroidFindBy(id = "com.application.zomato:id/button")
	private WebElement AddItems;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Next']")
	private WebElement Next;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='A2B - Adyar Ananda Bhavan']")
	private WebElement A2B;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button")
	private WebElement Additem;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void searchFood() throws FilloException, InterruptedException {

	    Thread.sleep(3000);
		searchbar.click();
		Thread.sleep(3000);
		searchfood.click();
		//String data=fillo_Connection().getField("Item");
		searchfood.sendKeys("Dosa");
		Thread.sleep(2000);
		driver.hideKeyboard();
		//scrollActionGes("Paneer Dosa");
		foodlist.click();
		Thread.sleep(2000);
		givelike.click();
		Thread.sleep(2000);
		skip.click();
		Thread.sleep(4000);
		selectthefood.click();
		Thread.sleep(2000);
		addthefood.click();
		Thread.sleep(3000);
		check_out_price_continue.click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	

	
	public void searchFood1() throws FilloException, InterruptedException {

		
		/*searchbar.click();
		searchfood.click();
		//String data=fillo_Connection().getField("Item");
		searchfood.sendKeys("Dosa");
		Thread.sleep(2000);
		driver.hideKeyboard();
		leftback.click();
		Thread.sleep(2000);
		Biryani.click();
		Thread.sleep(2000);
		scrollActionGes("Ambur Star Briyani");
		Thread.sleep(2000);*/
		
		  Thread.sleep(4000);
			searchbar.click();
			Thread.sleep(3000);
			searchfood.click();
			//String data=fillo_Connection().getField("Item");
			searchfood.sendKeys("Dosa");
			Thread.sleep(2000);
			driver.hideKeyboard();
			foodlist.click();
			Thread.sleep(2000);
			givelike.click();
			Thread.sleep(2000);
			skip.click();
			Thread.sleep(2000);
			selectthefood.click();
			Thread.sleep(2000);
			addthefood.click();
			Thread.sleep(2000);
			check_out_price_continue.click();
			Thread.sleep(5000);
		
		
	}
	
	public void ItemNeedtoAdd()  {
		
		try {
			Thread.sleep(3000);
			Add.click();
			Thread.sleep(2000);
			Addon1.click();
			Thread.sleep(3000);
			AddItems.click();
			Thread.sleep(2000);
			Next.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
		
	}
	
	public void ItemNeedtoAdd_with_mob() throws FilloException, InterruptedException {
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
		Addon1.click();
		Thread.sleep(2000);
		AddItems.click();
		Thread.sleep(2000);
		Next.click();	
		Thread.sleep(2000);
		Addaddress.click();
	}

	
	public void orderFood() {
		//scrollActionGes("Ambur Star Biryani");
		
		givelike.click();
		skip.click();
		selectthefood.click();
		addthefood.click();
		check_out_price_continue.click();
		
	}
	
	public void orderFood2() {
		givelike.click();
		//skip.click();
		selectthefood.click();
		addthefood.click();
		check_out_price_continue.click();
		
	}
	
	
public void searchFood_withCredentials() throws FilloException, InterruptedException {

		
		searchbar.click();
		searchfood.click();
		Thread.sleep(2000);
		//String data=fillo_Connection().getField("Item");
		searchfood.sendKeys("Biryani");
		Thread.sleep(2000);
		driver.hideKeyboard();
		foodlist.click();
		givelike.click();
		Thread.sleep(2000);
		scrollActionGes("Ambur Star Briyani");
		Thread.sleep(2000);
		Add.click();
		Next.click();
		Thread.sleep(2000);
		scrollActionGes("CANCELLATION POLICY");
		Thread.sleep(4000);
		PaymentMethod.click();
		
		
	}

public void Dining() throws FilloException, InterruptedException {

	
	searchbar.click();
	searchfood.click();
	//String data=fillo_Connection().getField("Item");
	searchfood.sendKeys("Dosa");
	Thread.sleep(2000);
	Dining.click();
	Thread.sleep(2000);
	PlainDosa.click();
	Thread.sleep(2000);
	scrollActionGes("A2B - Adyar Ananda Bhavan");
	scrollActionGes("Similar Restaurants");
	Thread.sleep(2000);
	swipeActionGes(swipeHotchips,"left",0.75);
	
	
}

public void orderFood_outside() {
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

}
