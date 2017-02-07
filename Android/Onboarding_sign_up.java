import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Onboarding_sign_up {
	
		AndroidDriver driver;
		
		
		@Test
		public void onboardingSignUp() throws MalformedURLException {
			//APK location
		File appDir = new File("src");
		File app = new File(appDir, "change.org-1.6.0.35.apk");
			//Desired Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);


		//Sign in or create account screen
		driver.findElementByName("Sign in or create account");
		driver.findElementByName("Stay updated with the petitions you've signed and the topics you've followed.");
		driver.findElementById("org.change:id/facebook_login");
		driver.findElementById("org.change:id/email_login").click();
		//Sign in screen
		driver.findElementById("org.change:id/login_fragment");
		driver.findElementByName("Sign in");
		driver.findElementByName("Enter your email address and we'll send you a link - no password necessary.");
		driver.findElementByName("abc@xyz.com");
		driver.findElementById("org.change:id/email");
		driver.findElementByName("Or");
		driver.findElementById("org.change:id/facebook_login");
		driver.findElementById("org.change:id/email_login").click();
		driver.findElementByName("Email cannot be left blank");
		driver.findElementById("org.change:id/email").sendKeys("abc");
		driver.findElementById("org.change:id/email_login").click();
		driver.findElementByName("Please enter a valid email address");
		driver.findElementById("org.change:id/email").clear();
		driver.findElementById("org.change:id/email").sendKeys("changeauto-1@yopmail.com");
		driver.findElementById("org.change:id/email_login").click();
		driver.findElementByName("User account not found");
		driver.findElementByName("Sorry we were unable to find any user registered with changeauto-1@yopmail.com");
		driver.findElementByName("Try again").click();
		driver.findElementById("org.change:id/login_fragment");
		driver.findElementById("org.change:id/email_login").click();
		driver.findElementByName("User account not found");
		driver.findElementByName("Sorry we were unable to find any user registered with changeauto-1@yopmail.com");
		driver.findElementByName("Sign up").click();
		driver.findElementById("org.change:id/edit_profile_fragment");
		//Sign up screen
		driver.findElementByName("Sign up");
		driver.findElementByName("Done");
		driver.findElementById("org.change:id/user_photo");
		driver.findElementById("org.change:id/first_name");
		driver.findElementById("org.change:id/last_name");
		driver.findElementById("org.change:id/email");
		driver.findElementById("org.change:id/street_address");
		driver.findElementById("org.change:id/zipcode");
		driver.findElementById("org.change:id/city");
		driver.scrollTo("State");
		driver.scrollTo("Phone");
		driver.scrollTo("About me");
		driver.scrollTo("Website");
		driver.findElementByName("Navigate up").click();
	
	}

	
	
		
		
		
		
	
		
		
		
		

		
	
}
	
