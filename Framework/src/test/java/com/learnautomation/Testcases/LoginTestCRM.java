package com.learnautomation.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Loginpage;
import com.learnautomation.utilities.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {

	@Test
	public void loginApp() {
		logger = report.createTest("Login to CRM");
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		ExcelDataProvider excel = new ExcelDataProvider();
		System.out.println(driver.getTitle());
		Loginpage Loginpage = PageFactory.initElements(driver, Loginpage.class);
		logger.info("Starting Application");
		loginpage.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("login sucess");
	}

}