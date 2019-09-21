package com.zoho.hybrid.SuiteA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.hybrid.Base.BaseTest;

public class LoginTest extends BaseTest 
{
	
	@Test(dataProvider = "getData")
	public void doLogin(String a, String b,int c)
	{
		System.out.println("I am doLogin Test");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{   
		System.out.println("DataProvider");
		Object[][] data = new Object[2][3];
		
		data[0][0] = "5";
		data[0][1]="a";
		data[0][2]=4;
		
		data[1][0] = "4";
		data[1][1]="b";
		data[1][2]=3;
		
		return data;
	}
	
	
	

}
