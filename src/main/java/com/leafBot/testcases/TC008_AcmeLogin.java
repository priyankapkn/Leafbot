package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.AcmeLoginPage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC008_AcmeLogin extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Acme Login";
		testDescription = "Login testCase using email and Login";
		nodes = "Leads";
		authors = "Gopinath";
		category = "Smoke";
		dataSheetName = "TC008";
	}

//	@Test(dataProvider = "fetchData")
//	public void createLeaf(String uName, String pwd) {
//		new LoginPage(driver, node, test)
//		.enterUserName(uName)
//		.enterPassword(pwd)
//		.clickLogin();		
//	}

	@Test(dataProvider = "fetchData")
	public void loginAcme(String uName, String pwd) {
	new AcmeLoginPage(driver, node, test).enterUserName(uName).enterPassword(pwd).clickLogin().readTitle();
	

}}





