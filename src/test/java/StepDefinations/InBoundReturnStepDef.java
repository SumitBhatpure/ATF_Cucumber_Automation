package StepDefinations;

import Utils.GenericUtils;
import Utils.TextContextSetup;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.InBoundReturnsPage;
import pageObjects.IncomingPage;
import pageObjects.InreturnCashLattersPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class InBoundReturnStepDef {
	public LoginPage loginpage;
	public HomePage homepage;
	public IncomingPage incomingpage;
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectmanager;
	public GenericUtils Genericutils;
	public InreturnCashLattersPage IRcashlettr;
	public InBoundReturnsPage IBReturn;
	public pageObjects.OutboundReturnCashlettesPage OutboundReturnCashlettesPage;


	public InBoundReturnStepDef(TextContextSetup textcontextsetup) {
		this.textContextSetup = textcontextsetup;
//		homepage = textContextSetup.pageObjectManager.getHomePage();
//		IRcashlettr = textContextSetup.pageObjectManager.getInreturnCashLattersPage();
//		loginpage = textContextSetup.pageObjectManager.getLoginPagePage();
//		incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
	}
	
	@When("^user click on InBoundReturn$")
    public void user_click_on_inboundreturn() throws Throwable {
 homepage = textContextSetup.pageObjectManager.getHomePage();
		homepage.InboundReturn_Click();
	 
    }
	@When("^user enter RBamount as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_amount_as_something_and_something(String RBamountfrom, String RBamountto) throws Throwable {
		 IBReturn = textContextSetup.pageObjectManager.getInBoundReturnsPage();
		IBReturn.EnterRBAmountDeatils(RBamountfrom, RBamountto);
    }
}
