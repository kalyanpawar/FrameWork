package com.april.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;

public class Library2 extends Baseclass{
	public static ExtentTest test;
	
	/**
	 * This function is used to click on given xpath webelement
	 * @param xpath
	 */
	public static void click(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		test.log(Status.PASS,"Successfully clicked on Element xpath: " + xpath);
		System.out.println("Successfully clicked on Element xpath: " + xpath);
	}
	
	/**
	 * This function is used to enter text in given xpath webelement textbox
	 * @param xpath
	 * @param textToBeEntered
	 */
	public static void enterText(String xpath, String textToBeEntered) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(textToBeEntered);
		test.log(Status.PASS,"Successfully Entered text in Element xpath: " + xpath);
		System.out.println("Successfully Entered text in Element xpath: " + xpath);
	}
	
	/**
	 * This function is used to select pericular element From given Dropdown Webelement xpath
	 * @param xpath
	 * @param valueToBeSelected
	 */
	public  static void selectValue(String xpath, String valueToBeSelected) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select (element);
		select.selectByVisibleText(valueToBeSelected);
		System.out.println( String.format("Value %s is Selected in DropDown of xpath Webelement: %s", valueToBeSelected, xpath));
	}
		
	/**
	 * This function is used to get Text from given Webelement xpath
	 * @param xpath
	 */
	public static String getText(String xpath) {
		String text = "";
		WebElement element = driver.findElement(By.xpath(xpath));
		text = element.getText();
		test.log(Status.PASS, String.format("Text %s is read from xpath Webelement: %s", text, xpath));
		System.out.println( String.format("Text %s is read from xpath Webelement: %s", text, xpath));
		return text;
	}
	
	/**
	 * This function is used to get title of current focused window.
	 */
	public static String getTitle() {
		String title = "";
		title = driver.getTitle();
		test.log(Status.PASS, String.format("Current Window title is: %s", title));
		System.out.println( String.format("Current Window title is: %s", title));
		return title;
	}
	
	/**
	 * This function is used to get title of current focused window.
	 */
	public static void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
		test.log(Status.PASS, String.format("Switched to iFrame having name or id is: %s", nameOrId));
		System.out.println( String.format("Switched to iFrame having name or id is: %s", nameOrId));
	}
	
	/**
	 * This function is used to get title of current focused window.
	 */
	public static void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
		test.log(Status.PASS, "Switched to default frame");
		System.out.println( "Switched to default frame");
	}
	
	/**
	 * This function is used to get Text from given Webelement xpath
	 * @param xpath
	 */
	public static String getEnteredTextFromTextBox(String xpath) {
		String clipboardText = "";
			WebElement element = driver.findElement(By.xpath(xpath));
			element.sendKeys(Keys.CONTROL + "a");
			element.sendKeys(Keys.CONTROL + "c");
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

	        // Get the clipboard content
	        Transferable clipboardContent = clipboard.getContents(null);

	        // Check if the content is text
	        if (clipboardContent.isDataFlavorSupported(DataFlavor.stringFlavor)) {
	            try {
	                // Get the text content
	                clipboardText = (String) clipboardContent.getTransferData(DataFlavor.stringFlavor);
	                System.out.println("Clipboard Text: " + clipboardText);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("Clipboard does not contain text");
	        }
		return clipboardText;
	}
	
	/**
	 * This Function is used to get all of the options from dropdown.
	 * @param elementXpath
	 * @return
	 */
	public static List<String> getAllOptionsFromDropDown(String elementXpath){
		WebElement webElement = driver.findElement(By.xpath(elementXpath));
		Select select = new Select(webElement);
		List<WebElement> elementOptions = select.getOptions();
		List<String> options = new ArrayList();
		for(WebElement option: elementOptions) {
			options.add(option.getText());
		}
		return options;
	}
	
	/**
	 * This function is used to validate selected option from dropdown.
	 * @param elementXpath
	 * @return
	 */
	public static String getSelectedOptionFromDropDown(String elementXpath) {
		WebElement webElement = driver.findElement(By.xpath(elementXpath));
		Select select = new Select(webElement);
		WebElement element = select.getFirstSelectedOption();
		return element.getText();
	}
	
	public static void justWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}
		catch(Exception e) {
			
		}
	}
	
	public static void deSelectByValue(String elementXpath, String text) {
		WebElement webElement = driver.findElement(By.xpath(elementXpath));
		Select select = new Select(webElement);
		select.deselectByVisibleText(text);
	}
}
