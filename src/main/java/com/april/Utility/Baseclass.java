package com.april.Utility;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static ConfigDetaProvider config ;
	public static  ExcelDetaProvider excel;
	public static WebDriver driver;
	public static Properties pro1;
	@BeforeSuite
	public void BS () throws IOException {
		config = new ConfigDetaProvider ();
		// excel = new ExcelDetaProvider ();
	}
	
	
	@Parameters("browserName") //<!-- <parameter name="browserName" value="chrome"></parameter> -->
	@BeforeMethod
	public void Setup(@Optional String browserName) {
		System.out.println("Browser Name is: "+browserName);
		
		if(browserName==null||browserName.isEmpty()){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
//		driver =new ChromeDriver();
//		driver.get(config.getStageUrl());
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closebrower() {
		driver.quit();
	}
}
