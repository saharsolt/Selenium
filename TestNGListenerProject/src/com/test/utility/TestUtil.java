package com.test.utility;


import java.util.ArrayList;
import javaSession.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("D:\\Selenium\\Project\\TestNGListenerProject\\src\\com\\testData\\EbaySignUp.xlsx");
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		for(int rowNum=2; rowNum <= reader.getRowCount("SignUpSheet"); rowNum++ ) {
			
			String firstName = reader.getCellData("SignUpSheet", "firstName", rowNum);
			String lastName = reader.getCellData("SignUpSheet", "lastName", rowNum);
			String email = reader.getCellData("SignUpSheet", "email", rowNum);
			String passWord = reader.getCellData("SignUpSheet", "passWord", rowNum);
		
			Object obj[] = {firstName,lastName,email,passWord};
			myData.add(obj);
		}
		return myData;
	}
}
