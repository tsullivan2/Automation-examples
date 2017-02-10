package com.appium.tests;

import org.testng.annotations.Test;

import com.appium.pages.ButtonsPage;
import com.appium.pages.LandingPage;
import com.appium.utils.AbstractTest;

public class FirstButtonTest extends AbstractTest{

	
	@Test
	public void clickFirstButton() throws InterruptedException {
		LandingPage.clickButtonsBtn();
		Thread.sleep(1000);
		//ButtonsPage.clickGrayBtn();
		ButtonsPage.clickBackBtn();
	}
	
	//@Test
	//public void clickBackButton() {
	//	ButtonsPage.clickBackBtn();
	//}
}
