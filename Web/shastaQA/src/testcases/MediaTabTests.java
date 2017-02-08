package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.MediaTabObj;


public class MediaTabTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	//Verify Media tab is displayed
		@Test (priority = 0)
		public void media_tab_displayed() {
			MediaTabObj mto = new MediaTabObj(driver);
			String expectedString = "MEDIA";
			String actualString = mto.Media_tab_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify SQA in the Media link is displayed
		@Test (priority = 1)
		public void SQA_displayed() {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.Media_tab().click();
			String expectedString = "SQA IN THE MEDIA";
			String actualString = mto.SQA_text();
			Assert.assertEquals(actualString, expectedString);
		}
	
	//Verify SQA in the Media page is displayed
		@Test (priority = 2)
		public void SQA_click() throws InterruptedException {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.SQA().click();
			Thread.sleep(2000);
			String expectedString = "Shasta QA in the Media";
			String actualString = mto.SQA_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Social Media Center link is displayed
		@Test (priority = 3)
		public void SMC_displayed() {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.Media_tab().click();
			String expectedString = "SOCIAL MEDIA CENTER";
			String actualString = mto.SMC_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Social Media Center page is displayed
		@Test (priority = 4)
		public void SMC_click() throws InterruptedException {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.SMC().click();
			Thread.sleep(2000);
			String expectedString = "Social Media Center";
			String actualString = mto.SMC_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
	
	//Verify Press Room link is displayed
		@Test (priority = 5)
		public void Press_room_displayed() {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.Media_tab().click();
			String expectedString = "PRESS ROOM";
			String actualString = mto.Press_room_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Press Room page is displayed
		@Test (priority = 6)
		public void Press_room_click() throws InterruptedException {
			MediaTabObj mto = new MediaTabObj(driver);
			mto.Press_room().click();
			Thread.sleep(2000);
			String expectedString = "Press Room";
			String actualString = mto.Press_room_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
		@AfterClass
		public void endSession() {
			driver.quit();
		}
		
}
