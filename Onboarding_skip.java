import java.io.File;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Onboarding_skip {
	
	public AndroidDriver driver;
	
		@Test
		public void onboardingSkip() throws Exception {
		//APK location
		File appDir = new File("src");
		File app = new File(appDir, "change.org-1.6.0.35.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//cap.setCapability("autoLaunch",false);
		//Android Driver
		@SuppressWarnings("rawtypes")
		AndroidDriver<WebElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	

		//Sign in or create account screen
		driver.findElementByName("Sign in or create account");
		driver.findElementByName("Stay updated with the petitions you've signed and the topics you've followed.");
		driver.findElementById("org.change:id/facebook_login");
		driver.findElementById("org.change:id/email_login");
		driver.findElementById("org.change:id/legal");
		//TODO need to click legal links - turns out it is really hard to click links within a text view
		driver.findElementById("org.change:id/skip").click();
		//While we build your app screen
		driver.findElementByName("While we build your app");
		driver.findElementByName("Help us show you petitions that affect the issues you care about—choose a few of the topics and places you'd like to follow.");	
		driver.scrollTo("In your area");	
		driver.scrollTo("Education");
		driver.scrollTo("Politics");
		driver.scrollTo("Racial justice");
		driver.scrollTo("Animals");
		driver.scrollTo("Women");
		driver.scrollTo("Entertainment");
		driver.scrollTo("Human Rights");
		driver.scrollTo("Health and Safety");
		driver.scrollTo("Economic Justice");
		driver.scrollTo("Criminal Justice");
		driver.scrollTo("Environment");
		driver.scrollTo("Sports");
		driver.findElementById("org.change:id/follow_tv").click();
		driver.findElementById("org.change:id/following_tv").click();
		driver.findElementById("org.change:id/done").click();
		driver.findElementByName("Finding related petitions");
		driver.findElementById("org.change:id/fragment_parent");
		
	}

	
	
		
		
		
		
	
		
		
		
		

		
	
}
	
