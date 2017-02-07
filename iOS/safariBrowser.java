package Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class safariBrowser {
	IOSDriver<MobileElement> driver;
	
	@Test
	public void setup() throws MalformedURLException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.1");
				
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
	}

}
