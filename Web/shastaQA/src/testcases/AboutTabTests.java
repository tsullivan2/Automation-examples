package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.AboutTabObj;


public class AboutTabTests {
	public WebDriver driver;
		
	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	@Test (priority = 0)
	public void about_tab_displayed() {
		AboutTabObj ato=new AboutTabObj(driver);
		//Verify "About" tab is displayed
		String expectedString = "ABOUT";
		String actualString = ato.About_tab_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@Test (priority = 1)
	public void about_shasta_displayed() {
		AboutTabObj ato=new AboutTabObj(driver);
		//Click on "About" tab
		ato.About_tab().click();
		//Verify "About Shasta QA" link is displayed
		String expectedString = "ABOUT SHASTA QA";
		String actualString = ato.About_shasta_qa_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@Test(priority = 2)
	public void about_shasta_click() throws InterruptedException {
		AboutTabObj ato=new AboutTabObj(driver);
		//Click on "About Shasta QA" link
		ato.About_shasta_qa().click();
		Thread.sleep(2000);
		//Verify "About Shasta QA" title is displayed
		String expectedTitle = "About Shasta QA";
		String actualTitle = ato.About_shasta_qa_title();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 3)
	public void management_displayed(){
		AboutTabObj ato=new AboutTabObj(driver);
		//Re-open "About" tab
		ato.About_tab().click();
		//Verify "Management team" link is displayed
		String expectedString = "MANAGEMENT TEAM";
		String actualString = ato.Management_team_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@Test(priority = 4)
	public void management_click() throws InterruptedException{
		AboutTabObj ato=new AboutTabObj(driver);
		//Click on "Management team" link
		ato.Management_team().click();
		Thread.sleep(2000);
		//Verify "Management team" title is displayed
		String expectedString = "MEET DON";
		String actualString = ato.Management_team_title();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@Test(priority = 5)
	public void employment_displayed() {
		AboutTabObj ato=new AboutTabObj(driver);
		//Re-open "About" tab
		ato.About_tab().click();
		//Verify "Employment" link is displayed 
		String expectedString = "EMPLOYMENT";
		String actualString = ato.Employment_text();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@Test(priority = 6)
	public void employment_click() throws InterruptedException {
		AboutTabObj ato=new AboutTabObj(driver);
		//Click on "Employment" link
		ato.Employment().click();
		Thread.sleep(2000);
		//Verify "Employment" title is displayed
		String expectedString = "WORKING WITH US YOU CAN:";
		String actualString = ato.Employment_title();
		Assert.assertEquals(actualString, expectedString);
	}
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
