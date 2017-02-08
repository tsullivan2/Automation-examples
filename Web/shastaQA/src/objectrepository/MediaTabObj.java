package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaTabObj {
	//Initialize driver
		WebDriver driver;
		public  MediaTabObj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	//Media Tab
		@FindBy (xpath = "//*[@id='window']/ul/li[5]/a")
		WebElement media_tab;
		public WebElement Media_tab() {
			return media_tab;
		}
		public String Media_tab_text() {
			return media_tab.getText();
		}
		
		
	//Media Tab > SQA in the Media
		@FindBy (xpath = "//*[@id='window']/ul/li[5]/ul/li[1]/a")
		WebElement sqa;
		public WebElement SQA() {
			return sqa;
		}
		public String SQA_text() {
			return sqa.getText();
		}
	//Media Tab > SQA in the Media > Page element
		@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
		WebElement sqa_element;
		public String SQA_element_text() {
			return sqa_element.getText();
		}
		
		
	//Media Tab > Social Media Center
		@FindBy (xpath = "//*[@id='window']/ul/li[5]/ul/li[2]/a")
		WebElement smc;
		public WebElement SMC() {
			return smc;
		}
		public String SMC_text() {
			return smc.getText();
		}
	//Media Tab > Social Media Center > Page element
		@FindBy(xpath="//*[@id='titleBar']/div/div/h1")
		WebElement smc_element;
		public String SMC_element_text() {
			return smc_element.getText();
		}
		
		
	//Media Tab > Press Room
		@FindBy (xpath = "//*[@id='window']/ul/li[5]/ul/li[3]/a")
		WebElement press_room;
		public WebElement Press_room() {
			return press_room;
		}
		public String Press_room_text() {
			return press_room.getText();
		}
	//Media Tab > Press Room > Page element
		@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
		WebElement press_room_element;
		public String Press_room_element_text() {
			return press_room_element.getText();
		}	
		
	}


