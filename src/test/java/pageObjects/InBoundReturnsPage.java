package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InBoundReturnsPage {
	WebDriver driver;
	
	
	@FindBy (name="IRItemAmount_from")
	public WebElement IBRtemAmount_from;
	@FindBy (name="IRItemAmount_to")
	public WebElement IBRtemAmount_to;
	
//	@FindBy (name="searchAll")
//	public WebElement searchall;
	
	@FindBy (name="IRImageSequence_from")
	public WebElement IRimageSequence_from;
	
	@FindBy (name="IRImageSequence_to")
	public WebElement IRimageSequence_To;
	
	//InBoundReturns Locators

		
		
		 
		 private By IRAdviceNumberfrom = By.name("IRAdviceNumber_from"); 
		 private By IRAdviceNumberto= By.name("IRAdviceNumber_to"); 
		 private By IRItemAccountNo_from= By.name("IRItemAccountNo_from"); 
		 private By IRItemAccountNo_to = By.name("IRItemAccountNo_to"); 
		 private By IRDepositAccount_from = By.name("IRDepositAccount_from"); 
		 private By IRDepositAccount_to= By.name("IRDepositAccount_to"); 
		 private By IRPostingAccount_from = By.name("IRPostingAccount_from"); 
		 private By IRPostingAccount_to= By.name("IRPostingAccount_to"); 
		 private By IRItemRoutingNo_from= By.name("IRItemRoutingNo_from"); 
		 private By IRItemRoutingNo_to= By.name("IRItemRoutingNo_to"); 
		 private By IRChecknoFrom= By.name("IRItemSerialNumber_from");
		 private By IRChecknoTo = By.name("IRItemSerialNumber_to");
		 private By IRTransactionCode_from= By.name("IRItemProcessCode_from");
		 private By IRTransactionCode_To= By.name("IRItemProcessCode_to");
		 private By RBRunNumber_from= By.name("RBRunNumber_from");
		 private By RBRunNumber_to= By.name("RBRunNumber_to");
		 private By RBItemBundleNumber_from= By.name("RBItemBundleNumber_from");
		 private By RBItemBundleNumber_to= By.name("RBItemBundleNumber_to");
	
		 public InBoundReturnsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public WebDriver EnterRBAmountDeatils(String RBamountFrom, String RBamountlNoTo) {
				driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				IBRtemAmount_from.sendKeys(RBamountFrom);
				IBRtemAmount_to.sendKeys(RBamountlNoTo);
				return driver;
			}
}
