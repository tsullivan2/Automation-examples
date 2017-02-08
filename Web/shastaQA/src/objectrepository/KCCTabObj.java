package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KCCTabObj {
	//Initialize driver
		WebDriver driver;
		public  KCCTabObj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	//Knowledge Center Tab
		@FindBy (xpath="//*[@id='window']/ul/li[6]/a")
		WebElement kc_tab;
		public WebElement KC_tab() {
			return kc_tab;
		}
		public String KC_tab_text() {
			return kc_tab.getText();
		}
	
	
	//Knowledge Center Tab > Knowledge Center
		@FindBy (xpath="//*[@id='window']/ul/li[6]/ul/li[1]/a")
		WebElement knowledge_center;
		public WebElement Knowledge_center() {
			return knowledge_center;
		}
		public String Knowledge_center_text() {
			return knowledge_center.getText();
		}
	//Knowledge Center Tab > Knowledge Center > Page element
		@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
		WebElement knowledge_center_element;
		public String Knowledge_center_element_text() {
			return knowledge_center_element.getText();
		}
		
	
	//Knowledge Center Tab > Software QA FAQ's
		@FindBy (xpath="//*[@id='window']/ul/li[6]/ul/li[2]/a")
		WebElement sqa_faqs;
		public WebElement SQA_faqs() {
			return sqa_faqs;
		}
		public String SQA_faqs_text() {
			return sqa_faqs.getText();
		}
	//Knowledge Center Tab > Software QA FAQ's > Page element
		@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
		WebElement sqa_faqs_element;
		public String SQA_faqs_element_text() {
			return sqa_faqs_element.getText();
		}
		
		
	//Contact Tab
		@FindBy (xpath="//*[@id='window']/ul/li[7]/a")
		WebElement contact_tab;
		public WebElement Contact_tab() {
			return contact_tab;
		}
		public String Contact_tab_text() {
			return contact_tab.getText();
		}
	//Contact Tab > Page element
		@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
		WebElement contact_tab_element;
		public String Contact_tab_element_text() {
			return contact_tab_element.getText();
		}
			
}
