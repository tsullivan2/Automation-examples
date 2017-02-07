package testngFiles;
import java.util.List;
import java.io.File;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Signed_out {
	
	AndroidDriver driver;
	
		@Test
		public void SignedOut() throws Exception {
		//APK location
		File appDir = new File("src");
		File app = new File(appDir, "change.org-1.6.0.35.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

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
		//Home screen
		///Search bar tests
		///Tap search button
				driver.findElementById("org.change:id/search").click();
				driver.findElementById("org.change:id/search");
		///Verify search icon is still present
				driver.findElementById("org.change:id/search_mag_icon");
		///Verify placeholder text
				driver.findElementById("org.change:id/search_src_text");
		///Tap the back button to close search field
				driver.findElementByName("Collapse").click();
				driver.findElementByName("Home");
		///Tap the settings button
				driver.findElementById("org.change:id/action_settings").click();
				driver.findElementByName("Settings");
				driver.findElementByName("Navigate up").click();
		///Push notification card - turn on
				driver.findElementByName("Turn on push notifications");
				driver.findElementByName("Get notifications when there's something new about a petition you've signed.");
				driver.findElementByName("Dismiss");
				driver.findElementByName("Turn on").click();
		///Check notifications are enabled
				driver.findElementById("org.change:id/action_settings").click();
				driver.findElementByName("Settings");
				driver.findElementByName("Notification preferences").click();
				List<WebElement> toggle = driver.findElements(By.className("android.widget.Switch"));
				String a = toggle.get(0).getAttribute("checked");
				System.out.println(a);
				String b = toggle.get(1).getAttribute("checked");
				System.out.println(b);
				String c = toggle.get(2).getAttribute("checked");
				System.out.println(c);
				String d = toggle.get(3).getAttribute("checked");
				System.out.println(d);
				String e = toggle.get(4).getAttribute("checked");
				System.out.println(e);
				String f = toggle.get(5).getAttribute("checked");
				System.out.println(f);
				driver.findElementByName("Navigate up").click();
		///Connect your account card
				driver.findElementByName("Connect your account");
				driver.findElementByName("Sign in to connect or create your Change.org account, so you can support petitions with a tap, follow topics and places, and keep your settings connected between your phone and other devices.");
				driver.findElementByName("Dismiss");
				driver.findElementByName("Sign in").click();
				driver.findElementById("org.change:id/login_fragment");
				driver.findElementByName("Navigate up").click();
		///View search tab
				List<WebElement> navbar = driver.findElements(By.id("org.change:id/bottom_navigation_small_container"));
				WebElement searchTab = navbar.get(1);
				searchTab.click();
		///Popular topics card
				driver.findElementByName("Popular topics");
				driver.findElementById("org.change:id/text").click();
		
		/*
		driver.findElementByName("Settings");
		
		
		
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		driver.findElementById("").click();
		*/
	}

	
	
		
		
		
		
	
		
		
		
		

		
	
}
	
