package com.zomato.pages;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Fillo_Manager {
	
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getMob_Number() {
		return Mob_Number;
	}
	public Fillo_Manager() {
		super();
	}
	public Fillo_Manager(String item, String customer_Name, String mob_Number) {
		super();
		Item = item;
		Customer_Name = customer_Name;
		Mob_Number = mob_Number;
	}
	public void setMob_Number(String mob_Number) {
		Mob_Number = mob_Number;
	}
	public String Item;
	public String Customer_Name;
	public String Mob_Number;
	
	/*
	 * public static Object fillo_Connection() throws FilloException {
	 * 
	 * 
	 * Fillo fillo=new Fillo(); Connection connection=fillo.getConnection(
	 * "C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\Excel_data_Provider\\ZomatoOrderDetail.xlsx"
	 * );
	 * 
	 * String Query="Select * from Sheet where Test='Test8'"; Recordset
	 * rs=connection.executeQuery(Query); while(rs.next()) { try {
	 * System.out.println(Item=rs.getField("Item").toString());
	 * System.out.println(Customer_Name=rs.getField("Customer_Name").toString());
	 * System.out.println(Mob_Number=rs.getField("Mob_Number").toString()); } catch
	 * (FilloException e) { // TODO Auto-generated catch block e.printStackTrace();
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * rs.close(); connection.close(); return rs;
	 * 
	 * }
	 */
	
	
		
		
	}
	

