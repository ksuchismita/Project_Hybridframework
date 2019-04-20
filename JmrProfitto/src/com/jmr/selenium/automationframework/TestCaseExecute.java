package com.jmr.selenium.automationframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCaseExecute {

	private static WebDriver driver = null;

	@Test(priority=1)
	public void profittoLogin() throws Exception {
		Apache_POI_TC.login();
	}
	@Test(enabled=false)
	public void custCreation() throws Exception {
		Apache_POI_TC.custCrea();
	}
	@Test(enabled=false)
	public void custPayment() throws Exception {
		Apache_POI_TC.custPayment();
	}
}
