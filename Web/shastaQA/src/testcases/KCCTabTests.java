package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.KCCTabObj;


public class KCCTabTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	//Verify Knowledge Center tab is displayed
		@Test (priority = 0)
		public void KC_tab_displayed() {
			KCCTabObj kto = new KCCTabObj(driver);
			String expectedString = "KNOWLEDGE CENTER";
			String actualString = kto.KC_tab_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Knowledge Center link is displayed
		@Test (priority = 1)
		public void Knowledge_center_displayed() {
			KCCTabObj kto = new KCCTabObj(driver);
			kto.KC_tab().click();
			String expectedString = "KNOWLEDGE CENTER";
			String actualString = kto.Knowledge_center_text();
			Assert.assertEquals(actualString, expectedString);
		}
			
	//Verify Knowledge Center page is displayed
		@Test (priority = 2)
		public void Knowledge_center_click() throws InterruptedException {
			KCCTabObj kto = new KCCTabObj(driver);
			kto.Knowledge_center().click();
			Thread.sleep(2000);
			String expectedString = "Knowledge Center";
			String actualString = kto.Knowledge_center_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Software QA FAQ's link is displayed
		@Test (priority = 3)
		public void SQA_faqs_displayed() {
			KCCTabObj kto = new KCCTabObj(driver);
			kto.KC_tab().click();
			String expectedString = "SOFTWARE QA FAQS";
			String actualString = kto.SQA_faqs_text();
			Assert.assertEquals(actualString, expectedString);
		}
	
	//Verify Software QA FAQ's page is displayed
		@Test (priority = 4)
		public void SQA_faqs_click() throws InterruptedException {
			KCCTabObj kto = new KCCTabObj(driver);
			kto.SQA_faqs().click();
			Thread.sleep(2000);
			String expectedString = "Software QA FAQs";
			String actualString = kto.SQA_faqs_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
	
	//Verify Contact tab is displayed
		@Test (priority = 5)
		public void Contact_displayed() {
			KCCTabObj kto = new KCCTabObj(driver);
			String expectedString = "CONTACT";
			String actualString = kto.Contact_tab_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Contact page is displayed
		@Test (priority = 6)
		public void Contact_click() throws InterruptedException {
			KCCTabObj kto = new KCCTabObj(driver);
			kto.Contact_tab().click();
			Thread.sleep(2000);
			String expectedString = "Contact";
			String actualString = kto.Contact_tab_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
	
		@AfterClass
		public void endSession() {
			driver.quit();
		}
		
}
