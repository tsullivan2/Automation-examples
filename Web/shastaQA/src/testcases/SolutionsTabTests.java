package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.SolutionsTabObj;


public class SolutionsTabTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	//Verify Solutions tab is displayed
	@Test (priority = 0)
	public void solutions_tab_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		String expectedString = "SOLUTIONS";
		String actualString = sto.Solutions_tab_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Solutions & Results link is displayed
	@Test (priority = 1)
	public void solutions_and_results_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_tab().click();
		String expectedString = "SOLUTIONS & RESULTS";
		String actualString = sto.solutions_and_results_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Solutions & Results page is displayed
	@Test (priority = 2)
	public void  solutions_and_results_click() throws InterruptedException {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_and_results().click();
		Thread.sleep(2000);
		String expectedString = "Solutions & Results";
		String actualString = sto.solutions_and_results_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify QA Team Revitalization link is displayed
	@Test (priority = 3)
	public void qa_team_rev_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_tab().click();
		String expectedString = "QA TEAM REVITALIZATION";
		String actualString = sto.QA_team_rev_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify QA Team Revitalization page is displayed
	@Test (priority = 4)
	public void  qa_team_rev_click() throws InterruptedException {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.QA_team_rev().click();
		Thread.sleep(2000);
		String expectedString = "QA Team Revitalization";
		String actualString = sto.QA_team_rev_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
		
	//Verify QA Infusion link is displayed
	@Test (priority = 5)
	public void qa_infusion_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_tab().click();
		String expectedString = "QA INFUSION";
		String actualString = sto.QA_infusion_text();
		Assert.assertEquals(actualString, expectedString);
	}
		
	//Verify QA Infusion page is displayed
	@Test (priority = 6)
	public void qa_infusion_click() throws InterruptedException {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.QA_infusion().click();
		Thread.sleep(2000);
		String expectedString = "QA Infusion";
		String actualString = sto.qa_infusion_element_text();
		Assert.assertEquals(actualString, expectedString);	
	}
		
	//Verify Independent Verification and Validation link is displayed
	@Test (priority = 7)
	public void iv_v_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_tab().click();
		String expectedString = "IV & V";
		String actualString = sto.IV_V_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Independent Verification and Validation page is displayed
	@Test (priority = 8)
	public void iv_v_click() throws InterruptedException {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.IV_V().click();
		Thread.sleep(2000);
		String expectedString = "Independent Verification and Validation";
		String actualString = sto.IV_V_element_text();
		Assert.assertEquals(actualString, expectedString);	
	}
	
	//Verify Investment Due Diligence link is displayed
	@Test (priority = 9)
	public void idd_displayed() {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.Solutions_tab().click();
		String expectedString = "INVESTMENT DUE DILIGENCE";
		String actualString = sto.IDD_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Investment Due Diligence page is displayed
	@Test (priority = 10)
	public void idd_click() throws InterruptedException {
		SolutionsTabObj sto = new SolutionsTabObj(driver);
		sto.IDD().click();
		Thread.sleep(2000);
		String expectedString = "Investment Due Diligence";
		String actualString = sto.IDD_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
