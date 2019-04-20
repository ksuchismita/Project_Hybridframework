package com.jmr.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerSpecificRepayment {

	private static WebElement element = null;
	// All locators of Customer Specific Re-payment page
	
	public static WebElement click_lend_Tab(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='l2l_leftmenu']/li[3]/a"));
		return element;
	}
	public static WebElement click_lend_Paym(WebDriver driver)  {
		element = driver.findElement(By.xpath("//*[@id='12']/li[3]/a"));
		return element;
	}
	public static WebElement cust_Specf_Repy(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='203']/li[2]/a"));
		return element;
	}
	public static WebElement Click_Add_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='body-form']/div[1]/div[2]/div[2]/ul/li/a"));
		return element;
	}
	public static WebElement Click_Cust_Code_Lp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='edit-entity']/div/fieldset[1]/div/div[1]/div/a/i"));
		return element;
	}
	public static WebElement Click_Cust_Code(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='filter_dropdown']/label[1]"));
		return element;
	}
	public static WebElement Entry_Cust_Code(WebDriver driver) {
		element = driver.findElement(By.xpath("//INPUT[@name='entity.custCode']"));
		return element;
	}
	public static WebElement Click_On_Filtr_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='filter_dropdown']/div/div/div[2]/input[1]"));
		return element;
	}
	public static WebElement Click_On_Cust_Data(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='l2l-lookup-modal']/div/div/div[2]/div/table/tbody/tr/td[1]"));
		return element;
	}
	public static WebElement click_Fatch_Btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='edit-entity']/div/fieldset[1]/div/div[4]/div/a"));
		return element;
	}
	public static WebElement get_Pay_Amt(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tabs0.blocks2.Fields4.value']"));
		return element;
	}
	public static WebElement setl_Amt(WebDriver driver) {
		element = driver.findElement(By.xpath("//INPUT[@id='tabs0.blocks2.Fields5.value']"));
		return element;
	}
	public static WebElement mode_Of_Paym(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='edit-entity']/div/fieldset[3]/div/div[8]/div/a/i"));
		return element;
	}
	public static WebElement click_On_Alc_Pay(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='process-flow']/div[2]/ul/li[2]/input"));
		return element;
	}
	public static WebElement click_On_Cinfirm(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='process-flow']/div[2]/ul/li[2]/input"));
		return element;
	}
	public static WebElement click_On_Profitto(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='fullpage']/div[1]/div[2]/div[2]/div[1]/a[1]/img"));
		return element;
	}
}
