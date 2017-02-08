package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WTETabObj {
	//Initialize driver
	WebDriver driver;
	public  WTETabObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	//What To Expect Tab
	@FindBy (xpath="//*[@id='window']/ul/li[4]/a")
	WebElement wte_tab;
	public WebElement WTE_tab() {
		return wte_tab;
	}
	public String WTE_tab_text() {
		return wte_tab.getText();
	}
	
	
	//What To Expect Tab > What To Expect
	@FindBy (xpath="//*[@id='window']/ul/li[4]/ul/li[1]/a")
	WebElement what_to_expect;
	public WebElement What_to_expect() {
		return what_to_expect;
	}
	public String What_to_expect_text() {
		return what_to_expect.getText();
	}
	//What To Expect Tab > What To Expect > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement what_to_expect_element;
	public String What_to_expect_element_text() {
		return what_to_expect_element.getText();
	}
	
	
	//What To Expect Tab > Needs Analysis
	@FindBy (xpath="//*[@id='window']/ul/li[4]/ul/li[2]/a")
	WebElement needs_analysis;
	public WebElement Needs_analysis() {
		return needs_analysis;	
	}
	public String Needs_analysis_text() {
		return needs_analysis.getText();
	}
	//What To Expect Tab > Needs Analysis > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement needs_analysis_element;
	public String Needs_analysis_element_text() {
		return needs_analysis_element.getText();
	}
		
		
	//What To Expect Tab > Project Planning
	@FindBy (xpath="//*[@id='window']/ul/li[4]/ul/li[3]/a")
	WebElement project_planning;
	public WebElement Project_planning() {
		return project_planning;
	}
	public String Project_planning_text() {
		return project_planning.getText();
	}
	//What To Expect Tab > Project Planning > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement project_planning_element;
	public String Project_planning_element_text() {
		return project_planning_element.getText();
	}
	
	
	//What To Expect Tab > Project Execution
	@FindBy (xpath="//*[@id='window']/ul/li[4]/ul/li[4]/a")
	WebElement project_execution;
	public WebElement Project_execution() {
		return project_execution;
	}
	public String Project_execution_text() {
		return project_execution.getText();
	}
	//What To Expect Tab > Project Execution > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement project_execution_element;
	public String Project_execution_element_text() {
		return project_execution_element.getText();
	}
	
	
	//What To Expect Tab > Project Mastery
	@FindBy (xpath="//*[@id='window']/ul/li[4]/ul/li[5]/a")
	WebElement project_mastery;
	public WebElement Project_mastery() {
		return project_mastery;
	}
	public String Project_mastery_text() {
		return project_mastery.getText();
	}
	//What To Expect Tab > Project Mastery > Page element
	@FindBy (xpath="//*[@id='titleBar']/div/div/h1")
	WebElement project_mastery_element;
	public String Project_mastery_element_text() {
		return project_mastery_element.getText();
	}
}
