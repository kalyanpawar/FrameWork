package com.april.Utility;

import org.testng.annotations.DataProvider;

public class SDataProvideClass {
	
	@DataProvider
	public static Object[][] dataForRegistration() throws Exception{
		ExcelDetaProvider ex=new ExcelDetaProvider();
		Object[][] obj=new Object[1][5];
		for(int i=0;i<5;i++) {
			obj[0][i]=ex.getStringData("sheet1", 2, i);
		}
		return obj;
	}
	
	@DataProvider
	public static Object[][] dataForOrder() throws Exception{
		ExcelDetaProvider ex=new ExcelDetaProvider();
		Object[][] obj=new Object[1][8];
		for(int i=0;i<8;i++) {
			obj[0][i]=ex.getStringData("sheet1", 4, i);
			System.out.println(obj[0][i]);
		}
		return obj;
	}
	
	@DataProvider
	public static Object[][] dataForVerifyOrder() throws Exception{
		ExcelDetaProvider ex=new ExcelDetaProvider();
		Object[][] obj=new Object[1][2];
		for(int i=0;i<2;i++) {
			obj[0][i]=ex.getStringData("sheet1", 6, i);
			System.out.println(obj[0][i]);
		}
		return obj;
	}
	
	@DataProvider
	public static Object[][] dataForBulckOrder() throws Exception{
		ExcelDetaProvider ex=new ExcelDetaProvider();
		Object[][] obj=new Object[1][3];
		for(int i=0;i<3;i++) {
			obj[0][i]=ex.getStringData("sheet1", 8, i);
			System.out.println(obj[0][i]);
		}
		return obj;
	}
}
