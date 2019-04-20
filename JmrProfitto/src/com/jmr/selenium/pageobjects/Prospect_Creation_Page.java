package com.jmr.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Prospect_Creation_Page {

	private static WebElement element = null;

	// All locators of General Details tab 

	public static WebElement cust_Menu(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='l2l_leftmenu']/li[10]/a"));
		return element;
	}
	public static WebElement retil_Menu(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='8']/li/a"));
		return element;
	}
	public static WebElement prost_Menu(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='107']/li[1]/a"));
		return element;
	}
	public static WebElement add_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='body-form']/div[1]/div[2]/div[2]/ul/li/a"));
		return element;
	}
	public static WebElement program_Type(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='tabs0.blocks0.Fields7.value']"));
		return  element;
	}
	public static WebElement first_Name(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields0.value']"));
		return element;
	}
	public static WebElement last_Name (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields1.value']"));
		return element;
	}
	public static WebElement full_Name (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields2.value']"));
		return element;
	}
	public static WebElement date_Of_Birth (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields3.value']"));
		return element;
	}
	public static WebElement nat_Id (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields5.value']"));
		return element;
	}
	public static WebElement exp_Nid (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields6.value']"));
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		//Vertical scroll - down by 100 pixels
		jsx.executeScript("window.scrollBy(0,100)", "");
		return element;
	}
	public static WebElement f_name (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs0.blocks1.Fields7.value']"));
		return element;
	}

	// All locators of Communication Details tab

	public static WebElement click_ComDet (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[3]/div/div/div/ul/li[2]/a"));
		return element;
	}
	public static WebElement m_No (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields0.value']"));
		return element;
	}
	public static WebElement e_Mail (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields1.value']"));
		return element;
	}
	public static WebElement hp_No (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields2.value']"));
		return element;
	}
	public static WebElement a_Ddress (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields3.value']"));
		return element;
	}
	public static WebElement em_Cont_Person (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields4.value']"));
		return element;
	}
	public static WebElement em_Cont_No (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields5.value']"));
		return element;
	}
	public static WebElement em_Cont_Add (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs1.blocks0.Fields6.value']"));
		return element;
	}
	public static WebElement c_Governorate  (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[8]/div/a"));
		return element;
	}
	public static WebElement c_Area(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[9]/div/a"));
		return element;
	}
	public static WebElement c_Telephone_Extension(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tabs1.blocks0.Fields9.value']"));
		return element;
	}	

	// All locators of Employment Details tab
	public static WebElement click_Emp_Det(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[3]/div/div/div/ul/li[3]/a"));
		return element;
	}
	public static WebElement employment_Status(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields0.value']"));
		return element;
	}
	public static WebElement current_Employer(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields1.value']"));
		return element;
	}
	public static WebElement industry(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields2.value']"));
		return element;
	}
	public static WebElement hiring_Date(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields3.value']"));
		return element;
	}
	public static WebElement e_title (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields4.value']"));
		return element;
	}
	public static WebElement e_Monthly_Income (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields5.value']"));
		return element;
	}
	public static WebElement e_Monthly_Expense (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields6.value']"));
		return element;
	}
	public static WebElement e_Working_Phone_Number  (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields7.value']"));
		return element;
	}
	public static WebElement e_Working_Address (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields8.value']"));
		return element;
	}
	public static WebElement e_Working_Email  (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs2.blocks0.Fields9.value']"));
		return element;
	}

	// All locators of Additional Details tab 

	public static WebElement click_Add_Det (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[3]/div/div/div/ul/li[4]/a/span/span[2]"));
		return element;
	}
	public static WebElement bank_Account_Type (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs3.blocks0.Fields0.value']"));
		return element;
	}
	public static WebElement are_U_Ex_Cust (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[2]/div/a[2]"));
		return element;
	}
	public static WebElement time_With_Cur_Emp (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[3]/div/a[2]"));
		return element;
	}
	public static WebElement resi_Status  (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[4]/div/a"));
		return element;
	}
	public static WebElement profession (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs3.blocks0.Fields4.value']"));
		return element;
	}
	public static WebElement academ_Degree (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs3.blocks0.Fields5.value']"));
		return element;
	}
	public static WebElement marit_Status (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[7]/div/a"));
		return element;
	}
	public static WebElement lav_Of_Edu (WebDriver driver) {
		element = driver.findElement(By.xpath("(//A[@class='btn btn-info btn-sm modal-l2l col-md-2'])[9]"));
		return element;
	}
	public static WebElement nationality_value (WebDriver driver) {
		element = driver.findElement(By.xpath("(//A[@class='btn btn-info btn-sm modal-l2l col-md-2'])[10]"));
		return element;
	}
	public static WebElement no_Of_Depen (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='tabs3.blocks0.Fields9.value']"));
		return element;
	}
	public static WebElement time_Cun_Add (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[11]/div/a"));
		return element;
	}

	// All locators of Documents Details tab 

	public static WebElement click_Doc_Det (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[3]/div/div/div/ul/li[5]/a"));
		return element;
	}
	public static WebElement click_Add (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='edit-entity']/div/fieldset/div/div[1]/ul/li[1]/a"));
		return element;
	}
	public static WebElement doc_Name (WebDriver driver) {
		element = driver.findElement(By.xpath("(//A[@class='btn btn-info btn-sm modal-l2l col-md-2'])[13]"));
		return element;
	}
	public static WebElement doc_Name2 (WebDriver driver) {
		element = driver.findElement(By.xpath("(//A[@class='btn btn-info btn-sm modal-l2l col-md-2'])[14]"));
		return element;
	}
	public static WebElement click_save (WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[2]/ul/li[1]/input"));
		return element;	
	}

}