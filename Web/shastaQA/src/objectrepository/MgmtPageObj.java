package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MgmtPageObj {
	//Initialize driver
		WebDriver driver;
		public  MgmtPageObj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


	//Don O'Connell - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[1]/div/div[1]/div[1]/h6")
		WebElement don_Name;
		public String donName() {
			return don_Name.getText();
		}
	//Don O'Connell - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[1]/div/div[1]/div[1]/p")
		WebElement don_Title;
		public String donTitle() {
			return don_Title.getText();
		}
		
		
	//Christina Young - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[2]/div[1]/h6")
		WebElement christina_Name;
		public String christinaName() {
			return christina_Name.getText();
		}
	//Christina Young - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[2]/div[1]/p")
		WebElement christina_Title;
		public String christinaTitle() {
			return christina_Title.getText();
		}
		
		
	//Anna Henderson - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[3]/div[1]/h6")
		WebElement anna_Name;
		public String annaName() {
			return anna_Name.getText();
		}
	//Anna Henderson - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[3]/div[1]/p")
		WebElement anna_Title;
		public String annaTitle() {
			return anna_Title.getText();
		}
	
		
	//Chris Milnes - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[4]/div[1]/h6")
		WebElement chris_Name;
		public String chrisName() {
			return chris_Name.getText();
		}
	//Chris Milnes - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[4]/div[1]/p")
		WebElement chris_Title;
		public String chrisTitle() {
			return chris_Title.getText();
		}
		
		
	//Eric Stevenson - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[5]/div[1]/h6")
		WebElement eric_Name;
		public String ericName() {
			return eric_Name.getText();
		}
	//Eric Stevenson - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[5]/div[1]/p")
		WebElement eric_Title;
		public String ericTitle() {
			return eric_Title.getText();                
		}
		
		
	//Jim Edelen - Name 
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[6]/div[1]/h6")                                                                                                                                       
		WebElement jim_Name;
		public String jimName() {
			return jim_Name.getText();
		}
	//Jim Edelen - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[6]/div[1]/p")
		WebElement jim_Title;
		public String jimTitle() {
			return jim_Title.getText();
		}
	
		
	// Mike Benton - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[7]/div[1]/h6")
		WebElement mikeB_Name;
		public String mikeBName() {
			return mikeB_Name.getText();
		}
	//Mike Benton - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[7]/div[1]/p")
		WebElement mikeB_Title;
		public String mikeBTitle() {
			return mikeB_Title.getText();
		}
		
		
	//Mike Longmire - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[8]/div[1]/h6")
		WebElement mikeL_Name;
		public String mikeLName() {
			return mikeL_Name.getText();
		}
	//Mike Longmire - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[8]/div[1]/p")
		WebElement mikeL_Title;
		public String mikeLTitle() {
			return mikeL_Title.getText();
		}
	
		
	//Yuka Ando - Name
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[9]/div[1]/h6")
		WebElement yuka_Name;
		public String yukaName() {
			return yuka_Name.getText();
		}
	//Yuka Ando - Title
		@FindBy (xpath="html/body/div[1]/div[3]/div[1]/div[9]/div[1]/p")
		WebElement yuka_Title;
		public String yukaTitle() {
			return yuka_Title.getText();
		}
}