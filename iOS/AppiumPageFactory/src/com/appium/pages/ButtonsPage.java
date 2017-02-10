package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.utils.AbstractPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ButtonsPage extends AbstractPage {
	
	//Objects
	@FindBy (xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
	private static WebElement grayBtn;
	
	@FindBy (xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
	private static WebElement backBtn;
	
	
	//Methods
		public static void clickGrayBtn() {
			grayBtn.click();	
			}
		
		public static void clickBackBtn() {
			backBtn.click();
			//Return LandingPage
			PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
		}
	
}
