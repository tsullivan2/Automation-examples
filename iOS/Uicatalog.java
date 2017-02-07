import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Uicatalog {

IOSDriver<MobileElement> driver;	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
	
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		File dir = new File("/Users/tim/Desktop/UI-Catalog-App.zip");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.APP, dir.getAbsolutePath());
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
	}

	@Test
	public void test() {
		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]").click();
		driver.findElementByName("Back").click();
	}
	
}
