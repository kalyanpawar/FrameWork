package com.april.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase04Pom {
WebDriver driver;
	
	public Testcase04Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='Mobile']")
	private WebElement mobileMenu;
	public WebElement getMobileMenu() {
		return mobileMenu;
	}
	
	@FindBy(how=How.XPATH,using = "(//a[text()='Add to Compare'])[1]")
	private WebElement addtoCompare1;
	public WebElement getAddtoCompare1() {
		return addtoCompare1;
	}
	
	@FindBy(how=How.XPATH,using = "(//a[text()='Add to Compare'])[2]")
	private WebElement addtoCompare2;
	public WebElement getAddtoCompare2() {
		return addtoCompare2;
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='Compare']")
	private WebElement compare;
	public WebElement getCompareButton() {
		return compare;
	}
	
	@FindBy(how=How.XPATH,using = "//h2[@class='product-name']/a")
	private List<WebElement> mobiles;
	public List<WebElement> getMobilesinCompare() {
		return mobiles;
	}
}
