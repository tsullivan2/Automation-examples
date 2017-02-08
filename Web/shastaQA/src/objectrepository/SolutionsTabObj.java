package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsTabObj {

	//Initialize driver
	WebDriver driver;
	public  SolutionsTabObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Solutions tab
	@FindBy (xpath="//*[@id='window']/ul/li[3]/a")
	WebElement solutions_tab;
	public WebElement Solutions_tab() {
		return solutions_tab;
	}
	public String Solutions_tab_text() {
		return solutions_tab.getText();
	}
	
	//Solutions tab > Solutions & Results
	@FindBy (xpath="//*[@id='window']/ul/li[3]/ul/li[1]/a")
	WebElement solutions_and_results;
	public WebElement Solutions_and_results() {
		return solutions_and_results;
	}
	public String solutions_and_results_text() {
		return solutions_and_results.getText();
	}
	
	//Solutions tab > Solutions & Results > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement solutions_and_results_element;
	public String solutions_and_results_element_text() {
		return solutions_and_results_element.getText();
	}
	
	// Solutions tab > QA Team Revitalization
	@FindBy (xpath="//*[@id='window']/ul/li[3]/ul/li[2]/a")
	WebElement qa_team_rev;
	public WebElement QA_team_rev() {
		return qa_team_rev;
	}
	public String QA_team_rev_text()  {
		return qa_team_rev.getText();
	}
	
	//Solutions tab > QA Team Revitalization > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement  qa_team_rev_element;
	public String QA_team_rev_element_text() {
		return qa_team_rev_element.getText();
	}
	
	//Solutions tab > QA Infusion
	@FindBy (xpath=".//*[@id='window']/ul/li[3]/ul/li[3]/a")
	WebElement qa_infusion;
	public WebElement QA_infusion() {
		return qa_infusion;
	}
	public String QA_infusion_text() {
		return qa_infusion.getText();
	}
	
	//Solutions tab > QA Infusion > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement qa_infusion_element;
	public String qa_infusion_element_text() {
		return qa_infusion_element.getText();
	}
	
	
	//Solutions tab > Independent Verification and Validation
	@FindBy (xpath="//*[@id='window']/ul/li[3]/ul/li[4]/a")
	WebElement iv_v;
	public WebElement IV_V() {
		return iv_v;
	}
	public String IV_V_text() {
		return iv_v.getText();
	}
	
	//Solutions tab > Independent Verification and Validation > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement iv_v_element;
	public String IV_V_element_text() {
		return iv_v_element.getText();
	}
	
	//Solutions tab > Investment Due Diligence
	@FindBy (xpath="//*[@id='window']/ul/li[3]/ul/li[5]/a")
	WebElement idd;
	public WebElement IDD() {
		return idd;
	}
	public String IDD_text() {
		return idd.getText();
	}
	
	//Solutions tab > Investment Due Diligence > Page element
	
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement idd_element;
	public String IDD_element_text() {
		return idd_element.getText();
	}
}
