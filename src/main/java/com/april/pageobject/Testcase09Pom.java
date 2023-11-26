package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase09Pom {
	WebDriver driver;
	
	public Testcase09Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Mobile']")
	private WebElement mobileMenu;
	public WebElement getMobileMenu() {
		return mobileMenu;
	}
	
	@FindBy(how=How.XPATH,using = "(//span[text()='Add to Cart'])[1]")
	private WebElement iphoneadd;
	public WebElement getIPhoneAddtoCart() {
		return iphoneadd;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@id='coupon_code']")
	private WebElement coupon;
	public WebElement getDiscountCode() {
		return coupon;
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='Apply']")
	private WebElement apply;
	public WebElement getApply() {
		return apply;
	}
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[2]/td[2]/span")
	private WebElement disc;
	public WebElement getAppliedDiscount() {
		return disc;
	}
}
