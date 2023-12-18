package com.test;

import org.testng.annotations.Test;

import com.april.Utility.Baseclass;

import pagemethods.PageMethods;

public class TestCaseID3012 extends Baseclass {
	
	/**
	 * @Auther: Kalyan Pawar
	 * TestCaseId: TC-3012
	 */
	@Test
	public static void paginationTable() {
		String[] booksPage1 = {"Learn Selenium", "Learn Java", "Learn JS", "Master In Selenium", "Master In Java", "Master In JS"};
		
		/* @Step: 1. Login to the app. Expected: App is opened */
		/* @Step: 2. Read the price of all the books and add them. Expected: Verify its 7100. */
		int pricesOfBooksPage1 = PageMethods.getAndAddPricesOfBooks(booksPage1);
		PageMethods.validateBooksPriceTotal(pricesOfBooksPage1);
	}
}
