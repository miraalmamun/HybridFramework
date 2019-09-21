package com.zoho.hybrid.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.zoho.hybrid.utils.ExcelReadWrite;

public class BaseTest {
	public Properties env;
	public Properties prodUat;
	public ExcelReadWrite excel;

	@BeforeTest
	public void init() {
        System.out.println("Initialization");
		env = new Properties();
		prodUat = new Properties();

		try {
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\env.properties");
			env.load(fis);
			String env1 = env.getProperty("env");
			fis = new FileInputStream(".\\src\\test\\resources\\" + env1 + ".properties");
			prodUat.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

		excel = new ExcelReadWrite(prodUat.getProperty("suiteA_xls"));

	}

}
