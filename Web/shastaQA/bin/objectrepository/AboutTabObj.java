package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AboutTabObj {
	//Initialize driver
	WebDriver driver;
	public  AboutTabObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Shasta Logo
	@FindBy(xpath=".//*[@id='logo']/img")
	WebElement logo;
	public WebElement Logo() {
		return logo;
	}
	
	//About tab
	@FindBy(xpath=".//*[@id='window']/ul/li[1]/a")
	WebElement abouttab;
	public String About_tab_text(){
		return abouttab.getText();
	}
	public WebElement About_tab(){
		return abouttab;
	}
	
	//About tab > About Shasta QA
	@FindBy(xpath=".//*[@id='window']/ul/li[1]/ul/li[1]/a")
	WebElement aboutshastaqa;
	public String About_shasta_qa_text(){
		return aboutshastaqa.getText();
	}
	public WebElement About_shasta_qa(){
		return aboutshastaqa;
	}
	
	//About tab > About Shasta QA > Title
	@FindBy(xpath=".//*[@id='titleBar']/div/div/h1")
	WebElement aboutShastaQaTitle;
	public String About_shasta_qa_title() {
		return aboutShastaQaTitle.getText();
	}

	//About tab > Management Team
	@FindBy(xpath=".//*[@id='window']/ul/li[1]/ul/li[2]/a")
	WebElement managementteam;
	public String Management_team_text(){
		return managementteam.getText();
	}
	public WebElement Management_team(){
		return managementteam;
	}
	
	//About tab > Management Team > Meet Don
	@FindBy(xpath="html/body/div[1]/div[3]/div[1]/div[1]/div/div[2]/div/h4")
	WebElement managementteamtitle;
	public String Management_team_title(){
		return managementteamtitle.getText();
	}
	
	//About tab > Employment
	@FindBy(xpath=".//*[@id='window']/ul/li[1]/ul/li[3]/a")
	WebElement employment;
	public String Employment_text(){
		return employment.getText();
	}
	public WebElement Employment(){
		return employment;
	}
	
	//About tab > Employment > Title
	@FindBy(xpath="html/body/div[1]/div[3]/div[1]/h3[4]")
	WebElement employmenttitle;
	public String Employment_title() {
		return employmenttitle.getText();
	}
}
