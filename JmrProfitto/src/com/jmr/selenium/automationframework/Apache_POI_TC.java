package com.jmr.selenium.automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jmr.selenium.profittomodules.CustomerSpecificRepayment_Action;
import com.jmr.selenium.profittomodules.Prospect_Cre_Action;
import com.jmr.selenium.profittomodules.SignIn_Action;
import com.jmr.selenium.utility.Constant;
import com.jmr.selenium.utility.ExcelUtils;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;
	public static void login() throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet
		// name are parameters to this method
		int ref = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "LoginData");
		
		for (int i = 1; i <= 1; i++) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.get(Constant.BASE_URL);
			driver.manage().window().maximize();
			SignIn_Action.Execute(driver);

			if (driver.getTitle().isEmpty()) {
				System.out.println("Login Successfully");
				ExcelUtils.setCellData("Pass", i, 3);
			} else {

				ExcelUtils.setCellData(driver.findElement(By.xpath(".//*[@id='fullpage']/div[2]/div/div/div[2]/div/span")).getText(),i, 3);
				System.out.println("Login Failed, now it is the time to Log Off buddy.");
			}
		}
	}
	public static void custCrea() throws Exception  {

		// This is to open the Excel file. Excel path, file name and the sheet Employment_Details Documents_Details

		int ref1 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "General_Details");
		for (int i = 1; i <= ref1; i++) {
			Prospect_Cre_Action.generalDetails(driver);
		}

		int ref2 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "Communication_Details");
		for (int j = 1; j <= ref2; j++) {
			Prospect_Cre_Action.communicationDetails(driver);
		}

		int ref3 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "Employment_Details");
		for (int k = 1; k <= ref3; k++) {
			Prospect_Cre_Action.employmentDetails(driver);
		}

		int ref4 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "Additional_Details");
		for (int l = 1; l <= ref4; l++) {
			Prospect_Cre_Action.additionalDetails(driver);
		}
		int ref5 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "Documents_Details");
		for (int l = 1; l <= ref5; l++) {

			Prospect_Cre_Action.documentsDetails(driver);
			ExcelUtils.setCellData("Customer Create Successfully", l, 4);
			ExcelUtils.setCellData(driver.findElement(By.xpath("//SPAN[@l2l-field-id='refNumber']")).getText(),l,5);

		}
	}
	public static void custPayment() throws Exception {
		int ref6 = ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData1, "Cust_Code_For_Payment");
		for (int m = 1; m <= ref6; m++) {
			CustomerSpecificRepayment_Action.CustSpecPayment(driver);
		}

	}

}