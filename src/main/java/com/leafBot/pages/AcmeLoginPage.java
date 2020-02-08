package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AcmeLoginPage extends ProjectSpecificMethods{
	
	public AcmeLoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(how=How.XPATH
			,using="//input[@id='email']")
	private WebElement eleUserName;	
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement elePassword;	
	
	@FindBy(how=How.XPATH, using = "//button[@id='buttonLogin']")
	private WebElement eleLogin;
	
	
	
	@Given("Enter the username as (.*)")
	public AcmeLoginPage enterUserName(String data) {	
		clearAndType(eleUserName, data);
		return this;
	}	

	@Given("Enter the Password as (.*)")
	public AcmeLoginPage enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}	
	
	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage(driver, node, test);		
	}
	
	
	
		
}
