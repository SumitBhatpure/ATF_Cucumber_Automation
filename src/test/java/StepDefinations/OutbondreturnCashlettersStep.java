package StepDefinations;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import Utils.GenericUtils;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.InBoundReturnsPage;
import pageObjects.IncomingPage;
import pageObjects.InreturnCashLattersPage;
import pageObjects.LoginPage;
import pageObjects.PageObjectManager;

public class OutbondreturnCashlettersStep {
	public LoginPage loginpage;
	public HomePage homepage;
	public IncomingPage incomingpage;
	public TextContextSetup textContextSetup;
	public PageObjectManager pageObjectmanager;
	public GenericUtils Genericutils;
	public InreturnCashLattersPage IRcashlettr;
	public InBoundReturnsPage IBReturn;
	public pageObjects.OutboundReturnCashlettesPage OutboundReturnCashlettesPage;

	public OutbondreturnCashlettersStep(TextContextSetup textcontextsetup) {
		this.textContextSetup = textcontextsetup;

	}

	@When("^user click on Outbond return Cashletters$")
	public void user_click_on_outbond_return_cashletters() throws Throwable {
		homepage=textContextSetup.pageObjectManager.getHomePage();
	homepage.OutbondCL_click();
	}
	
	  @When("^user enter OB Amount as \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_ob_amount_as_something_and_something(String amountfrom, String amountto) throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage();
		  OutboundReturnCashlettesPage.EnterOBamountdetails(amountfrom, amountto);
	    }
	  
	  @Then("^verify Drop down field changes to \"([^\"]*)\"$")
	    public void verify_drop_down_field_changes_to_something(String strArg1) throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage(); 
		  Assert.assertEquals(OutboundReturnCashlettesPage.dropcheck(), strArg1);
	    }
	  
	  @When("^user set the operator field to \"([^\"]*)\"$")
	    public void user_set_the_operator_field_to_something(String ReqElementg) throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage(); 
		  OutboundReturnCashlettesPage.SelectdropDownOption(ReqElementg);
	    }
	  
	  @Then("^verify upper range field is cleared$")
	    public void verify_upper_range_field_is_cleared() throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage(); 
		 Assert.assertTrue( OutboundReturnCashlettesPage.verifyUpperField());
	    }
	  
	  @Then("^verify upper range field of \"([^\"]*)\" is cleared$")
	    public void verify_upper_range_field_of_something_is_cleared(String strArg1) throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage();  
		  Assert.assertTrue(OutboundReturnCashlettesPage.verifyTest(strArg1));
	    }
	  
	  @When("^user enter process start date as \"([^\"]*)\" and end date as \"([^\"]*)\"$")
	    public void user_enter_process_start_date_as_something_and_end_date_as_something(String startdate, String enddate) throws Throwable {
		  incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
			incomingpage.EnterProcessDate(startdate, enddate);
	    }
	  
	  @Then("^verify opertor field changes to \"([^\"]*)\" in process date$")
	    public void verify_opertor_field_changes_to_something_in_process_date(String droptext) throws Throwable {
		  incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		  Assert.assertEquals(incomingpage.verifyProcessDatedropText(), droptext);
	    }
	  
	  @Then("^verify upper range field of processdate \"([^\"]*)\" is cleared$")
	    public void verify_upper_range_field_of_processdate_something_is_cleared(String strArg1) throws Throwable {
		  incomingpage = textContextSetup.pageObjectManager.getIncomingPage();
		  Assert.assertTrue(incomingpage.verifyIncomingFields(strArg1));
	    }
	  
	  @Then("^verify all screens are uniquely titled$")
	    public void verify_all_screens_are_uniquely_titled() throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage();  
		  Assert.assertTrue(OutboundReturnCashlettesPage.checkuniquelyTitledResult());
	    }
	  
	  @When("^user enter OB Endpoint details as \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_ob_endpoint_details_as_something_and_something(String endpointfrom, String endpointto) throws Throwable {
		  OutboundReturnCashlettesPage= textContextSetup.pageObjectManager.getOutboundReturnCashlettesPage(); 
		  OutboundReturnCashlettesPage.EnterEndpointdetails(endpointfrom, endpointto);
	    }
}
