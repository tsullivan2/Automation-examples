package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.AboutTabObj;
import objectrepository.MgmtPageObj;

public class MgmtPageTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
		AboutTabObj ato = new AboutTabObj(driver);
		ato.About_tab().click();
		ato.Management_team().click();
		Thread.sleep(2000);
	}
	
	
	//Verify "Don O'Connell" is displayed
	@Test
	public void donNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Don O‘Connell";
		String actualString = mpo.donName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "Founder/Owner" is displayed (Don's Title)
	@Test 
	public void donTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Founder/Owner";
		String actualString = mpo.donTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify "Christina Young" is displayed
	@Test 
	public void christinaNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Christina Young";
		String actualString = mpo.christinaName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "Vice President" is displayed (Christina's Title)
	@Test
	public void christinaTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Vice President";
		String actualString = mpo.christinaTitle();
		Assert.assertEquals(actualString, expectedString);
	}
		
	
	//Verify "Anna Henderson" is displayed
	@Test
	public void annaNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Anna Henderson";
		String actualString = mpo.annaName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "Director of QA" is displayed (Anna's Title)
	@Test
	public void annaTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Director of QA";
		String actualString = mpo.annaTitle();
		Assert.assertEquals(actualString, expectedString);
	}
		
	
	//Verify "Chris Milnes" is dispalyed
	@Test 
	public void chrisNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Chris Milnes";
		String actualString = mpo.chrisName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "Director of QA" is displayed (Chris's Title)
	@Test
	public void chrisTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Director of QA";
		String actualString = mpo.chrisTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	//Verify "Eric Stevenson" is displayed
	@Test
	public void ericNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Eric Stevenson";
		String actualString = mpo.ericName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "QA Manager" is displayed (Eric's Title)
	@Test
	public void ericTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "QA Manager";
		String actualString = mpo.ericTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify "Jim Edelen" is displayed
	@Test
	public void jimNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Jim Edelen";
		String actualString = mpo.jimName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "QA Manager" is displayed (Jim's Title)
	@Test
	public void jimTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "QA Manager";
		String actualString = mpo.jimTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify "Mike Benton" is displayed 
	@Test
	public void mikeBNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Mike Benton";
		String actualString = mpo.mikeBName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "QA Manager" is displayed (Mike B's Title)
	@Test
	public void mikeBTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "QA Manager";
		String actualString = mpo.mikeBTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify "Mike Longmire" is displayed
	@Test
	public void mikeLNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Mike Longmire";
		String actualString = mpo.mikeLName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "QA Manager" is displayed (Mike L's Title)
	@Test
	public void mikeLTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "QA Manager";
		String actualString = mpo.mikeLTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	//Verify "Yuka Ando" is displayed
	@Test 
	public void yukaNameDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "Yuka Ando";
		String actualString = mpo.yukaName();
		Assert.assertEquals(actualString, expectedString);
	}
	//Verify "QA Manager" is displayed (Yuka's Title)
	@Test
	public void yukaTitleDisplayed() {
		MgmtPageObj mpo = new MgmtPageObj(driver);
		String expectedString = "QA Manager";
		String actualString = mpo.yukaTitle();
		Assert.assertEquals(actualString, expectedString);
	}
	
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
	
}
