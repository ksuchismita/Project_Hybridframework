package com.jmr.selenium.profittomodules;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.jmr.selenium.pageobjects.CustomerSpecificRepayment;
import com.jmr.selenium.utility.ExcelUtils;

public class CustomerSpecificRepayment_Action {

	static int r = 1;

	public static void CustSpecPayment(WebDriver driver) throws Exception {
		String custCode = ExcelUtils.getCellData(r, 0);
		CustomerSpecificRepayment.click_lend_Tab(driver).click();
		CustomerSpecificRepayment.click_lend_Paym(driver).click();
		CustomerSpecificRepayment.cust_Specf_Repy(driver).click();
		CustomerSpecificRepayment.Click_Add_Btn(driver).click();
		CustomerSpecificRepayment.Click_Cust_Code_Lp(driver).click();
		Thread.sleep(500);
		CustomerSpecificRepayment.Click_Cust_Code(driver).click();
		Thread.sleep(1000);
		CustomerSpecificRepayment.Entry_Cust_Code(driver).sendKeys(custCode);
		Thread.sleep(500);
		CustomerSpecificRepayment.Click_On_Filtr_Btn(driver).click();
		Thread.sleep(500);
		CustomerSpecificRepayment.Click_On_Cust_Data(driver).click();
		Thread.sleep(500);
		CustomerSpecificRepayment.click_Fatch_Btn(driver).click();
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,250)", "");
		if (driver.findElement(By.xpath("//DIV[@class='l2l-error alert alert-danger']")).getText()
				.contains("No Due Payments Available")) {
			ExcelUtils.setCellData(
					driver.findElement(By.xpath("//DIV[@class='l2l-error alert alert-danger']")).getText(), r, 3);
			CustomerSpecificRepayment.click_On_Profitto(driver).click();

		} else {

			ExcelUtils.setCellData(CustomerSpecificRepayment.get_Pay_Amt(driver).getAttribute("value"), r, 1);
			String SettledAmount = ExcelUtils.getCellData(r, 1);
			CustomerSpecificRepayment.setl_Amt(driver).sendKeys(SettledAmount);

			CustomerSpecificRepayment.mode_Of_Paym(driver).click();

			Thread.sleep(1000);
			List<WebElement> modeOfPayment = driver
					.findElements(By.xpath("//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
			for (WebElement webElement1 : modeOfPayment) {
				if (!webElement1.getText().equalsIgnoreCase(" ")) {
					if (webElement1.getText().equalsIgnoreCase("PAYMOB")) {
						webElement1.click();
						break;
					}
				}
			}
			JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
			jsx1.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(500);
			CustomerSpecificRepayment.click_On_Alc_Pay(driver).click();
			ExcelUtils.setCellData(
					driver.findElement(By.xpath(".//*[@id='tabs0.blocks0.Fields4.value']")).getAttribute("value"), r,
					2);
			CustomerSpecificRepayment.click_On_Cinfirm(driver).click();
			Thread.sleep(500);
			CustomerSpecificRepayment.click_On_Profitto(driver).click();
			Thread.sleep(1000);
		}
		r++;
	}

}
