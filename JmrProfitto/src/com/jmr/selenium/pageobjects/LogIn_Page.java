package com.jmr.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	private static WebElement element = null;
	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.id("j_username"));
		return element;
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.id("j_password"));
		return element;
	}
	public static WebElement btn_LogIn(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='fullpage']/div[2]/div/div/div[2]/form/div[3]/div/button[1]"));
		return element;
	}

}