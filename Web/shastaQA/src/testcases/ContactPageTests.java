package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.ContactPageObj;
import objectrepository.KCCTabObj;


public class ContactPageTests {
	public WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	//Verify Full name field is required
	@Test (priority = 1)
	public void full_name_required() throws InterruptedException {
		ContactPageObj cpo = new ContactPageObj(driver);
		KCCTabObj kto = new KCCTabObj(driver);
		kto.Contact_tab().click();
		Thread.sleep(2000);
		cpo.Company().sendKeys("Shasta QA");
		cpo.Email_address().sendKeys("tsullivan@shastaqa.com");
		cpo.Phone_number().sendKeys("5555555");
		cpo.Submit_button().click();
		String expectedText = "- Please enter Full Name\n- Enter Word Verification in box below";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expectedText);
		driver.switchTo().alert().accept();
		cpo.Company().clear();
		cpo.Email_address().clear();
		cpo.Phone_number().clear();
	}
	
	//Verify Company field is required
	@Test (priority = 2)
	public void company_required() throws InterruptedException {
		ContactPageObj cpo = new ContactPageObj(driver);
		cpo.Full_name().sendKeys("Tim Sullivan");
		cpo.Email_address().sendKeys("tsullivan@shastaqa.com");
		cpo.Phone_number().sendKeys("5555555");
		cpo.Submit_button().click();
		Thread.sleep(1000);
		String expectedText = "- Please enter Company Name\n- Enter Word Verification in box below";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expectedText);
		driver.switchTo().alert().accept();
		cpo.Full_name().clear();
		cpo.Email_address().clear();
		cpo.Phone_number().clear();
	}
	
	//Verify Email Address field is required
	@Test (priority = 3)
	public void email_required() throws InterruptedException {
		ContactPageObj cpo = new ContactPageObj(driver);
		cpo.Full_name().sendKeys("Tim Sullivan");
		cpo.Company().sendKeys("Shasta QA");
		cpo.Phone_number().sendKeys("5555555");
		cpo.Submit_button().click();
		Thread.sleep(1000);
		String expectedText = "- Please enter a valid email address\n- Enter Word Verification in box below";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expectedText);
		driver.switchTo().alert().accept();
		cpo.Full_name().clear();
		cpo.Company().clear();
		cpo.Phone_number().clear();
	}
	
	//Verify Phone Number field is required
	@Test (priority = 4)
	public void phone_required() throws InterruptedException {
		ContactPageObj cpo = new ContactPageObj(driver);
		cpo.Full_name().sendKeys("Tim Sullivan");
		cpo.Company().sendKeys("Shasta QA");
		cpo.Email_address().sendKeys("tsullivan@shastaqa.com");
		cpo.Submit_button().click();
		Thread.sleep(1000);
		String expectedText = "- Please enter Phone Number\n- Enter Word Verification in box below";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expectedText);
		driver.switchTo().alert().accept();
		cpo.Full_name().clear();
		cpo.Company().clear();
		cpo.Email_address().clear();
	}
	
	//Verify Word Verification (CAPTCHA) field is required
	@Test (priority = 5)
	public void captcha_required() throws InterruptedException {
		ContactPageObj cpo = new ContactPageObj(driver);
		cpo.Full_name().sendKeys("Tim Sullivan");
		cpo.Company().sendKeys("Shasta QA");
		cpo.Email_address().sendKeys("tsullivan@shastaqa.com");
		cpo.Phone_number().sendKeys("5555555");
		cpo.Submit_button().click();
		Thread.sleep(1000);
		String expectedText = "- Enter Word Verification in box below";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expectedText);
		driver.switchTo().alert().accept();
		cpo.Full_name().clear();
		cpo.Company().clear();
		cpo.Email_address().clear();
	}
	
	@AfterClass
	public void endSession() {
		driver.quit();
	}
}
