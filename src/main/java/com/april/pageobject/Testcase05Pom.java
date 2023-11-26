package com.april.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase05Pom {
WebDriver driver;
	
	public Testcase05Pom(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using = "(//a[text()='My Account'])[2]")
	private WebElement myAccount;
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	@FindBy(how=How.XPATH,using = "//span[text()='Create an Account']")
	private WebElement createAccount;
	public WebElement getCreateAccountButton() {
		return createAccount;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='First Name']")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='Last Name']")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='Email Address']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='Password']")
	private WebElement password;
	public WebElement getPassWord() {
		return password;
	}
	
	@FindBy(how=How.XPATH,using = "//input[@title='Confirm Password']")
	private WebElement confirmPassword;
	public WebElement getComfirmPassword() {
		return confirmPassword;
	}
	
	@FindBy(how=How.XPATH,using = "//button[@title='Register']")
	private WebElement register;
	public WebElement getRegisterButton() {
		return register;
	}
	
	@FindBy(how=How.XPATH,using = "//span[contains(text(),'Thank you')]")
	private WebElement comfMessage;
	public WebElement getComfirmMessage() {
		return comfMessage;
	}
	
	@FindBy(how=How.XPATH,using = "//a[text()='TV']")
	private WebElement tv;
	public WebElement getTV() {
		return tv;
	}
	@FindBy(how=How.XPATH,using = "(//a[text()='Add to Wishlist'])[1]")
	private WebElement addToWL;
	public WebElement getAddtoWishList() {
		return addToWL;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Share Wishlist']")
	private WebElement shareWL;
	public WebElement getShareWishList() {
		return shareWL;
	}
	@FindBy(how=How.XPATH,using = "//textarea[@id='email_address']")
	private WebElement emailforShare;
	public WebElement getEmailforShare() {
		return emailforShare;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Share Wishlist']")
	private WebElement shareWLbutton;
	public WebElement getShareWishListButton() {
		return shareWLbutton;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Your Wishlist has been shared.']")
	private WebElement shareWLComfMessage;
	public WebElement getShareWishListComfirmed() {
		return shareWLComfMessage;
	}
}
