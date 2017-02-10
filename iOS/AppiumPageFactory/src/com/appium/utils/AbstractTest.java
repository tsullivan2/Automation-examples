package com.appium.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.appium.pages.LandingPage;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class AbstractTest {
	
	
	@SuppressWarnings("rawtypes")
	public static IOSDriver driver;
	
	@SuppressWarnings("rawtypes")
	@BeforeClass
	public static void createEnvironment() {
		//DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		File dir = new File("/Users/tim/Desktop/UI-Catalog-App.zip");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.APP, dir.getAbsolutePath());
		try {
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
	}
	
	@AfterClass
	public static void tearEnvironment() {
		driver.quit();
	}
	
}
