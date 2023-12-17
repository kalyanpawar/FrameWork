package com.test;

import org.testng.annotations.Test;

import com.april.Utility.AppValues;
import com.april.Utility.Baseclass;
import com.april.Utility.DataUtils;
import com.april.Utility.DateUtils;

import pagemethods.PageMethods;

public class TestCaseID3001 extends Baseclass{

	/**
	 * @Auther: Kalyan Pawar
	 * TestCaseId: TC-30001
	 */
	@Test
	public static void scenarioOne() {
		String name = DataUtils.generateRandomString(5);
		String email = DataUtils.generateEmail(12);
		String phone = DataUtils.generateRandomNumberString(10);
		String address = DataUtils.generateRandomString(15);
		String male = AppValues.MALE;
		String todaysDay = DateUtils.getTodaysFullDay();
		String france = AppValues.FRANCE;
		String todaysDate = DateUtils.getTodaysDate();
		String errorMessage = AppValues.ERROR_MESSAGE;
		
		/* @Step: 1. Login to the app. Expected: App is opened */
		/* @Step: 2. Enter random name. Expected: Name is entered */
		PageMethods.setName(name);
//		PageMethods.validateEnteredNameText(name);
		
		/* @Step: 3. Enter random phone number. Expected: Phone number is entered. */
		PageMethods.setPhone(phone);
		PageMethods.validateEnteredPhoneNumber(phone);
	
		/* @Step: 4. Enter random email. address. Expected: Email address is entered. */
		PageMethods.setEmail(email);
		PageMethods.validateEnteredEmailId(email);
	
		/* @Step: 5. Enter random address. Expected: Address is entered. */
		PageMethods.setAddress(address);
		PageMethods.validateEnteredAddress(address);
		
		/* @Step: 6. Select Gender as Male. Expected: Gender Male is selected */
		PageMethods.selectGenderOrDay(male);
		
		/* @Step: 7. Select a Todays Day. Expected: Todays Day is selected */
		PageMethods.selectGenderOrDay(todaysDay);
	
		/* @Step: 8. Select country as France. Expected: France is selected */
		PageMethods.selectCountry(france);
		
		/* @Step: 9. Add todays date. Expected: Todays date is entered */
		PageMethods.setDate(todaysDate);
		
		/* @Step: 10. Click Submit. Expected: An Error has occured Text is Showed. */
		PageMethods.clickSubmit();
		PageMethods.validateErrorMessage(errorMessage);
	}
}
