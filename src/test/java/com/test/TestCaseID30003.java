package com.test;

import java.util.List;

import org.testng.annotations.Test;

import com.april.Utility.Baseclass;

import pagemethods.PageMethods;

public class TestCaseID30003 extends Baseclass{

	/**
	 * @Auther: Kalyan Pawar2
	 * TestCaseId: TC-30003
	 */
	@Test
	public static void VerifyColorsDropdown() {

	/*@Step 1: Login to app. Expected: App is opened. */
	/*@Step 2: Select all the colors One After another. Expected: Colors are selected, Verify previously selected colors are deselected. */
	List<String> colorsAllOptions = PageMethods.getColorsAllOptions();
	PageMethods.selectOptionsFromColorsDropDownAndValidate(colorsAllOptions);
	
	}
}
