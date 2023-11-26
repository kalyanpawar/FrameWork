package com.april.Utility;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Libraryclass extends Baseclass{
	public static ExtentTest test;
	public  static void custom_sendKeys(WebElement element,String fieldname,String value) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS,fieldname+" Value successfully sent: "+value);
			System.out.println(fieldname+" Value successfully sent: "+value);

		}
		catch (Exception e) {
			System.out.println("unable to send value: "+fieldname);
			test.log(Status.FAIL,fieldname+"Unable to send value: "+value);

		}
	}
	public  static void custom_click(WebElement element,String fieldname){
		try {
			element.click();
			test.log(Status.PASS,"Clicked successfully: "+fieldname);
			System.out.println("Clicked successfully: "+fieldname);

		}
		catch (Exception e) {
			//System.out.println("unable to click"+fieldname);
			test.log(Status.FAIL,"Unable to click: "+e);
			System.out.println("Unable to click: "+e);
		}
	}
	public  static void custom_HandleDropDown(WebElement element,String value,String fieldname) {
		try {
			Select s = new Select (element);
			s.selectByVisibleText(value);
			test.log(Status.PASS,"Value Selected in DropDown: "+value);
			System.out.println("Value Selected in DropDown: "+value);
		}
		catch (Exception e) {
			test.log(Status.FAIL,"Unable to HandleDropDown: "+value);
			System.out.println("Unable to HandleDropDown: "+value);
		}
	}

	public  static void custom_AssertEquals(String actualTest,String expectedText) {
		try {
			Assert.assertEquals(actualTest, expectedText);
			test.log(Status.PASS,"Text is Verified: "+actualTest+"=="+expectedText);
			System.out.println("Text is Verified: "+actualTest+"=="+expectedText);
		}
		catch (Exception e) {
			test.log(Status.FAIL,"Text is not Verified: "+actualTest+"=="+expectedText);
			System.out.println("Text is not Verified: "+actualTest+"=="+expectedText);
		}
	}

	public  static void custom_Verifyorder(List<?> Webelements,String expectedOrder) {
		String actualOrder="";
		try {
			String arr[]=new String[Webelements.size()];
			for(int i=1;i<Webelements.size();i++) {
				arr[i]=((WebElement) Webelements.get(i)).getText();
			}
			actualOrder=Arrays.toString(arr);
			System.out.println(actualOrder);
			Assert.assertEquals(actualOrder, expectedOrder);
			test.log(Status.PASS,"Order is Verified: "+actualOrder+"="+expectedOrder);
			System.out.println("Order is Verified: "+actualOrder+"="+expectedOrder);
		}
		catch (Exception e) {
			System.out.println("Order is not Verified: "+actualOrder+"="+expectedOrder);
			test.log(Status.FAIL,"Order is not Verified: "+actualOrder+"="+expectedOrder);
		}
	}
	public  static void custom_clear(WebElement element,String fieldname) {

		try {
			element.clear();
			test.log(Status.PASS,"Cleared: "+fieldname);
			System.out.println("Cleared: "+fieldname);
		}
		catch (Exception e) {
			System.out.println("Unable to Clear: "+fieldname);
			test.log(Status.FAIL,"Unable to Clear: "+fieldname);
		}
	}
	public  static String custom_getText(WebElement element,String fieldname) {
		String str="";
		try {
			str=element.getText();
			test.log(Status.PASS,"Text is Read: "+str);
			System.out.println("Text is Read: "+str);
			return str;
		}
		catch (Exception e) {
			System.out.println("Unable to Read the Text: "+fieldname);
			test.log(Status.FAIL,"Unable to Read the Text: "+fieldname);
			return str;
		}
	}
	public  static void custom_WindowSwitchwithTitle(String exp) {
		Set<String> set=driver.getWindowHandles();
		try {
			for(String x: set) {
				driver.switchTo().window(x);
				if(driver.getTitle().equals(exp)) {
					break;
				}
			}
			test.log(Status.PASS,"Switched to Window");
			System.out.println("Switched to Window");
			
		}
		catch (Exception e) {
			System.out.println("Unable to Switch to Window");
			test.log(Status.FAIL,"Unable to Switch to Window");
			
		}
	}
	
	public  static void custom_AssertTrue(boolean condition ) {
		try {
			Assert.assertTrue(condition);
			test.log(Status.PASS,"Condition Verified");
			System.out.println("Condition Verified");
		}
		catch (Exception e) {
			test.log(Status.FAIL,"Condition not Verified");
			System.out.println("Condition not Verified");
		}
	}
	public  static String custom_getTitle() {
		String str="";
		try {
			str=driver.getTitle();
			test.log(Status.PASS,"Page Title is Read: "+str);
			System.out.println("Page Title is Read: "+str);
			return str;
		}
		catch (Exception e) {
			System.out.println("Unable to Read the Page Title: ");
			test.log(Status.FAIL,"Unable to Read the PagecTitle: ");
			return str;
		}
	}
}
