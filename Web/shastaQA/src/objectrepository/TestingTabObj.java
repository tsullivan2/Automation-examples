package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingTabObj {
	//Initialize driver
	WebDriver driver;
	public  TestingTabObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Testing tab
	@FindBy(xpath=".//*[@id='window']/ul/li[2]/a")
	WebElement testing_tab;
	public WebElement Testing_tab() {
		return testing_tab;
	}
	public String Testing_tab_text() {
		return testing_tab.getText();
	}
	
	//Testing Tab > Software Testing Services
	@FindBy(xpath=".//*[@id='window']/ul/li[2]/ul/li[1]/a")
	WebElement software_testing_services;
	public WebElement Software_testing_services() {
		return software_testing_services;
	}
	public String Software_testing_services_text() {
		return software_testing_services.getText();
	}
	
	//Testing Tab > Software Testing Services > Page Element
	@FindBy(xpath="html/body/div[1]/div[3]/div[1]/h2")
	WebElement software_testing_services_element;
	public String Software_testing_services_element_text() {
		return software_testing_services_element.getText();
	}
	
	
	//Testing Tab > Web Application Testing
	@FindBy(xpath=".//*[@id='window']/ul/li[2]/ul/li[2]/a")
	WebElement web_application_testing;
	public WebElement Web_application_testing() {
		return web_application_testing;
	}
	public String Web_application_testing_text() {
		return web_application_testing.getText();
	}
	
	//Testing Tab > Web Application Testing > Page Element
	@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div/div[1]/div[1]/div/h4")
	WebElement web_application_testing_element;
	public String Web_application_testing_element_text() {
		return web_application_testing_element.getText();
	}
	
	
	//Testing Tab > Mobile Testing
	@FindBy (xpath=".//*[@id='window']/ul/li[2]/ul/li[3]/a")
	WebElement mobile_testing;
	public WebElement Mobile_testing() {
		return mobile_testing;
	}
	public String Mobile_testing_text() {
		return mobile_testing.getText();
	}
	
	//Testing Tab > Automation Testing
	@FindBy (xpath=".//*[@id='window']/ul/li[2]/ul/li[4]/a")
	WebElement automation_testing;
	public WebElement Automation_testing() {
		return automation_testing;
	}
	public String Automation_testing_text() {
		return automation_testing.getText();
	}
	
	
	//Testing Tab > Test Management
	@FindBy (xpath=".//*[@id='window']/ul/li[2]/ul/li[5]/a")
	WebElement test_management;
	public WebElement Test_management() {
		return test_management;
	}
	public String Test_management_text() {
		return test_management.getText();
	}
	
	
	//Testing Tab > Independent Verification and Validation
	@FindBy (xpath=".//*[@id='window']/ul/li[2]/ul/li[6]/a")
	WebElement iv_v;
	public WebElement IV_V() {
		return iv_v;
	}
	public String IV_V_text() {
		return iv_v.getText();
	}
	
}

