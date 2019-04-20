package com.jmr.selenium.profittomodules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jmr.selenium.pageobjects.Prospect_Creation_Page;
import com.jmr.selenium.utility.ExcelUtils;

public class Prospect_Cre_Action {

	public static void generalDetails(WebDriver driver) throws Exception {
		int j = 1;

		Prospect_Creation_Page.cust_Menu(driver).click();
		Prospect_Creation_Page.retil_Menu(driver).click();
		Prospect_Creation_Page.prost_Menu(driver).click();
		Prospect_Creation_Page.add_Btn(driver).click();

		String pRogramType = ExcelUtils.getCellData(j, 1);
		Select dropDown = new Select(Prospect_Creation_Page.program_Type(driver));
		List<WebElement> values = dropDown.getOptions();
		for (WebElement webElement : values) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(pRogramType)) {
					Thread.sleep(1000);
					webElement.click();
					break;
				}
			}
		}
		String fName = ExcelUtils.getCellData(j, 2);
		Prospect_Creation_Page.first_Name(driver).sendKeys(fName);
		String lName = ExcelUtils.getCellData(j, 3);
		Prospect_Creation_Page.last_Name(driver).sendKeys(lName);
		String fullName = ExcelUtils.getCellData(j, 4);
		Prospect_Creation_Page.full_Name(driver).sendKeys(fullName);

		// Select Date of Birth in profitto
		String dOB = ExcelUtils.getCellData(j, 5);
		Prospect_Creation_Page.date_Of_Birth(driver).click();
		String date_dd_MM_yyyy[] = (dOB.split("/"));

		// Select for Month
		Select month = new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-month']")));
		List<WebElement> list_AllMonth = month.getOptions();
		month.selectByIndex(Integer.parseInt(date_dd_MM_yyyy[1]));

		// Select for Year
		Select year = new Select(
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-year']")));
		List<WebElement> list_AllYear = year.getOptions();
		year.selectByValue(date_dd_MM_yyyy[2]);

		// Select for Date
		List<WebElement> date = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for (WebElement webElement : date) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (Integer.parseInt(webElement.getText()) == Integer.parseInt(date_dd_MM_yyyy[0])) {
					webElement.click();
					break;
				}
			}
		}

		// Select the Gender
		String gend = ExcelUtils.getCellData(j, 6);
		List<WebElement> radiolist = driver.findElements(By.xpath(".//*[@class='radio-inline']"));
		for (WebElement webElement : radiolist) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(gend)) {
					webElement.click();
					Thread.sleep(2000);
				}
			}
		}

		String nId = ExcelUtils.getCellData(j, 7);
		Prospect_Creation_Page.nat_Id(driver).sendKeys(nId);

		// Select Expiry Date Of NationalId in profitto
		String enid = ExcelUtils.getCellData(j, 8);
		Prospect_Creation_Page.exp_Nid(driver).click();
		String date_dd_MM_yyyy1[] = (enid.split("/"));

		// Select for Month
		Select month1 = new Select(
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-month']")));
		List<WebElement> list_AllMonth1 = month1.getOptions();
		month1.selectByIndex(Integer.parseInt(date_dd_MM_yyyy1[1]));

		// Select for Year
		Select year1 = new Select(
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-year']")));
		List<WebElement> list_AllYear1 = year1.getOptions();
		year1.selectByValue(date_dd_MM_yyyy1[2]);

		// Select for Date
		List<WebElement> date1 = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for (WebElement webElement1 : date1) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (Integer.parseInt(webElement1.getText()) == Integer.parseInt(date_dd_MM_yyyy1[0])) {
					webElement1.click();
					break;
				}
			}
		}
		String fName1 = ExcelUtils.getCellData(j, 9);
		Thread.sleep(1000);
		Prospect_Creation_Page.f_name(driver).sendKeys(fName1);

		j++;

	}

	public static void communicationDetails(WebDriver driver) throws Exception {

		int k = 1;

		Prospect_Creation_Page.click_ComDet(driver).click();

		String mNo = ExcelUtils.getCellData(k, 1);
		Prospect_Creation_Page.m_No(driver).sendKeys(mNo);

		String eMail = ExcelUtils.getCellData(k, 2);
		Prospect_Creation_Page.e_Mail(driver).sendKeys(eMail);

		String hPhNo = ExcelUtils.getCellData(k, 3);
		Prospect_Creation_Page.hp_No(driver).sendKeys(hPhNo);

		String aDdress = ExcelUtils.getCellData(k, 4);
		Prospect_Creation_Page.a_Ddress(driver).sendKeys(aDdress);

		String emergency_Contact_Person = ExcelUtils.getCellData(k, 5);
		Prospect_Creation_Page.em_Cont_Person(driver).sendKeys(emergency_Contact_Person);

		String emergency_Contact_Number = ExcelUtils.getCellData(k, 6);
		Prospect_Creation_Page.em_Cont_No(driver).sendKeys(emergency_Contact_Number);

		String emergency_Contact_Addr = ExcelUtils.getCellData(k, 7);
		Prospect_Creation_Page.em_Cont_Add(driver).sendKeys(emergency_Contact_Addr);

		String governorate = ExcelUtils.getCellData(k, 8);
		Prospect_Creation_Page.c_Governorate(driver).click();
		List<WebElement> governorateList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement : governorateList) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(governorate)) {
					webElement.click();
					Thread.sleep(1000);
					break;
				}
			}
		}

		String area = ExcelUtils.getCellData(k, 9);
		Prospect_Creation_Page.c_Area(driver).click();
		Thread.sleep(1000);
		List<WebElement> areaList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : areaList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(area)) {
					webElement1.click();
					break;
				}
			}
		}
		String telephone_Extension = ExcelUtils.getCellData(k, 10);
		Prospect_Creation_Page.c_Telephone_Extension(driver).sendKeys(telephone_Extension);
	}

	public static void employmentDetails(WebDriver driver) throws Exception {

		int l = 1;
		Prospect_Creation_Page.click_Emp_Det(driver).click();

		String emp_Status = ExcelUtils.getCellData(l, 1);
		Select dropDown1 = new Select(Prospect_Creation_Page.employment_Status(driver));
		List<WebElement> values1 = dropDown1.getOptions();
		for (WebElement webElement : values1) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(emp_Status)) {
					webElement.click();
					break;
				}
			}
		}

		String current_Emp = ExcelUtils.getCellData(l, 2);
		Prospect_Creation_Page.current_Employer(driver).sendKeys(current_Emp);

		String e_industry = ExcelUtils.getCellData(l, 3);
		Select dropDown2 = new Select(Prospect_Creation_Page.industry(driver));
		List<WebElement> values2 = dropDown2.getOptions();
		for (WebElement webElement : values2) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(e_industry)) {
					webElement.click();
					break;
				}
			}
		}

		// Select Hiring Date in profitto
		String emp_Hiring_Date = ExcelUtils.getCellData(l, 4);
		Prospect_Creation_Page.hiring_Date(driver).click();
		String date_dd_MM_yyyy[] = (emp_Hiring_Date.split("/"));

		// Select for Month
		Select month = new Select(
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-month']")));
		List<WebElement> list_AllMonth = month.getOptions();
		month.selectByIndex(Integer.parseInt(date_dd_MM_yyyy[1]));

		// Select for Year
		Select year = new Select(
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-year']")));
		List<WebElement> list_AllYear = year.getOptions();
		year.selectByValue(date_dd_MM_yyyy[2]);

		// Select for Date
		List<WebElement> date = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for (WebElement webElement : date) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (Integer.parseInt(webElement.getText()) == Integer.parseInt(date_dd_MM_yyyy[0])) {
					webElement.click();
					break;
				}
			}
		}

		String emp_Title = ExcelUtils.getCellData(l, 5);
		Prospect_Creation_Page.e_title(driver).sendKeys(emp_Title);

		String emp_incm = ExcelUtils.getCellData(l, 6);
		Prospect_Creation_Page.e_Monthly_Income(driver).sendKeys(emp_incm);

		String emp_exp = ExcelUtils.getCellData(l, 7);
		Prospect_Creation_Page.e_Monthly_Expense(driver).sendKeys(emp_exp);

		String emp_Work_Ph_No = ExcelUtils.getCellData(l, 8);
		Prospect_Creation_Page.e_Working_Phone_Number(driver).sendKeys(emp_Work_Ph_No);

		String emp_Work_Add = ExcelUtils.getCellData(l, 9);
		Prospect_Creation_Page.e_Working_Address(driver).sendKeys(emp_Work_Add);

		String emp_Work_Email = ExcelUtils.getCellData(l, 10);
		Prospect_Creation_Page.e_Working_Email(driver).sendKeys(emp_Work_Email);

	}

	public static void additionalDetails(WebDriver driver) throws Exception {

		int m = 1;
		Prospect_Creation_Page.click_Add_Det(driver).click();

		String bank_Acc_typ = ExcelUtils.getCellData(m, 1);
		Prospect_Creation_Page.bank_Account_Type(driver).sendKeys(bank_Acc_typ);

		String are_You_Existing_Cust = ExcelUtils.getCellData(m, 2);
		Prospect_Creation_Page.are_U_Ex_Cust(driver).click();
		Thread.sleep(1000);
		List<WebElement> exCustList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : exCustList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(are_You_Existing_Cust)) {
					webElement1.click();
					break;
				}
			}
		}

		String time_With_Curn_Empl = ExcelUtils.getCellData(m, 3);
		Prospect_Creation_Page.time_With_Cur_Emp(driver).click();
		Thread.sleep(1000);
		List<WebElement> curEmpList = driver.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : curEmpList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(time_With_Curn_Empl)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String residential_Status = ExcelUtils.getCellData(m, 4);
		Prospect_Creation_Page.resi_Status(driver).click();
		Thread.sleep(1000);
		List<WebElement> resList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : resList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(residential_Status)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String profession_valu = ExcelUtils.getCellData(m, 5);
		Select dropDownprof = new Select(Prospect_Creation_Page.profession(driver));
		List<WebElement> professionvalus = dropDownprof.getOptions();
		for (WebElement webElement : professionvalus) {
			if (!webElement.getText().equalsIgnoreCase(" ")) {
				if (webElement.getText().equalsIgnoreCase(profession_valu)) {
					webElement.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String academic_Degree = ExcelUtils.getCellData(m, 6);
		Prospect_Creation_Page.academ_Degree(driver).sendKeys(academic_Degree);

		String marital_Status = ExcelUtils.getCellData(m, 7);
		Prospect_Creation_Page.marit_Status(driver).click();
		Thread.sleep(1000);
		List<WebElement> maritalList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : maritalList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(marital_Status)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String level_Of_Education = ExcelUtils.getCellData(m, 8);
		Prospect_Creation_Page.lav_Of_Edu(driver).click();
		Thread.sleep(1000);
		List<WebElement> eduList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : eduList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(level_Of_Education)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String nationality_det = ExcelUtils.getCellData(m, 9);
		Prospect_Creation_Page.nationality_value(driver).click();
		Thread.sleep(1000);
		List<WebElement> natList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : natList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(nationality_det)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}

		String no_Of_Dependents = ExcelUtils.getCellData(m, 10);
		Prospect_Creation_Page.no_Of_Depen(driver).sendKeys(no_Of_Dependents);

		String time_Cun_Addrs = ExcelUtils.getCellData(m, 11);
		Prospect_Creation_Page.time_Cun_Add(driver).click();
		Thread.sleep(1000);
		List<WebElement> depntList = driver
				.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement webElement1 : depntList) {
			if (!webElement1.getText().equalsIgnoreCase(" ")) {
				if (webElement1.getText().equalsIgnoreCase(time_Cun_Addrs)) {
					webElement1.click();
					Thread.sleep(500);
					break;
				}
			}
		}
	}

	public static void documentsDetails(WebDriver driver) throws Exception {

		int n = 1;

		Prospect_Creation_Page.click_Doc_Det(driver).click();

		for (int i = 1; i <= 2; i++) {

			Prospect_Creation_Page.click_Add(driver).click();
			String doc_Name_Dets = ExcelUtils.getCellData(n, i);

			if (i == 1) {
				Prospect_Creation_Page.doc_Name(driver).click();
			} else {
				Prospect_Creation_Page.doc_Name2(driver).click();
			}
			
			List<WebElement> exCustList = driver.findElements(By.xpath(".//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td"));
			for (WebElement webElement1 : exCustList) {
				if (!webElement1.getText().equalsIgnoreCase(" ")) {
					if (webElement1.getText().equalsIgnoreCase(doc_Name_Dets)) {
						webElement1.click();
						break;
					}
				}
			}
			// Prospect_Creation_Page.click_save(driver).click();
			driver.findElement(By.xpath(".//*[@id='edit-documents-" + i + "']/div/div/div[3]/input[1]")).click();
			Thread.sleep(500);
		}

		Prospect_Creation_Page.click_save(driver).click();
		Thread.sleep(500);
	}
	

	
}
