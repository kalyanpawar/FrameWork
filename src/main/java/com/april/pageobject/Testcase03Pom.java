package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase03Pom {
WebDriver driver;
	
	public Testcase03Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Mobile']")
	private WebElement mobileMenu;
	public WebElement getMobileMenu() {
		return mobileMenu;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Sony Xperia']/..//following-sibling::div[@class='actions']//button")
	private WebElement sonyExperiaAddtoCart;
	public WebElement getSonyExperiaAddtoCart() {
		return sonyExperiaAddtoCart;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='Qty']")
	private WebElement qty;
	public WebElement getQtyInputBox() {
		return qty;
	}
	
	@FindBy(how=How.XPATH,using = "//button[@title='Update']")
	private WebElement updateButton;
	public WebElement getUpdateButton() {
		return updateButton;
	}
	
	@FindBy(how=How.XPATH,using = "//p[@class='item-msg error']")
	private WebElement errorMessage;
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='Empty Cart']")
	private WebElement emptyCart;
	public WebElement getEmptyCartButton() {
		return emptyCart;
	}
	
	@FindBy(how=How.XPATH,using = "//div[@class='page-title']//h1")
	private WebElement emptyCartMessage;
	public WebElement getEmptyCartMessage() {
		return emptyCartMessage;
	}
}
