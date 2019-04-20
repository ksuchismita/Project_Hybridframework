package com.jmr.selenium.profittomodules;

import org.openqa.selenium.WebDriver;

import com.jmr.selenium.pageobjects.LogIn_Page;
import com.jmr.selenium.utility.ExcelUtils;

// Now this method does not need any arguments
public class SignIn_Action {
	static int i = 1;

	public static void Execute(WebDriver driver) throws Exception {
		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(i, 1);
		String sPassword = ExcelUtils.getCellData(i, 2);
		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
		LogIn_Page.btn_LogIn(driver).click();
		i++;

	}

}