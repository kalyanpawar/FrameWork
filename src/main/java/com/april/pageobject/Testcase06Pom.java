package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase06Pom {
WebDriver driver;
	
	public Testcase06Pom(WebDriver driver){
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
	
	@FindBy(how=How.XPATH,using = "//a[text()='My Wishlist']")
	private WebElement wishList;
	public WebElement getWishList() {
		return wishList;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Add to Cart']")
	private WebElement addtoCart;
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Proceed to Checkout'])[1]")
	private WebElement toChechout;
	public WebElement getProceedtoCheckout() {
		return toChechout;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='billing:street1']")
	private WebElement address;
	public WebElement getAddressField() {
		return address;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='billing:city']")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	@FindBy(how=How.XPATH,using = "//select[@id='billing:country_id']")
	private WebElement country;
	public WebElement getCountry() {
		return country;
	}
	@FindBy(how=How.XPATH,using = "//select[@id='billing:region_id']")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='billing:postcode']")
	private WebElement zip;
	public WebElement getZip() {
		return zip;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='billing:telephone']")
	private WebElement telephone;
	public WebElement getTelephone() {
		return telephone;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[1]")
	private WebElement continuee;
	public WebElement getContinueButton() {
		return continuee;
	}
	@FindBy(how=How.XPATH,using = "//label[contains(text(),'Fixed')]//span")
	private WebElement shipPrice;
	public WebElement getShippingPrice() {
		return shipPrice;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[3]")
	private WebElement continueto;
	public WebElement getContinueButton2() {
		return continueto;
	}
	@FindBy(how=How.XPATH,using = "//input[@id='p_method_checkmo']")
	private WebElement checkorMoney;
	public WebElement getCheckorMoneyOrderradioButton() {
		return checkorMoney;
	}
	@FindBy(how=How.XPATH,using = "(//span[text()='Continue'])[4]")
	private WebElement continuetoo;
	public WebElement getContinueButton3() {
		return continuetoo;
	}
	@FindBy(how=How.XPATH,using = "//button[@title='Place Order']")
	private WebElement placeOrder;
	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	@FindBy(how=How.XPATH,using = "//tr[@class='first']//span")
	private WebElement actValue;
	public WebElement getActvalue() {
		return actValue;
	}
	@FindBy(how=How.XPATH,using = "//div[@class='page-title']//h1")
	private WebElement actual;
	public WebElement getActualMessage() {
		return actual;
	}
}
