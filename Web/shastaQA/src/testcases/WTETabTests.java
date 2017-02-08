package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import objectrepository.WTETabObj;

public class WTETabTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	//Verify What To Expect tab is displayed
		@Test (priority = 0)
		public void wte_tab_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			String expectedString = "WHAT TO EXPECT";
			String actualString = wto.WTE_tab_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify What To Expect link is displayed
		@Test (priority = 1)
		public void what_to_expect_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			wto.WTE_tab().click();
			String expectedString = "WHAT TO EXPECT";
			String actualString = wto.What_to_expect_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify What To Expect page is displayed
		@Test (priority = 2)
		public void what_to_expect_click() throws InterruptedException {
			WTETabObj wto = new WTETabObj(driver);
			wto.What_to_expect().click();
			Thread.sleep(2000);
			String expectedString = "What to Expect";
			String actualString = wto.What_to_expect_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Needs Analysis link is displayed 
		@Test (priority = 3)
		public void needs_analysis_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			wto.WTE_tab().click();
			String expectedString = "NEEDS ANALYSIS";
			String actualString = wto.Needs_analysis_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Needs Analysis page is displayed
		@Test (priority = 4)
		public void needs_analysis_click() throws InterruptedException {
			WTETabObj wto = new WTETabObj(driver);
			wto.Needs_analysis().click();
			Thread.sleep(2000);
			String expectedString = "Needs Analysis";
			String actualString = wto.Needs_analysis_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
			
	//Verify Project Planning link is displayed
		@Test (priority = 5)
		public void project_planning_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			wto.WTE_tab().click();
			String expectedString = "PROJECT PLANNING";
			String actualString = wto.Project_planning_text();
			Assert.assertEquals(actualString, expectedString);	
		}
			
	//Verify Project Planning page is displayed
		@Test (priority = 6)
		public void project_planning_click() throws InterruptedException {
			WTETabObj wto = new WTETabObj(driver);
			wto.Project_planning().click();
			Thread.sleep(2000);
			String expectedString = "Project Planning";
			String actualString = wto.Project_planning_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Project Execution link is displayed
		@Test (priority = 7)
		public void project_execution_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			wto.WTE_tab().click();
			String expectedString = "PROJECT EXECUTION";
			String actualString = wto.Project_execution_text();
			Assert.assertEquals(actualString, expectedString);	
		}
		
	//Verify Project Execution page is displayed
		@Test (priority = 8)
		public void project_execution_click() throws InterruptedException {
			WTETabObj wto = new WTETabObj(driver);
			wto.Project_execution().click();
			Thread.sleep(2000);
			String expectedString = "Project Execution";
			String actualString = wto.Project_execution_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
	//Verify Project Mastery link is displayed
		@Test (priority = 9)
		public void project_mastery_displayed() {
			WTETabObj wto = new WTETabObj(driver);
			wto.WTE_tab().click();
			String expectedString = "PROJECT MASTERY";
			String actualString = wto.Project_mastery_text();
			Assert.assertEquals(actualString, expectedString);	
		}
		
	//Verify Project Mastery page is displayed
		@Test (priority = 10)
		public void project_mastery_click() throws InterruptedException {
			WTETabObj wto = new WTETabObj(driver);
			wto.Project_mastery().click();
			Thread.sleep(2000);
			String expectedString = "Project Mastery";
			String actualString = wto.Project_mastery_element_text();
			Assert.assertEquals(actualString, expectedString);
		}
		
		@AfterClass
		public void endSession() {
			driver.quit();
		}
}
