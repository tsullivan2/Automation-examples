package automationFramework;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class onboardingSkip {
	
	private static AndroidDriver<MobileElement> driver;  
	
	@Test(priority = 0)
	public void signInScreenSkip() {
		//Sign in or create account screen
		MobileElement title = driver.findElementByName("Sign in or create account");
		Assert.assertTrue(title.isDisplayed());
		MobileElement description = driver.findElementByName("Stay updated with the petitions you've signed and the topics you've followed.");
		Assert.assertTrue(description.isDisplayed());
		MobileElement facebookBtn = driver.findElementById("org.change:id/facebook_login");
		Assert.assertTrue(facebookBtn.isDisplayed());
		MobileElement emailBtn = driver.findElementById("org.change:id/email_login");
		Assert.assertTrue(emailBtn.isDisplayed());
		//TODO need to click legal links - turns out it is really hard to click links within a text view
		MobileElement legal = driver.findElementById("org.change:id/legal");
		Assert.assertTrue(legal.isDisplayed());
		MobileElement skip = driver.findElementById("org.change:id/skip");
		Assert.assertTrue(skip.isDisplayed());
		driver.findElementById("org.change:id/skip").click();
	}
	
	@Test(priority = 1)
	public void whileWeBuildYourApp() {
		//While we build your app screen
			MobileElement title = driver.findElementByName("While we build your app");
			Assert.assertTrue(title.isDisplayed());
			MobileElement description = driver.findElementByName("Help us show you petitions that affect the issues you care about—choose a few of the topics and places you'd like to follow.");	
			Assert.assertTrue(description.isDisplayed());
			MobileElement inyourarea = driver.scrollTo("In your area");	
			Assert.assertTrue(inyourarea.isDisplayed());
			MobileElement education = driver.scrollTo("Education");
			Assert.assertTrue(education.isDisplayed());
			MobileElement politics = driver.scrollTo("Politics");
			Assert.assertTrue(politics.isDisplayed());
			MobileElement racialJustice = driver.scrollTo("Racial justice");
			Assert.assertTrue(racialJustice.isDisplayed());
			MobileElement animals = driver.scrollTo("Animals");
			Assert.assertTrue(animals.isDisplayed());
			MobileElement women = driver.scrollTo("Women");
			Assert.assertTrue(women.isDisplayed());
			MobileElement entertainment = driver.scrollTo("Entertainment");
			Assert.assertTrue(entertainment.isDisplayed());
			MobileElement humanRights = driver.scrollTo("Human Rights");
			Assert.assertTrue(humanRights.isDisplayed());
			MobileElement healthAndSafety = driver.scrollTo("Health and Safety");
			Assert.assertTrue(healthAndSafety.isDisplayed());
			MobileElement economicJustice = driver.scrollTo("Economic Justice");
			Assert.assertTrue(economicJustice.isDisplayed());
			MobileElement criminalJustice = driver.scrollTo("Criminal Justice");
			Assert.assertTrue(criminalJustice.isDisplayed());
			MobileElement environment = driver.scrollTo("Environment");
			Assert.assertTrue(environment.isDisplayed());
			MobileElement sports = driver.scrollTo("Sports");
			Assert.assertTrue(sports.isDisplayed());
			MobileElement followBtn = driver.findElementById("org.change:id/follow_tv");
			Assert.assertTrue(followBtn.isDisplayed());
			driver.findElementById("org.change:id/follow_tv").click();
			MobileElement followingBtn = driver.findElementById("org.change:id/following_tv");
			Assert.assertTrue(followingBtn.isDisplayed());
			//driver.findElementById("org.change:id/following_tv").click();
			MobileElement doneBtn = driver.findElementById("org.change:id/done");
			Assert.assertTrue(doneBtn.isDisplayed());
			driver.findElementById("org.change:id/done").click();
			MobileElement splashScreenTitle = driver.findElementByName("Finding related petitions");
			Assert.assertTrue(splashScreenTitle.isDisplayed());
			driver.findElementByName("Finding related petitions");
			
	}
	
	@BeforeClass
	public void beforeMethod() throws MalformedURLException, InterruptedException {
		File appDir = new File("src");
		File app = new File(appDir, "org.change-2.0.0.73.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	@AfterClass
	public void afterMethod() {

	}

}
