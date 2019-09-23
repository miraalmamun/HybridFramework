package com.zoho.hybrid.driver;

import java.util.Hashtable;

import com.zoho.hybrid.utils.ExcelReadWrite;

public class DriverScript {

	public void executeKeywords(String testName, ExcelReadWrite excel, Hashtable<String, String> testData) {

		int rowNumber = excel.getRowCount("Keywords");
		System.out.println("Number of rows in Keywords sheet: " + rowNumber);

		for (int rNum = 2; rNum <= rowNumber; rNum++) {
			String tcid = excel.getCellData("Keywords", "TCID", rNum);
			if(tcid.equals(testName)){
			String keyword = excel.getCellData("Keywords", "Keyword", rNum);
			String objectKey = excel.getCellData("Keywords", "Object", rNum);
			String dataKey = excel.getCellData("Keywords", "Data", rNum);
			String data = testData.get(dataKey);
			System.out.println(tcid+"---"+keyword+"---"+objectKey+"---"+data);

		}
		}
	}

}
