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
	public void software_testing_services_click() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Software_testing_services().click();
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
	public void web_application_testing_click() {
		TestingTabObj tto = new TestingTabObj(driver);
		tto.Web_application_testing().click();
		String expectedString = "Compatibility";
		String actualString = tto.Web_application_testing_element_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	
	
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
