package com.april.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase02Pom {
	WebDriver driver;
	
	public Testcase02Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Mobile']")
	private WebElement mobileMenu;
	public WebElement getMobileMenu() {
		return mobileMenu;
	}
	
	@FindBy(how=How.XPATH,using = "//span[@id='product-price-1']/span")
	private WebElement sonyExperiaPrice;
	public WebElement getSonyExperiaPrice() {
		return sonyExperiaPrice;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Sony Xperia']")
	private WebElement sonyExperia;
	public WebElement getSonyExperia() {
		return sonyExperia;
	}
	
	@FindBy(how=How.XPATH,using = "//span[@class='price']")
	private WebElement sonyExperiaPrice2;
	public WebElement getSonyExperiaPrice2() {
		return sonyExperiaPrice2;
	}
}
