package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectrepository.AboutTabObj;



public class LaunchWebsiteTest {
	public WebDriver driver;
	
	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver",  "/Users/tim/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("http://www.shastaqa.com");
	}
	
	@Test
	public void launch_site() {
		AboutTabObj nbo=new AboutTabObj(driver);
		Assert.assertTrue(nbo.Logo().isDisplayed());
		System.out.println("\n launch_site() -> Test executed" );
	}
	
	@AfterClass
	public void endSession(){
		driver.quit();
	}
}
