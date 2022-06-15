package com.test.utility;

import java.util.ArrayList;

import javaSession.Xls_Reader;

public class SearchTest {
	static Xls_Reader reader;
	
	public static ArrayList<String> getDataFromFile() {
		ArrayList<String> myData = new ArrayList<String>();
		try {
			reader = new Xls_Reader("D:\\Selenium\\Project\\TestNGListenerProject\\src\\com\\testData\\SearchItem.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String item = reader.getCellData("Sheet1", "Items", rowNum);
			myData.add(item);
		}
		return myData;
	}
}
