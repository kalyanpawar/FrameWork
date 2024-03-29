package pagemethods;

import java.util.List;

import org.testng.Assert;

import com.april.Utility.Library2;


public class PageMethods extends Library2{
	
	final static String title = "Automation Testing Practice - Atom";
	final static String nameXpath = "//input[@id='name']";
	final static String emailXpath = "//input[@id='email']";
	final static String phoneXpath = "//input[@id='phone']";
	final static String addressXpath = "//textarea[@id='textarea']";
	final static String commonXpath = "//input[@id='%s']";
	final static String countryDropDown = "//select[@id='country']";
	final static String dateXpath = "//input[@id='datepicker']";
	final static String submitButton = "//input[@id='FSsubmit']";
	final static String iframeId = "frame-one796456169";
	final static String errorMessageXpath = "//h1[contains(text(),'occurred')]";
	final static String colorDropDownXpath = "//select[@id='colors']";
	final static String bookPriceXpath = "//td[text()='%s']/following-sibling::td[3]";
	
	/**
	 * This Function is used to validate Title of window
	 */
	public static void isWindowTitleIsRight() {
		Assert.assertEquals(getTitle(), title);
	}

	/**
	 * This Function is used set name
	 */
	public static void setName(String name) {
		enterText(nameXpath, name);
	}
	
	/**
	 * This Function is used validate entered text in name field
	 */
	public static void validateEnteredNameText(String name) {
		Assert.assertEquals(getEnteredTextFromTextBox(nameXpath), name);
	}
	
	/**
	 * This Function is used set email
	 */
	public static void setEmail(String email) {
		enterText(emailXpath, email);
	}
	
	/**
	 * This Function is used validate entered email id in email field
	 */
	public static void validateEnteredEmailId(String email) {
		Assert.assertEquals(getEnteredTextFromTextBox(emailXpath), email);
	}
	
	/**
	 * This Function is used set phone
	 */
	public static void setPhone(String phone) {
		enterText(phoneXpath, phone);
	}
	
	/**
	 * This Function is used validate entered number in phone field
	 */
	public static void validateEnteredPhoneNumber(String phone) {
		Assert.assertEquals(getEnteredTextFromTextBox(phoneXpath), phone);
	}
	
	/**
	 * This Function is used set address
	 */
	public static void setAddress(String address) {
		enterText(addressXpath, address);
	}
	
	/**
	 * This Function is used validate entered address
	 */
	public static void validateEnteredAddress(String address) {
		Assert.assertEquals(getEnteredTextFromTextBox(addressXpath), address);
	}
	
	/**
	 * This Function is used select gender or day
	 */
	public static void selectGenderOrDay(String genderOrday) {
		click(String.format(commonXpath, genderOrday));
	}
	
	/**
	 * This Function is used select specified country from dropdown
	 */
	public static void selectCountry(String country) {
		selectValue(countryDropDown, country);
	}
	
	/**
	 * This Function is used set date
	 */
	public static void setDate(String date) {
		enterText(dateXpath, date);
	}
	
	/**
	 * This Function is used click submit button
	 */
	public static void clickSubmit() {
		switchToFrame(iframeId);
		click(submitButton);
	}
	
	
	/**
	 * This Function is used validate error message
	 */
	public static void validateErrorMessage(String errorMessage) {
		Assert.assertEquals(getText(errorMessageXpath), errorMessage);
	}
	
	/**
	 * This function is used to get all optionsFrom colors dropdown.
	 * @return
	 */
	public static List<String> getColorsAllOptions() {
		List<String> colorsAllOptions = getAllOptionsFromDropDown(colorDropDownXpath);
		return colorsAllOptions;
	}
	
	public static void selectOptionsFromColorsDropDownAndValidate(List<String> options) {
		for(String option: options) {
			System.out.println(option);
			selectValue(colorDropDownXpath, option);
			justWait(3);
			Assert.assertEquals(getSelectedOptionFromDropDown(colorDropDownXpath), option);
			justWait(3);
			deSelectByValue(colorDropDownXpath, option);
		}
	}
	
	public static int getPriceOfBook(String bookName) {
		return  Integer.parseInt(getText(String.format(bookPriceXpath, bookName)));
	}
	
	public static int getAndAddPricesOfBooks(String... booksName) {
		int pricesAdded = 0;
		for(String bookName: booksName) {
			pricesAdded = pricesAdded + getPriceOfBook(bookName);
		}
		return pricesAdded;
	}
	
	public static void validateBooksPriceTotal(int total) {
		Assert.assertEquals(total, 7100);
	}
}
