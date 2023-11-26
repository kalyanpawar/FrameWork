package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase07Pom {
WebDriver driver;
	
	public Testcase07Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "(//a[text()='My Account'])[2]")
	private WebElement myAccount;
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@id='email']")
	private WebElement email;
	public WebElement getEmailId() {
		return email;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@id='pass']")
	private WebElement pass;
	public WebElement getPassWord() {
		return pass;
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='Login']")
	private WebElement login;
	public WebElement getLoginButton() {
		return login;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='My Orders']")
	private WebElement myorder;
	public WebElement getMyOrders() {
		return myorder;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='View Order']")
	private WebElement vieworder;
	public WebElement getViewOrder() {
		return vieworder;
	}
	
	@FindBy(how=How.XPATH,using = "//div[@class='page-title title-buttons']//h1")
	private WebElement ordertext;
	public WebElement getOrderText() {
		return ordertext;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Print Order']")
	private WebElement printOrder;
	public WebElement getPrintOrder() {
		return printOrder;
	}
	
	
	
}