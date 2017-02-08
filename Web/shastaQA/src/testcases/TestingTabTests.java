package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.TestingTabObj;

public class TestingTabTests {
	public WebDriver driver;

	
	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
			}
	
	//Verify Testing Tab is displayed
	@Test (priority = 0)
	public void testing_tab_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		String expectedString = "TESTING";
		String actualString = tto.Testing_tab_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Software Testing Services link is displayed
	@Test (priority = 1)
	public void software_testing_services_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		//Open testing Tab
		tto.Testing_tab().click();
		String expectedString = "SOFTWARE TESTING SERVICES";
		String actualString = tto.Software_testing_services_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify the Software Testing Services page is displayed
	@Test (priority = 2)
	public void software_testing_services_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Software_testing_services().click();
		Thread.sleep(2000);
		//Verify element on page is present
		String expectedString = "Your OurSourcing® Partner";
		String actualString = tto.Software_testing_services_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify Web Application Testing link is displayed
	@Test (priority = 3)
	public void web_application_testing_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Testing_tab().click();
		String expectedString = "WEB APPLICATION TESTING";
		String actualString = tto.Web_application_testing_text();
		Assert.assertEquals(actualString, expectedString);
	}

	//Verify Web Application Testing page is displayed
	@Test (priority = 4)
	public void web_application_testing_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Web_application_testing().click();
		Thread.sleep(2000);
		String expectedString = "Compatibility";
		String actualString = tto.Web_application_testing_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Mobile Testing link is displayed
	@Test (priority = 5)
	public void mobile_testing_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Testing_tab().click();
		String expectedString = "MOBILE TESTING";
		String actualString = tto.Mobile_testing_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Mobile Testing page is displayed
	@Test (priority = 6)
	public void mobile_testing_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Mobile_testing().click();
		Thread.sleep(2000);
		String expectedString = "Mobile QA Testing";
		String actualString = tto.Mobile_testing_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Automation Testing link is displayed
	@Test (priority = 7)
	public void automation_testing_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Testing_tab().click();
		String expectedString = "AUTOMATION TESTING";
		String actualString = tto.Automation_testing_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Automation Testing page is displayed
	@Test (priority = 8)
	public void automation_testing_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Automation_testing().click();
		Thread.sleep(2000);
		String expectedString = "Should you consider automated testing?";
		String actualString = tto.Automation_testing_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Test Management link is displayed
	@Test (priority = 9)
	public void test_management_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Testing_tab().click();
		String expectedString = "TEST MANAGEMENT";
		String actualString = tto.Test_management_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Test Management page is displayed
	@Test (priority = 10)
	public void test_management_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Test_management().click();
		Thread.sleep(2000);
		String expectedString = "Test Management";
		String actualString = tto.Test_management_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Independent Verification & Validation link is displayed
	@Test (priority = 11)
	public void IV_V_displayed() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Testing_tab().click();
		String expectedString = "IV & V";
		String actualString = tto.IV_V_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify Independent Verification & Validation page is displayed
	@Test (priority = 12)
	public void IV_V_click() throws InterruptedException {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.IV_V().click();
		Thread.sleep(2000);
		String expectedString = "Independent Verification and Validation (IV&V)";
		String actualString = tto.IV_V_element_text();
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
