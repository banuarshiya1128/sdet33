package com.crm.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.genericUtility.ConstantPath;
import com.crm.genericUtility.ExcelUtility;

public class TestNGDataProvider1 {
	@Test(dataProvider = "dataprovider_excel")
	
	
	public void dataProviderTest(String Fruit,String Vegetable) {
		System.out.println(Fruit+" === "+Vegetable);
	}
	
	
	
	
	@DataProvider
	public Object[][] dataProvider_company()
	{
		Object[][] arr=new Object[5][2];
		arr[0][0] = " TestYantra";
		arr[0][1] = 2007;
		
		arr[1][0] = " TestYantra1";
		arr[1][1] = 2008;
		
		arr[2][0] = " TestYantra2";
		arr[2][1] = 2009;
		
		arr[3][0] = " TestYantra3";
		arr[3][1] = 2010;
		
		arr[4][0] = " TestYantra4";
		arr[4][1] = 2011;
		
		
		return arr;
		
	}
	@DataProvider
	public Object[][] dataprovider_excel() throws Throwable{
		ExcelUtility.openExcel("./src/test/resources/datatest.xlsx");
		Object[][] arr = ExcelUtility.fetchMutipledata("SDET33");
		return arr;
		
	}
	
	
}
