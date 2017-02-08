package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageObj {
	//Initialize driver
		WebDriver driver;
		public  ContactPageObj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	//Full name field	
		@FindBy (xpath="//*[@id='FullName']")	
		WebElement full_name;
		public WebElement Full_name() {
			return full_name;
		}
		
	//Company field	
		@FindBy (xpath="//*[@id='Company']")	
		WebElement company;
		public WebElement Company() {
			return company;
		}
		
	//Email Address field
		@FindBy (xpath="//*[@id='EmailAddress']")
		WebElement email_address;
		public WebElement Email_address() {
			return email_address;
		}
		
	//Phone Number Field	
		@FindBy (xpath="//*[@id='WorkPhone']")
		WebElement phone_number;
		public WebElement Phone_number() {
			return phone_number;
		}
		
	//Submit button
		@FindBy (xpath="//*[@id='catwebformbutton']")
		WebElement submit_button;
		public WebElement Submit_button() {
			return submit_button;
		}
		
		
		
}	
