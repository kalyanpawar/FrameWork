package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase08Pom {
WebDriver driver;
	
	public Testcase08Pom(WebDriver driver){
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
	
	@FindBy(how=How.XPATH,using = "//a[text()='Reorder']")
	private WebElement reorder;
	public WebElement getReOrder() {
		return reorder;
	}
	@FindBy(how=How.XPATH,using = "//input[@title='Qty']")
	private WebElement quantity;
	public WebElement getQuantity() {
		return quantity;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Update']")
	private WebElement update;
	public WebElement getUpdateButton() {
		return update;
	}
	@FindBy(how=How.XPATH,using = "//*[@id=\"cart-sidebar\"]/li/div/table/tbody/tr[1]/td/span")
	private WebElement value;
	public WebElement getTotalValue() {
		return value;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Proceed to Checkout'])[2]")
	private WebElement proceed;
	public WebElement getProceed() {
		return proceed;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[1]")
	private WebElement continuee;
	public WebElement getContinue() {
		return continuee;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[3]")
	private WebElement continue1;
	public WebElement getContinuee() {
		return continue1;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='p_method_checkmo']")
	private WebElement check;
	public WebElement getCheckorMoney() {
		return check;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[4]")
	private WebElement continue2;
	public WebElement getContinue1() {
		return continue2;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Place Order']")
	private WebElement placeorder;
	public WebElement getPlaceOrder() {
		return placeorder;
	}
}