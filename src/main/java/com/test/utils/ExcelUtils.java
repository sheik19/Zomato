package com.test.utils;

import com.test.utils.XLs_Reader;

public class ExcelUtils {
	
	
	
public static String getData(String data) {
	XLs_Reader getdata =new XLs_Reader("C:\\Users\\optimum\\git\\Zomato\\com.zomato.org\\Excel_data_Provider\\ZomatoOrderDetail.xlsx");
    String Sheet="Order";
    String value=getdata.getCellData(Sheet, data, 1);
    System.out.println(value);
    return value;
}
    
    
}
